package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cityArrival2MerchantsEmeraldis extends AppCompatActivity {
    //2 merchants: Rubya, Emeraldis, Jade Empire, Onyx Coast, Opalancy

    TextView welcomeText;
    TextView cityText;
    Button tradeButton, tradeButton1, nextCityButton;
    ImageView merchantImage1, merchantImage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_city_arrival_2_merchants);
        tradeButton = findViewById(R.id.tradebutton);
        tradeButton1 = findViewById(R.id.button2);
        Button tradeButton2 = findViewById(R.id.letstrade);
        nextCityButton = findViewById(R.id.nextCityButton);
        merchantImage1 = findViewById(R.id.merchant1);
        merchantImage2 = findViewById(R.id.merchant2);
        merchantImage1.setImageResource(R.drawable.icons8_avatar_64_f_braids);
        merchantImage2.setImageResource(R.drawable.icons8_avatar_64_mf);
        welcomeText = findViewById(R.id.textView);
        cityText = findViewById(R.id.textView6);
        welcomeText.setText(R.string.emeraldisWelcome);
        cityText.setText(R.string.emeraldisText);
        tradeButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival2MerchantsEmeraldis.this,
                merchantInteractionUserBuysSapphira.class
        )));
        tradeButton1.setOnClickListener((View v) -> startActivity(new Intent(cityArrival2MerchantsEmeraldis.this,
                merchantInteractionUserBuysSapphira.class
        )));
        tradeButton2.setOnClickListener((View v) -> startActivity(new Intent(cityArrival2MerchantsEmeraldis.this, merchantInteractionUserBuysEmeraldis1.class)));
        nextCityButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival2MerchantsEmeraldis.this,
                cityTravel.class
        )));
    }
}
