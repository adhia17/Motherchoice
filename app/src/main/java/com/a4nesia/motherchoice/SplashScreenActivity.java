package com.a4nesia.motherchoice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashScreenActivity extends AppCompatActivity {

    private static int splashInterval = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent
                //jeda selesai Splashscreen
                finish();
            }
        }, splashInterval);
        /*
        getSharedPreferences("LAPORAN", MODE_APPEND).edit().putInt("KWETIAW", 0).commit();
        getSharedPreferences("LAPORAN", MODE_APPEND).edit().putInt("MIEBASIL", 0).commit();
        getSharedPreferences("LAPORAN", MODE_APPEND).edit().putInt("KUEKELAPA", 0).commit();
        getSharedPreferences("LAPORAN", MODE_APPEND).edit().putInt("NASIGORENG", 0).commit();
        getSharedPreferences("LAPORAN", MODE_APPEND).edit().putInt("DONAT", 0).commit();
        getSharedPreferences("LAPORAN", MODE_APPEND).edit().putInt("PIZZA", 0).commit();
        getSharedPreferences("LAPORAN", MODE_APPEND).edit().putInt("NUGGET", 0).commit();
        getSharedPreferences("LAPORAN", MODE_APPEND).edit().putInt("TELURDADAR", 0).commit(); */
    };
}

