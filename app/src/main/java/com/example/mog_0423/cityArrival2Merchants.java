package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class cityArrival2Merchants extends AppCompatActivity {
    //2 merchants: Rubya, Emeraldis, Jade Empire, Onyx Coast, Opalancy

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.screen_city_arrival_2_merchants);

        Button tradeButton = findViewById(R.id.tradebutton);
        Button nextCityButton = findViewById(R.id.nextCityButton);



        tradeButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival2Merchants.this,
                merchantInteractionUserBuys.class
        )));
        nextCityButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival2Merchants.this,
                cityTravel.class
        )));
    }

}
