package com.a4nesia.motherchoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KebabActivity extends AppCompatActivity {
    private Button mulaimasak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebab);
        mulaimasak = (Button) findViewById(R.id.masak_kebab);
        mulaimasak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KebabActivity.this, KebabMActivity.class); // dari MainActivity/posisi saat ini ke SecondActivity
                startActivity(intent);
            }
        });
    }
}
