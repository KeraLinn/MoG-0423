package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Dictionary;

public class merchantInteraction extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_trading);

        setUpTradingAspects();



        Button doneButton = findViewById(R.id.completeTradeButton);
        doneButton.setOnClickListener((View v) -> {


            startActivity(new Intent(merchantInteraction.this,
                    cityArrival.class));
        });

    }

    public void setUpTradingAspects(){
        NumberPicker merchantPickerItem1 = new NumberPicker(this);
        merchantPickerItem1 = findViewById(R.id.merPick1);

        NumberPicker merchantPickerItem2 = new NumberPicker(this);
        merchantPickerItem2 = findViewById(R.id.merPick2);
        NumberPicker merchantPickerItem3 = new NumberPicker(this);
        merchantPickerItem3 = findViewById(R.id.merPick3);
        NumberPicker playerPickerItem1 = new NumberPicker(this);
        playerPickerItem1 = findViewById(R.id.merPick4);
        NumberPicker playerPickerItem2 = new NumberPicker(this);
        playerPickerItem2 = findViewById(R.id.merPick5);
        NumberPicker playerPickerItem3 = new NumberPicker(this);
        playerPickerItem3 = findViewById(R.id.merPick6);
    }

}
