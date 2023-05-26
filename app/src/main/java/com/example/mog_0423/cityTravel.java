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
    Intent intent;
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
        cityPickButton.setOnClickListener((View v) -> startActivity(intent));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        intent = new Intent();
        cityChoiceInt = parent.getSelectedItemPosition();
        switch(cityChoiceInt){
            case 0:
                intent.setClass(cityTravel.this,cityArrival2MerchantsRubya.class);
                break;
            case 1: intent.setClass(cityTravel.this, cityArrival1MerchantTourmalina.class);
                break;
            case 2: intent.setClass(cityTravel.this,cityArrival1MerchantSapphira.class);
                break;
            case 3: intent.setClass(cityTravel.this, cityArrival2MerchantsEmeraldis.class);
                break;
            case 4: intent.setClass(cityTravel.this,cityArrival1MerchantDiamondaria.class);
                break;
            case 5: intent.setClass(cityTravel.this, cityArrival2MerchantsJadeEmpire.class);
                break;
            case 6: intent.setClass(cityTravel.this, cityArrival2MerchantsOnyxCoast.class);
                break;
            case 7: intent.setClass(cityTravel.this, cityArrival2MerchantsOpalancy.class);
                break;
            case 8: intent.setClass(cityTravel.this, cityArrival1MerchantAmethystCity.class);
                break;
            case 9: intent.setClass(cityTravel.this, cityArrival1MerchantAgatia.class);
                break;
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
