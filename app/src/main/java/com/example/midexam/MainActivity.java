package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

                finish();
                startActivity(new Intent(MainActivity.this, AfterSplash.class));
            }
        };
        Timer openning = new Timer();
        openning.schedule(timerTask, 9000);

    }
}