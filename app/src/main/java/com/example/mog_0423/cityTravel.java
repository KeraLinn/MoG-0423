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
        cityChoiceString = parent.getItemAtPosition(position).toString();
        cityChoiceInt = (int) parent.getItemIdAtPosition(position);
        if (cityChoiceInt == 0) {
            cityPickButton.setOnClickListener((View vie) -> {
                startActivity(new Intent(cityTravel.this,
                        cityArrival2MerchantsRubya.class));
            });
        }
        if (cityChoiceInt == 1) {
            cityPickButton.setOnClickListener((View vie) -> {
                startActivity(new Intent(cityTravel.this,
                        cityArrival1MerchantTourmalina.class));
            });
        }
        if (cityChoiceInt == 2) {
            cityPickButton.setOnClickListener((View view1) -> {
                startActivity(new Intent(cityTravel.this,
                        cityArrival1MerchantSapphira.class));
            });
        }
        if (cityChoiceInt == 3) {
            cityPickButton.setOnClickListener((View vie) -> {
                startActivity(new Intent(cityTravel.this,
                        cityArrival2MerchantsEmeraldis.class));
            });
        }
        if (cityChoiceInt == 4) {
            cityPickButton.setOnClickListener((View v) -> {
                startActivity(new Intent(cityTravel.this,
                        cityArrival1MerchantDiamondaria.class));
            });
        }
        if (cityChoiceInt == 5) {
            cityPickButton.setOnClickListener((View vie) -> {
                startActivity(new Intent(cityTravel.this,
                        cityArrival2MerchantsJadeEmpire.class));
            });
        }
        if (cityChoiceInt == 6) {
            cityPickButton.setOnClickListener((View vie) -> {
                startActivity(new Intent(cityTravel.this,
                        cityArrival2MerchantsOnyxCoast.class));
            });
        } else if (cityChoiceInt == 7) {
            cityPickButton.setOnClickListener((View vie) -> {
                startActivity(new Intent(cityTravel.this,
                        cityArrival2MerchantsOpalancy.class));
            });
        } else if (cityChoiceInt == 8) {
            cityPickButton.setOnClickListener((View vie) -> {
                startActivity(new Intent(cityTravel.this,
                        cityArrival1MerchantAmethystCity.class));
            });
        }
        else{
            cityPickButton.setOnClickListener((View view2) -> {
                startActivity(new Intent(cityTravel.this,
                        cityArrival1MerchantAgatia.class));
            });
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
