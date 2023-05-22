package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class city1merchexamplearrival extends AppCompatActivity {

    //1 merchant: Tourmalina, Sapphira, Diamondaria, Amethyst City, Agatia

    TextView welcomeText;
    TextView cityText;
    ImageView merchantImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_city1merch);

        welcomeText = findViewById(R.id.textView);
        cityText = findViewById(R.id.textView6);
        merchantImage = findViewById(R.id.merchant1);
        loadAmethyst();

        Button tradeButton = findViewById(R.id.tradebutton);
        Button nextCityButton = findViewById(R.id.nextCityButton);



        tradeButton.setOnClickListener((View v) -> startActivity(new Intent(city1merchexamplearrival.this,
                city1merchexample.class
        )));
        nextCityButton.setOnClickListener((View v) -> startActivity(new Intent(city1merchexamplearrival.this,
                cityTravel.class
        )));
    }

    public void loadAmethyst() {
        welcomeText.setText(R.string.amethystWelcome);
        cityText.setText(R.string.amethystText);
        //merchantImage.setBackgroundColor(getColor(R.color.Xanthous));
        merchantImage.setImageResource(R.drawable.icons8_merchant_m);
    }

}
