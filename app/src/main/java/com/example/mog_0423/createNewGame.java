package com.example.mog_0423;

import static com.example.mog_0423.R.id.radioButtonB;
import static com.example.mog_0423.R.id.radioButtonC;
import static com.example.mog_0423.R.id.radioButtonE;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class createNewGame extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String playerName;
    Object difficultyLevel;
    int profileImage;
    protected File newFile;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_new_game);
        Spinner difficultySpinner = findViewById(R.id.DifficultySpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.difficultyList, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        difficultySpinner.setAdapter(adapter);
        difficultySpinner.setOnItemSelectedListener(this);



        Button completeButton = findViewById(R.id.startButton);
        completeButton.setOnClickListener((View v) -> {
            playerName = getPlayerName();
            newFile = new File(playerName);
            startActivity(new Intent(createNewGame.this, startNewGame.class));
        });
    }

    @SuppressLint("SetTextI18n")
    String getPlayerName() {
        EditText player = findViewById(R.id.editTextTextPersonName2);
        if (player.toString().isEmpty()){
            player.setText("Haven");
        }
        return player.toString();
    }
    /*int getDifficultyLevel(){


        if (mediumCheck.isChecked()){
            return 2;
        }
        else if (hardCheck.isChecked()){
            return 3;
        }
        //if easy or none checked
        else {
            easyCheck.setChecked(true);
            return 1;
        }*/

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       difficultyLevel = parent.getItemAtPosition(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
       difficultyLevel = (int) parent.getItemIdAtPosition(1);
    }
    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View v) {
        //boolean checked = ((RadioButton) v).isChecked();
        //int checkedId = v.getId();
        switch (v.getId()) {
            case radioButtonB:
                profileImage = radioButtonB;
                break;
/*            case R.id.radioGroup1:
                switch(checkedId) {*/
                    /*case radioButtonB:
                        profileImage = radioButtonB;
                        break;*/
            case radioButtonC:
                profileImage = radioButtonC;
                break;
            case radioButtonE:
                profileImage = radioButtonE;
                break;
/*                }
                break;*/
/*            case R.id.radioGroup2:
                switch(checkedId){*/
                  /*  case radioButtonH:
                        profileImage = radioButtonH;
                        break;
                    case radioButtonBlue:
                        profileImage = radioButtonBlue;
                        break;
                    case radioButtonDragon:
                        profileImage = radioButtonDragon;
                        break;
                }*/
            // break;
        }
    }
}

