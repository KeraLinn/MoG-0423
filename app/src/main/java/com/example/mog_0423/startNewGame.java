package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class startNewGame extends AppCompatActivity {

    TextView goalTextView;
    Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_start_game);

        goalTextView = findViewById(R.id.goalTextView);

        continueButton = findViewById(R.id.continueButton);
        continueButton.setOnClickListener((View v) -> {
            startActivity(new Intent(startNewGame.this,startingInventory.class));
        });
    }
}
