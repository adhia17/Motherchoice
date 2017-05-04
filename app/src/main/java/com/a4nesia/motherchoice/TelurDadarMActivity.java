package com.a4nesia.motherchoice;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import static com.a4nesia.motherchoice.MotherChoice.addNotif;
        import static com.a4nesia.motherchoice.MotherChoice.listNotification;
        import static com.a4nesia.motherchoice.MotherChoice.minggu3;
        import static com.a4nesia.motherchoice.MotherChoice.progress;

public class TelurDadarMActivity extends AppCompatActivity {

    private Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telur_dadar_m);
        finish = (Button) findViewById(R.id.masak_telurdadar_selesai);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //listNotification.add(new Resep("Telur Dadar","3"));
                addNotif(new Resep("Telur Dadar","3"));
                minggu3=minggu3+1;
                progress=progress+1;
                startActivity(new Intent(TelurDadarMActivity.this, MainActivity.class));
            }
        });
    }
}
