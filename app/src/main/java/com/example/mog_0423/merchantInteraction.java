package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;

public class merchantInteraction extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int playerBuying;
    int playerSelling;
    int[] myNumArray = {1,2,3,4,5,6,7,8,9,10};
    ChipGroup chipGroup;
    Chip chippy;


    Commodity commodity;
    //Commodity[] myCommodityArray = new Commodity[5];
    public ArrayList<Commodity> commodityArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_trading);

        setUpChips();
        Spinner numberSpinner = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.commodity_names_list
                , android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        numberSpinner.setAdapter(adapter);
        numberSpinner.setOnItemSelectedListener(this);

        Button doneButton = findViewById(R.id.completeTradeButton);
        doneButton.setOnClickListener((View v) -> {
            completeTransaction();

            startActivity(new Intent(merchantInteraction.this,
                    cityArrival.class));
        });

    }

    private void setUpChips() {
        //getMerchantStock();
        chippy.setText(commodity.getCommodityName());
        //needs to be drawable to set? chippy.setChipIcon(commodity.getCommodityImage());
    }

    private void completeTransaction() {
        /*playerBuying =
                merchantPickerItem1.getValue() + merchantPickerItem2.getValue() + merchantPickerItem3.getValue();
        playerSelling =
                playerPickerItem1.getValue() + playerPickerItem2.getValue() + playerPickerItem3.getValue();*/

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        parent.getItemAtPosition(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        parent.getItemIdAtPosition(0);
    }
}
