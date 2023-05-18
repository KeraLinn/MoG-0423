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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_travel);

        Spinner citySpinner = findViewById(R.id.citySpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.city_names_list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        citySpinner.setAdapter(adapter);
        citySpinner.setOnItemSelectedListener(this);

        Button cityPickButton = findViewById(R.id.donePickCity);
        cityPickButton.setOnClickListener((View v) -> startActivity(new Intent(cityTravel.this,
                cityArrival.class)));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        cityChoiceInt = (int) parent.getItemIdAtPosition(position);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
