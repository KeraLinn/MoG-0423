package com.example.mog_0423;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    protected static MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_home);
        mediaPlayer = MediaPlayer.create(this, R.raw.intro_music);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        Button newGameButton = findViewById(R.id.newGameButton);
        newGameButton.setOnClickListener(v -> startActivity(new Intent(MainActivity
                .this, createNewGame.class)));


        //ContinueGameButton logic not implemented, so it is set to invisible. myButton was here
        // to demonstrate working code for commodityRecyclerView, so it is set to invisible.
        Button continueGameButton = findViewById(R.id.continueButton);
        continueGameButton.setOnClickListener((View v) -> {
            startActivity(new Intent(MainActivity.this, merchantInteractionUserBuysSapphira.class));
        });
        continueGameButton.setVisibility(View.INVISIBLE);
        Button myButton;
        myButton = findViewById(R.id.buttonRecycler);
        myButton.setVisibility(View.INVISIBLE);
        myButton.setOnClickListener((View v) -> startActivity(new Intent(MainActivity.this,
                CommodityRecyclerViewDataClass.class)));
    }
    //Decided against using a warning dialog to start a new game because there is no logic
    // implemented for continue game.
    /*public void startNewGameWarningDialog(){
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
    }*/
}