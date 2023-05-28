package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cityArrival1MerchantAmethystCity extends AppCompatActivity {
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
        welcomeText.setText(R.string.amethystWelcome);
        cityText.setText(R.string.amethystText);
        merchantImage.setImageResource(R.drawable.icons8_avatar_64_f_red);
        tradeButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival1MerchantAmethystCity.this,
                merchantInteractionUserBuysAmethystCity.class)));
        nextCityButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival1MerchantAmethystCity.this,
                cityTravel.class)));
    }
}
