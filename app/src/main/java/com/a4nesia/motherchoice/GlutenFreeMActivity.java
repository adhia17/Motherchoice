package com.a4nesia.motherchoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.a4nesia.motherchoice.MotherChoice.addNotif;
import static com.a4nesia.motherchoice.MotherChoice.listNotification;
import static com.a4nesia.motherchoice.MotherChoice.minggu4;
import static com.a4nesia.motherchoice.MotherChoice.progress;

public class GlutenFreeMActivity extends AppCompatActivity {

    private Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gluten_free_m);
        finish = (Button) findViewById(R.id.masak_pizza_selesai);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //listNotification.add(new Resep("Pizza Gluten Free","4"));
                addNotif(new Resep("Pizza Gluten Free","4"));
                minggu4=minggu4+0.5;
                progress=progress+0.5;
                startActivity(new Intent(GlutenFreeMActivity.this, MainActivity.class));
            }
        });
    }
}
