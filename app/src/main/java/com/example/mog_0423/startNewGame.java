package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class startNewGame extends AppCompatActivity {

    Button continueButton = findViewById(R.id.continueButton);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_start_game);

        continueButton.setOnClickListener((View v) -> startActivity(new Intent(startNewGame.this,
                cityArrival.class
                )));

    }

}
