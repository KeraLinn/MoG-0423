package com.example.mog_0423;

import static com.example.mog_0423.R.id.radioButtonB;
import static com.example.mog_0423.R.id.radioButtonC;
import static com.example.mog_0423.R.id.radioButtonE;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class createNewGame extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String userName;
    int chosenDifficultyLevel;
    int profileImage;
    int playerGold;
    protected File newFile;
    MediaPlayer player = MediaPlayer.create(createNewGame.this, R.raw.intro_music);



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_new_game);
        player.start();

        Spinner difficultySpinner = findViewById(R.id.DifficultySpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.difficultyList, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        difficultySpinner.setAdapter(adapter);
        difficultySpinner.setOnItemSelectedListener(this);



        Button completeButton = findViewById(R.id.startButton);
        completeButton.setOnClickListener((View v) -> {
            userName = getUserName();
            newFile = new File(userName);
            playerGold = 200;
            startActivity(new Intent(createNewGame.this, startNewGame.class));
        });
    }

    @SuppressLint("SetTextI18n")
    String getUserName() {
        EditText player = findViewById(R.id.editTextTextPersonName2);
        if (player.toString().isEmpty()){
            player.setText("Haven");
        }
        return player.toString();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       String myString = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
       chosenDifficultyLevel = (int) parent.getItemIdAtPosition(1);
    }
    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View v) {
        //boolean checked = ((RadioButton) v).isChecked();
        //int checkedId = v.getId();
        int id = v.getId();
        if (id == radioButtonB) {
            profileImage = radioButtonB;
                /*            case R.id.radioGroup1:
                switch(checkedId) {*/
                    /*case radioButtonB:
                        profileImage = radioButtonB;
                        break;*/
        } else if (id == radioButtonC) {
            profileImage = radioButtonC;
        } else if (id == radioButtonE) {
            profileImage = radioButtonE;
        }
    }
}

