package com.a4nesia.motherchoice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PointFragment extends Fragment {

    private TextView score;
    private Button play;
    private Button buy;
    private Button voucher;
    private RecyclerView recyclerView;
    private VoucherAdapter adapter1;
    private VoucherAdapter adapter2;
    private ArrayList<Voucher> voucherList = new ArrayList<>();
    private ArrayList<Voucher> choosedVoucher = new ArrayList<>();

    public PointFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.fragment_point, container, false);
        score = (TextView) rootView.findViewById(R.id.point_point);
        play = (Button) rootView.findViewById(R.id.point_play);
        buy = (Button) rootView.findViewById(R.id.point_buy);
        voucher = (Button) rootView.findViewById(R.id.point_voucher);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.point_recycler_view);
        adapter1 = new VoucherAdapter(voucherList, Glide.with(getActivity()));
        adapter2 = new VoucherAdapter(choosedVoucher, Glide.with(getActivity()));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter1);
        initVoucher();

        Bundle bundle = this.getArguments();
        if(bundle != null){
            score.setText(String.valueOf(bundle.getInt("score",0)));
        }

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new GachaFragment()).addToBackStack( "tag" ).commit();
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setAdapter(adapter1);
                adapter1.notifyDataSetChanged();
            }
        });
        voucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChoosedVoucher();
                recyclerView.setAdapter(adapter2);
                adapter2.notifyDataSetChanged();
            }
        });



        return rootView;
    }

    public void initVoucher(){
        voucherList.add(new Voucher("Voucher 1",R.drawable.lottervocher));
        voucherList.add(new Voucher("Voucher 2",R.drawable.limapuluhkvocher));
        voucherList.add(new Voucher("Voucher 3",R.drawable.vochertiga));
    }

    public void getChoosedVoucher(){
        choosedVoucher.clear();
        for(Voucher v : voucherList){
            if(v.isStatus()) choosedVoucher.add(v);
        }
    }

}
