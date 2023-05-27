package com.example.mog_0423;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class gameOver extends AppCompatActivity {
    playerClass playerClass = new playerClass();
    int purse = playerClass.getPlayerPurse();
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (purse <= 0) {
            player.selectTrack(R.raw.game_lost);
            setContentView(R.layout.screen_game_lost);
            //player = MediaPlayer.create(gameOver.this, R.raw.game_lost);
            player.start();
        }
        else {
            setContentView(R.layout.screen_game_won);
            player = MediaPlayer.create(gameOver.this, R.raw.success_fanfare);
            player.start();
        }

        Button playagain = findViewById(R.id.playAgainButton);
        playagain.setOnClickListener((v -> {
            startActivity(new Intent(gameOver.this, startNewGame.class));
        }));

        Button exitbutton = findViewById(R.id.exitButton);
        exitbutton.setOnClickListener((View v) -> startActivity(new Intent(gameOver
                .this, MainActivity.class)));

    }
}