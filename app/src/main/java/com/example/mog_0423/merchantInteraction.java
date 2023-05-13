package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;

public class merchantInteraction extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int playerBuying;
    int playerSelling;

    ChipGroup chipGroup;
    Chip chippy;


    Commodity commodity;
    SpinnerAdapter spinnerAdapter;
    //Commodity[] myCommodityArray = new Commodity[5];
    public ArrayList<Commodity> commodityArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_trading);

        setUpChips();

        RecyclerView recyclerView = findViewById(R.id.tradingRecyclerView);
        merchantStockRecyclerViewAdapter stockAdapter = new merchantStockRecyclerViewAdapter(this,
                commodityArrayList,spinnerAdapter);
        recyclerView.setAdapter(stockAdapter);;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        /*Spinner numberSpinner = findViewById(R.id.qtySpinner);
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.commodity_names_list
                , android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        numberSpinner.setAdapter(spinnerAdapter);
        numberSpinner.setOnItemSelectedListener(this);
*/
        /*Button doneButton = findViewById(R.id.completeTradeButton);
        doneButton.setOnClickListener((View v) -> {
            completeTransaction();

            startActivity(new Intent(merchantInteraction.this,
                    cityArrival.class));
        });*/

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
