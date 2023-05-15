package com.example.mog_0423;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_home);

        Button newGameButton = findViewById(R.id.newGameButton);
        newGameButton.setOnClickListener((v -> startNewGameWarningDialog()));

        Button continueGameButton = findViewById(R.id.continueButton);
        /*continueGameButton.setOnClickListener((View v) -> startActivity(new Intent(MainActivity
                .this, CommodityRecyclerViewDataClass.class)));*/
        continueGameButton.setOnClickListener((View v) -> startActivity(new Intent(MainActivity
                .this, merchantInteraction.class)));
    }
    public void startNewGameWarningDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle(R.string.new_game_warning_dialog_title)
                .setMessage("If you start a new game, your previous progress will be " +
                        "erased!\n\nAre you sure you want to start a new game?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(MainActivity.this, createNewGame.class));
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

}