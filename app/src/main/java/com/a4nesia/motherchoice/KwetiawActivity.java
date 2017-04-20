package com.a4nesia.motherchoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class KwetiawActivity extends AppCompatActivity {
    private Button mulaimasak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kwetiaw);
        mulaimasak = (Button) findViewById(R.id.masak_kwetiaw);
        mulaimasak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KwetiawActivity.this, KwetiawMActivity.class); // dari MainActivity/posisi saat ini ke SecondActivity
                startActivity(intent);
            }
        });

      //  ImageView imageView = (ImageView) findViewById(R.id.ic_kwetiaw);

     //   Glide.with(this).load("https://dl.dropboxusercontent.com/content_link/8slCUKiLPy6LK1N0m2goo1XELj2l3dOeB9USjC8Z97GNG8pGPir71o3s8TVO5nxD/file").into(imageView);
    }
}
