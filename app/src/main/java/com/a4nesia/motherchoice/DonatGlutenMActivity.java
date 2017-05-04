package com.a4nesia.motherchoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.a4nesia.motherchoice.MotherChoice.addNotif;
import static com.a4nesia.motherchoice.MotherChoice.listNotification;
import static com.a4nesia.motherchoice.MotherChoice.minggu2;
import static com.a4nesia.motherchoice.MotherChoice.progress;

public class DonatGlutenMActivity extends AppCompatActivity {

    private Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donat_gluten_m);
        finish = (Button) findViewById(R.id.masak_donat_selesai);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //listNotification.add(new Resep("Dougnut Gluten Free","2"));
                addNotif(new Resep("Dougnut Gluten Free","2"));
                minggu2=minggu2+1;
                progress=progress+1;
                startActivity(new Intent(DonatGlutenMActivity.this, MainActivity.class));
            }
        });

    }
}
