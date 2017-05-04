package com.a4nesia.motherchoice;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import static com.a4nesia.motherchoice.MotherChoice.minggu1;
import static com.a4nesia.motherchoice.MotherChoice.minggu2;
import static com.a4nesia.motherchoice.MotherChoice.minggu3;
import static com.a4nesia.motherchoice.MotherChoice.minggu4;
import static com.a4nesia.motherchoice.MotherChoice.progress;


/**
 * A simple {@link Fragment} subclass.
 */
public class LaporanFragment extends Fragment {

    private ImageView imgProgress;
    private Button pengerjaan;
    private Button laporanKomunitas;
    private ImageView squareBar1;
    private ImageView squareBar2;
    private ImageView squareBar3;
    private ImageView squareBar4;
    private LinearLayout squareBar;

    public LaporanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_laporan, container, false);
        imgProgress = (ImageView) rootView.findViewById(R.id.progress_bar);
        pengerjaan = (Button) rootView.findViewById(R.id.pengerjaan);
        laporanKomunitas = (Button) rootView.findViewById(R.id.laporankomunitas);
        squareBar = (LinearLayout) rootView.findViewById(R.id.square_bar);
        squareBar1 = (ImageView) rootView.findViewById(R.id.square_bar1);
        squareBar2 = (ImageView) rootView.findViewById(R.id.square_bar2);
        squareBar3 = (ImageView) rootView.findViewById(R.id.square_bar3);
        squareBar4 = (ImageView) rootView.findViewById(R.id.square_bar4);

        refreshPengerjaan();

        pengerjaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refreshPengerjaan();
            }
        });
        laporanKomunitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refreshLaporanKomunitas();
            }
        });

        return rootView;
    }

    public void refreshPengerjaan(){
        squareBar.setVisibility(View.INVISIBLE);
        imgProgress.setVisibility(View.VISIBLE);
        if(progress >= 2) imgProgress.setImageDrawable(getResources().getDrawable(R.drawable.progres25));
        if(progress >= 4) imgProgress.setImageDrawable(getResources().getDrawable(R.drawable.progres50));
        if(progress >= 6) imgProgress.setImageDrawable(getResources().getDrawable(R.drawable.progres75));
        if(progress >= 10) imgProgress.setImageDrawable(getResources().getDrawable(R.drawable.progres100));
    }

    public void refreshLaporanKomunitas(){
        imgProgress.setVisibility(View.INVISIBLE);
        squareBar.setVisibility(View.VISIBLE);
        if(minggu1 >= 2) squareBar1.setImageDrawable(getResources().getDrawable(R.drawable.laporan25));
        if(minggu2 >= 2) squareBar2.setImageDrawable(getResources().getDrawable(R.drawable.laporan25));
        if(minggu3 >= 2) squareBar3.setImageDrawable(getResources().getDrawable(R.drawable.laporan25));
        if(minggu4 >= 2) squareBar4.setImageDrawable(getResources().getDrawable(R.drawable.laporan25));

    }

}
