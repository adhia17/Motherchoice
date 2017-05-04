package com.a4nesia.motherchoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.a4nesia.motherchoice.MotherChoice.addNotif;
import static com.a4nesia.motherchoice.MotherChoice.listNotification;
import static com.a4nesia.motherchoice.MotherChoice.minggu1;
import static com.a4nesia.motherchoice.MotherChoice.progress;

public class KwetiawMActivity extends AppCompatActivity {

    private Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kwetiaw_m);
        finish = (Button) findViewById(R.id.masak_kwetiaw_selesai);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //listNotification.add(new Resep("Kwetiaw","1"));
                addNotif(new Resep("Kwetiaw","1"));
                minggu1=minggu1+1;
                progress=progress+1;
                startActivity(new Intent(KwetiawMActivity.this, MainActivity.class));
            }
        });
    }
}
