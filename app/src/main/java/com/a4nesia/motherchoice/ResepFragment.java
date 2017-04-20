package com.a4nesia.motherchoice;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResepFragment extends Fragment {

    public ResepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Button fragbutton;
        View rootView = inflater.inflate(R.layout.fragment_resep, container, false);
        //ImageView imageView = (ImageView) rootView.findViewById(R.id.ic_daftarmenu);
        //Glide.with(this).load("http://i1339.photobucket.com/albums/o706/adhia17/menu%201_zpshcwdrunn.jpg").into(imageView);
        fragbutton = (Button) rootView.findViewById(R.id.minggu_1);
        //kita set onClick si button start
        // setelah kita set onClick si Button start, kita pergi ke
        // Activity selanjutnya dengan bantuan INTENT

        fragbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Minggu1Activity.class); // dari MainActivity/posisi saat ini ke SecondActivity
                startActivity(intent);
            }
        });
        fragbutton = (Button) rootView.findViewById(R.id.minggu_2);
        //kita set onClick si button start
        // setelah kita set onClick si Button start, kita pergi ke
        // Activity selanjutnya dengan bantuan INTENT

        fragbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Minggu2Activity.class); // dari MainActivity/posisi saat ini ke SecondActivity
                startActivity(intent);
            }
        });
        fragbutton = (Button) rootView.findViewById(R.id.minggu_3);
        //kita set onClick si button start
        // setelah kita set onClick si Button start, kita pergi ke
        // Activity selanjutnya dengan bantuan INTENT

        fragbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Minggu3Activity.class); // dari MainActivity/posisi saat ini ke SecondActivity
                startActivity(intent);
            }
        });
        fragbutton = (Button) rootView.findViewById(R.id.minggu_4);
        //kita set onClick si button start
        // setelah kita set onClick si Button start, kita pergi ke
        // Activity selanjutnya dengan bantuan INTENT

        fragbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Minggu4Activity.class); // dari MainActivity/posisi saat ini ke SecondActivity
                startActivity(intent);
            }
        });

        return rootView;
    }

}
