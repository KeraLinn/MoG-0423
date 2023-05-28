package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cityArrival1MerchantAgatia extends AppCompatActivity {
    //1 merchant: Tourmalina, Sapphira, Diamondaria, Amethyst City, Agatia
    TextView welcomeText;
    TextView cityText;
    ImageView merchantImage;
    Button tradeButton, nextCityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_city_arrival_1_merchant);
        welcomeText = findViewById(R.id.textView);
        cityText = findViewById(R.id.textView6);
        merchantImage = findViewById(R.id.merchant1);
        tradeButton = findViewById(R.id.tradebutton);
        nextCityButton = findViewById(R.id.nextCityButton);
        welcomeText.setText(R.string.agatiaWelcome);
        cityText.setText(R.string.agatiaText);
        merchantImage.setImageResource(R.drawable.icons8_avatar_64_m_greysuit);
        tradeButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival1MerchantAgatia.this,
                merchantInteractionUserBuysAgatia.class)));
        nextCityButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival1MerchantAgatia.this,
                cityTravel.class)));
    }
}
