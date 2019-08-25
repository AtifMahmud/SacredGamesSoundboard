package com.example.atifm.soundboard;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.media.MediaPlayer;


public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    Button teetar;
    Button dubjaa;
    Button saal;
    Button chaand;
    Button teetarGand;
    Button chaaku;
    Button daring;
    MediaPlayer mp;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        /* Teetar */
        teetar = (Button) this.findViewById(R.id.teetar);
        teetar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp = MediaPlayer.create(getApplicationContext(), R.raw.teetar);
                mp.start();
            }
        });

        /* Doob jaa */
        dubjaa = (Button) this.findViewById(R.id.dubjaa);
        dubjaa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp = MediaPlayer.create(getApplicationContext(), R.raw.dubjaa);
                mp.start();
            }
        });

        /* 188 saal */
        saal = (Button) this.findViewById(R.id.saal);
        saal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.saal);
                mp.start();
            }
        });

        /* 188 saal */
        chaand = (Button) this.findViewById(R.id.chaand);
        chaand.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp = MediaPlayer.create(getApplicationContext(), R.raw.chaand);
                mp.start();
            }
        });

        /* Teeno teetar gaand mein */
        teetarGand = (Button) this.findViewById(R.id.teetargand);
        teetarGand.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp = MediaPlayer.create(getApplicationContext(), R.raw.teetargand);
                mp.start();
            }
        });

        /* Chaaku leke */
        chaaku = (Button) this.findViewById(R.id.chaakugala);
        chaaku.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp = MediaPlayer.create(getApplicationContext(), R.raw.chaakugala);
                mp.start();
            }
        });

        /* Zinda Daring */
        daring = (Button) this.findViewById(R.id.daring);
        daring.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp = MediaPlayer.create(getApplicationContext(), R.raw.daring);
                mp.start();
            }
        });
    }
}
