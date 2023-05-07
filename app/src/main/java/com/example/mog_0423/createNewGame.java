package com.example.mog_0423;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class createNewGame extends AppCompatActivity {
    String playerName;
    int difficultyLevel;
    int profileImage;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_new_game);

        Button completeButton = findViewById(R.id.startButton);
        completeButton.setOnClickListener((View v) -> {
            playerName = getPlayerName();
            difficultyLevel = getDifficultyLevel();
            profileImage = getProfileImage();
            startActivity(new Intent(createNewGame.this, startNewGame.class));
        });
    }

    String getPlayerName() {
        EditText player = findViewById(R.id.editTextTextPersonName2);
        String tempString = player.toString();
        if (tempString.isEmpty()){
            tempString = "Haven";
        }
        return tempString;
    }
    int getDifficultyLevel(){
        CheckBox easyCheck = findViewById(R.id.easyCheck);
        CheckBox mediumCheck = findViewById(R.id.mediumCheck);
        CheckBox hardCheck = findViewById(R.id.hardcheck);

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
        }
    }
    int getProfileImage() {
        ImageButton avatar1 = findViewById(R.id.imageButton3);
        ImageButton avatar2 = findViewById(R.id.imageButton4);
        ImageButton avatar3 = findViewById(R.id.imageButton5);
        ImageButton avatar4 = findViewById(R.id.imageButton6);
        if (avatar1.isSelected()){
            return avatar1.getId();
        }
        else if (avatar2.isSelected()){
            return avatar2.getId();
        }
        else if (avatar3.isSelected()){
            return avatar3.getId();
        }
        else if (avatar4.isSelected()){
            return avatar4.getId();
        }
        return 0;
    }





}
