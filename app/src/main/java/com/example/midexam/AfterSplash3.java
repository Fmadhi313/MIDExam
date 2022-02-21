package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfterSplash3 extends Activity {

    Button bttn1,bttn2;
    MediaPlayer mediaPlayer1;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_splash);

        bttn1 = (Button) findViewById(R.id.button4);
        bttn2 = (Button) findViewById(R.id.button5);


        bttn1.setOnClickListener(bttn1L);
        bttn2.setOnClickListener(bttn2L);


        mediaPlayer1 = new MediaPlayer();


        mediaPlayer1 = MediaPlayer.create(this, R.raw.track3);


        playing = 0;
    }

    Button.OnClickListener bttn1L = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view) {

            switch(playing) {
                case 0:
                    mediaPlayer1.start();
                    playing = 1;

                    break;
                case 1:
                    mediaPlayer1.pause();
                    playing = 0;

                    break;
            }


        }
    };
    Button.OnClickListener bttn2L = new Button.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(AfterSplash3.this,MainActivity.class));



        }
    };

}