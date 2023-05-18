package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class cityTravel extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    //1 merchant: Tourmalina, Sapphira, Diamondaria, Amethyst City, Agatia
    //2 merchants: Rubya, Emeraldis, Jade Empire, Onyx Coast, Opalancy
    int cityChoiceInt = 0;
    public String cityChoiceString;
    public cityArrival1Merchant cityArrival1Merchant;
    public cityArrival2Merchants cityArrival2Merchants;
    Button cityPickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_travel);

        cityPickButton = findViewById(R.id.donePickCity);
        Spinner citySpinner = findViewById(R.id.citySpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.city_names_list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        citySpinner.setAdapter(adapter);
        citySpinner.setOnItemSelectedListener(this);



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //TODO: fill out remaining switch cases and ensure they have the appropriate loadCity
        // method in their class.
        cityChoiceString = parent.getItemAtPosition(position).toString();
        cityChoiceInt = (int) parent.getItemIdAtPosition(position);
        switch (cityChoiceInt) {
            case 0:
                //rubya
            case 4:
            case 6:
            case 7:
            case 8:
                /*cityPickButton.setOnClickListener((View v) -> startActivity(new Intent(cityTravel.this,
                        cityArrival1Merchant.class)));*/
                cityPickButton.setOnClickListener((View v) -> startActivity(new Intent(cityTravel.this,
                        cityArrival1Merchant.class)));
                break;
            case 1:
                //tourmalina
            case 2:
                cityPickButton.setOnClickListener((View v) -> {
                    cityArrival1Merchant.loadSapphira();
                    startActivity(new Intent(cityTravel.this,
                            cityArrival1Merchant.class));
                });
            case 3:



            case 5:
            case 9:
            case 10:
                cityPickButton.setOnClickListener((View v) -> startActivity(new Intent(cityTravel.this,
                        cityArrival2Merchants.class)));
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
