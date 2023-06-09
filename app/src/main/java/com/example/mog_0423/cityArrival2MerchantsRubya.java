package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cityArrival2MerchantsRubya extends AppCompatActivity {
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
        merchantImage1.setImageResource(R.drawable.icons8_merchant_f);
        merchantImage2.setImageResource(R.drawable.icons8_avatar_64_m_blackhat);
        welcomeText = findViewById(R.id.textView);
        cityText = findViewById(R.id.textView6);
        welcomeText.setText(R.string.rubyaWelcome);
        cityText.setText(R.string.rubyaText);
        tradeButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival2MerchantsRubya.this,
                merchantInteractionUserBuysRubya1.class
        )));
        tradeButton1.setOnClickListener((View v) -> startActivity(new Intent(cityArrival2MerchantsRubya.this,
                merchantInteractionUserBuysRubya2.class
        )));
        tradeButton2.setOnClickListener((View v) -> startActivity(new Intent(cityArrival2MerchantsRubya.this, merchantInteractionUserBuysRubya1.class)));
        nextCityButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival2MerchantsRubya.this,
                cityTravel.class
        )));
    }
}
