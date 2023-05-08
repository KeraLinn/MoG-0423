package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Dictionary;

public class merchantInteraction extends AppCompatActivity {
    int playerBuying;
    int playerSelling;
    NumberPicker merchantPickerItem1 = new NumberPicker(this);
    NumberPicker merchantPickerItem2 = new NumberPicker(this);
    NumberPicker merchantPickerItem3 = new NumberPicker(this);
    NumberPicker playerPickerItem1 = new NumberPicker(this);
    NumberPicker playerPickerItem2 = new NumberPicker(this);
    NumberPicker playerPickerItem3 = new NumberPicker(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_trading);


        merchantPickerItem1 = findViewById(R.id.merPick1);
        merchantPickerItem2 = findViewById(R.id.merPick2);
        merchantPickerItem3 = findViewById(R.id.merPick3);
        playerPickerItem1 = findViewById(R.id.merPick4);
        playerPickerItem2 = findViewById(R.id.merPick5);
        playerPickerItem3 = findViewById(R.id.merPick6);


        Button doneButton = findViewById(R.id.completeTradeButton);
        doneButton.setOnClickListener((View v) -> {
            completeTransaction();

            startActivity(new Intent(merchantInteraction.this,
                    cityArrival.class));
        });

    }

    private void completeTransaction() {
        playerBuying =
                merchantPickerItem1.getValue() + merchantPickerItem2.getValue() + merchantPickerItem3.getValue();
        playerSelling =
                playerPickerItem1.getValue() + playerPickerItem2.getValue() + playerPickerItem3.getValue();

    }
}
