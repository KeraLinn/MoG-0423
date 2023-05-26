package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

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
    int randomNum;
    Random rand = new Random();
    int max = 10; int min = 1;
    Button continueButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_start_game);

        goalTextView = findViewById(R.id.goalTextView);

        //setMusic();
       // mediaPlayer = MediaPlayer.create(this,R.raw.jade_empire_theme);*/
        getFirstCity();
        continueButton = findViewById(R.id.continueButton);
        continueButton.setOnClickListener((View v) -> {
            startActivity(intent);
        });
    }

    private void getFirstCity() {
        intent = new Intent();
        randomNum = rand.nextInt(max - min + 1) + min;
        switch(randomNum){
            case 1:
                intent.setClass(startNewGame.this,cityArrival2MerchantsRubya.class);
                break;
            case 2: intent.setClass(startNewGame.this, cityArrival1MerchantTourmalina.class);
                break;
            case 3: intent.setClass(startNewGame.this,cityArrival1MerchantSapphira.class);
                break;
            case 4: intent.setClass(startNewGame.this, cityArrival2MerchantsEmeraldis.class);
                break;
            case 5: intent.setClass(startNewGame.this,cityArrival1MerchantDiamondaria.class);
                break;
            case 6: intent.setClass(startNewGame.this, cityArrival2MerchantsJadeEmpire.class);
                break;
            case 7: intent.setClass(startNewGame.this, cityArrival2MerchantsOnyxCoast.class);
                break;
            case 8: intent.setClass(startNewGame.this, cityArrival2MerchantsOpalancy.class);
                break;
            case 9: intent.setClass(startNewGame.this, cityArrival1MerchantAmethystCity.class);
                break;
            case 10: intent.setClass(startNewGame.this, cityArrival1MerchantAgatia.class);
                break;
        }
    }

}
