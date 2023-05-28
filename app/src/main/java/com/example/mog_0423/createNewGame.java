package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class createNewGame extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    playerClass player;
    String userName;
    int chosenDifficultyLevel;
    int profileImage;
    int playerGold;
    TextView userInputName;
    String winParameter;
    int numStartItems;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_new_game);

    //region findViewByIds
        userInputName = findViewById(R.id.editTextTextPersonName2);
        Button completeButton = findViewById(R.id.startButton);
        Spinner difficultySpinner = findViewById(R.id.DifficultySpinner);
        //endregion findViewByIds
    //region spinnerAdapter
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.difficultyList, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        difficultySpinner.setAdapter(adapter);
        difficultySpinner.setOnItemSelectedListener(this);
//endregion spinnerAdapter

        completeButton.setOnClickListener((View v) -> {
            finishSetup();
            startActivity(new Intent(createNewGame.this, startNewGame.class));
        });
    }

    //region handle Spinner and Radio Button selections
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getSelectedItemPosition()) {
            case 0:
                chosenDifficultyLevel = 1;
                playerGold = 500;
                numStartItems = 5;
                winParameter = "1000 Gold";
                break;
            case 1:
                chosenDifficultyLevel = 2;
                playerGold = 400;
                numStartItems = 4;
                winParameter = "2500 Gold";
                break;
            case 2:
                chosenDifficultyLevel = 3;
                playerGold = 200;
                numStartItems = 2;
                winParameter = "5000 Gold";
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        player.setDifficultyLevel(0);
    }

    public void onRadioButtonClicked(View v) {
        RadioButton button1, button2, button3, button4, button5, button6;
        button1 = findViewById(R.id.radioButtonB2);
        button2 = findViewById(R.id.radioButtonC2);
        button3 = findViewById(R.id.radioButtonE2);
        button4 = findViewById(R.id.radioButtonH2);
        button5 = findViewById(R.id.radioButtonDog2);
        button6 = findViewById(R.id.radioButtonCrab2);
        if (button1.isChecked()) {
            profileImage = 1;
        } else if (button2.isChecked()) {
            profileImage = 2;
        } else if (button3.isChecked()) {
            profileImage = 3;
        } else if (button4.isChecked()) {
            profileImage = 4;
        } else if (button5.isChecked()) {
            profileImage = 5;
        } else if (button6.isChecked()) {
            profileImage = 6;
        }
    }
    //endregion handle Spinner and Radio Button selections
    private void finishSetup() {
        if (userInputName.toString().isEmpty() || userInputName == null) {
            userName = "Haven";
        } else {
            userName = userInputName.toString();
        }
        player = new playerClass();
        player.playerAvatar = profileImage;
        player.setPlayerPurse(playerGold);
        player.difficultyLevel = chosenDifficultyLevel;
        player.playerName = userName;
    }
}

