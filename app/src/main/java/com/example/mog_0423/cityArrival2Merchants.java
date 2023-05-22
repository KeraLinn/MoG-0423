package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cityArrival2Merchants extends AppCompatActivity {
    //2 merchants: Rubya, Emeraldis, Jade Empire, Onyx Coast, Opalancy

    TextView welcomeText;
    TextView cityText;
    ImageView merchantImage1 = findViewById(R.id.merchant1);
    ImageView merchantImage2 = findViewById(R.id.merchant2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_city_arrival_2_merchants);
        Button tradeButton = findViewById(R.id.tradebutton);
        Button tradeButton2 = findViewById(R.id.button2);
        Button nextCityButton = findViewById(R.id.nextCityButton);

        loadJade();

        tradeButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival2Merchants.this,
                merchantInteractionUserBuys.class
        )));
        tradeButton2.setOnClickListener((View v) -> startActivity(new Intent(cityArrival2Merchants.this,
                merchantInteractionUserBuys.class
        )));
        nextCityButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival2Merchants.this,
                cityTravel.class
        )));
    }
    public void loadJade() {
        welcomeText.setText(R.string.jadeWelcome);
        cityText.setText(R.string.jadeText);
        merchantImage1.setBackgroundColor(getColor(R.color.BurntSienna));
        merchantImage1.setImageResource(R.drawable.icons8_merchant_m);
        merchantImage2.setBackgroundColor(getColor(R.color.Xanthous));
        merchantImage2.setImageResource(R.drawable.icons8_merchant_f_2);
    }

}
