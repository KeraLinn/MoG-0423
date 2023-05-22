package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class gameWon extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.screen_game_won);

        Button playagain = findViewById(R.id.playAgainButton);
        playagain.setOnClickListener((v -> {
            startActivity(new Intent(gameWon.this, startNewGame.class));
        }));

        Button exitbutton = findViewById(R.id.exitButton);
        exitbutton.setOnClickListener((View v) -> startActivity(new Intent(gameWon
                .this, MainActivity.class)));

    }
}
