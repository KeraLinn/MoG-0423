package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class startNewGame extends AppCompatActivity {
    /*MediaPlayer mediaPlayer;

    public void setMusic() {
        mediaPlayer.selectTrack(R.raw.jade_empire_theme);
        *//*if (mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.jade_empire_theme);*//*
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }*/
    TextView goalTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_start_game);

        goalTextView = findViewById(R.id.goalTextView);

        //setMusic();
       // mediaPlayer = MediaPlayer.create(this,R.raw.jade_empire_theme);*/


        Button continueButton = findViewById(R.id.continueButton);
        continueButton.setOnClickListener((View v) -> startActivity(new Intent(startNewGame.this,
                cityArrival1Merchant.class
                )));

    }

}
