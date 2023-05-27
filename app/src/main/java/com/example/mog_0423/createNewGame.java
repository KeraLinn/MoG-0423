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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_new_game);
        player = new playerClass();

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
    private void finishSetup() {
        if (userInputName.toString().isEmpty()) {
            player.setPlayerName("Haven");
        } else {
            player.setPlayerName(userName);
        }
        /*switch (player.difficultyLevel) {
            case 1:

            case 2:

            case 3:

        }*/
    }

    //region handle Spinner and Radio Button selections
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getSelectedItemPosition()) {
            case 1:
                player.setDifficultyLevel(1);
                player.setPlayerPurse(500);
                player.setNumStartItems(5);
                player.setWinParameter("1000 Gold");
                break;
            case 2:
                player.setDifficultyLevel(2);
                player.setPlayerPurse(400);
                player.setNumStartItems(4);
                player.setWinParameter("2500 Gold");
                break;
            case 3:
                player.setDifficultyLevel(3);
                player.setPlayerPurse(200);
                player.setNumStartItems(2);
                player.setWinParameter("5000 Gold");
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
            player.setPlayerAvatar(R.drawable.icons8_butterfly_100);
        } else if (button2.isChecked()) {
            player.setPlayerAvatar(R.drawable.icons8_cat_100);
        } else if (button3.isChecked()) {
            player.setPlayerAvatar(R.drawable.icons8_elephant_100);
        } else if (button4.isChecked()) {
            player.setPlayerAvatar(R.drawable.icons8_hummingbird_100);
        } else if (button5.isChecked()) {
            player.setPlayerAvatar(R.drawable.icons8_german_shepherd_100);
        } else if (button6.isChecked()) {
            player.setPlayerAvatar(R.drawable.icons8_crab_100);
        }
    }
    //endregion handle Spinner and Radio Button selections
}

