package com.example.mog_0423;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_home);



        Button newGameButton = findViewById(R.id.newGameButton);
        newGameButton.setOnClickListener((View v)-> startActivity(new Intent(MainActivity.this,
                createNewGame.class)));
        Button continueGameButton = findViewById(R.id.continueButton);
        continueGameButton.setOnClickListener((View v) -> startActivity(new Intent(MainActivity
                .this, cityArrival.class)));
        Button tempButton = findViewById(R.id.tempButton);
        tempButton.setOnClickListener((View v) -> startActivity(new Intent(MainActivity.this,
                CommodityRecyclerView.class)));
    }

}