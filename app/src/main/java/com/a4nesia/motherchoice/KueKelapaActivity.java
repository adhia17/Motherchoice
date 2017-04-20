package com.a4nesia.motherchoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KueKelapaActivity extends AppCompatActivity {
    private Button mulaimasak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kue_kelapa);
        mulaimasak = (Button) findViewById(R.id.masak_kelapa);
        mulaimasak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KueKelapaActivity.this, KueKelapaMActivity.class); // dari MainActivity/posisi saat ini ke SecondActivity
                startActivity(intent);
            }
        });
    }
}
