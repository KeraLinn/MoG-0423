package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class gameOver extends AppCompatActivity {
    playerClass playerClass = new playerClass();
    int purse = playerClass.getPlayerPurse();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (purse <= 0)
            setContentView(R.layout.screen_game_lost);
        else {
            setContentView(R.layout.screen_game_won);
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