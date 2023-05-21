package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cityArrival1Merchant extends AppCompatActivity {

    //1 merchant: Tourmalina, Sapphira, Diamondaria, Amethyst City, Agatia

    TextView welcomeText;
    TextView cityText;
    ImageView merchantImage;

    public void loadSapphira() {
        welcomeText.setText(R.string.sapphiraWelcome);
        cityText.setText(R.string.sapphiraText);
        merchantImage.setBackgroundColor(getColor(R.color.Xanthous));
        merchantImage.setImageResource(R.drawable.icons8_merchant_f);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.screen_city_arrival_1_merchant);

        welcomeText = findViewById(R.id.textView);
        cityText = findViewById(R.id.textView6);
        merchantImage = findViewById(R.id.imageView);

        Button tradeButton = findViewById(R.id.tradebutton);
        Button nextCityButton = findViewById(R.id.nextCityButton);



        tradeButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival1Merchant.this,
                merchantInteractionUserBuys.class
        )));
        nextCityButton.setOnClickListener((View v) -> startActivity(new Intent(cityArrival1Merchant.this,
                cityTravel.class
        )));
    }



}
