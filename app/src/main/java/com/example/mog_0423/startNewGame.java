package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class startNewGame extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_start_game);

        Merchant merchant = new Merchant("","","",0);
        //merchant.getAllMerchants();
        /*Commodity commodity = new Commodity("","",0,0);
        commodity.getAllCommodities();*/

        Button continueButton = findViewById(R.id.continueButton);
        continueButton.setOnClickListener((View v) -> startActivity(new Intent(startNewGame.this,
                cityArrival.class
                )));

    }

}
