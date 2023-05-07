package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class cityArrival extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_city_arrival_1_merchant);

        Button tradeButton = findViewById(R.id.tradebutton);
        Button nextCityButton = findViewById(R.id.nextCityButton);



        tradeButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival.this,
                merchantInteraction.class
        )));
        nextCityButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival.this,
                 cityArrival.class
        )));

    }

}
