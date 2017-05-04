package com.a4nesia.motherchoice;


import android.content.Intent;
import android.icu.util.TimeUnit;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.concurrent.Delayed;


/**
 * A simple {@link Fragment} subclass.
 */
public class GachaFragment extends Fragment {


    private TextView gacha;

    public GachaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_create_score, container, false);
        gacha = (TextView) rootView.findViewById(R.id.gacha);

        gacha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doGacha();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("score", Integer.valueOf(gacha.getText().toString()));
                Fragment fragment = new PointFragment();
                fragment.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, fragment).addToBackStack( "tag" ).commit();
            }
        });

        return rootView;
    }

    public String generateRandomNumber(){
        double random = Math.random();
        if(random >= 0 && random <= 0.33) return "30";
        else if(random > 0.33 && random <= 0.66) return "60";
        else return "90";
    }

    public void doGacha(){
        gacha.setText(String.valueOf((int)(Math.random()*100)));
    }

}
