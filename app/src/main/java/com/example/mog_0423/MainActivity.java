package com.example.mog_0423;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    /*private SoundPool soundPool;
    private int soundLostGame, soundWonGame, soundIntroTheme, soundJadeTheme, soundOpalTheme;*/
    public MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_home);
        /*mediaPlayer = MediaPlayer.create(this,R.raw.intro_music);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
*/

        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(6)
                    .setAudioAttributes(audioAttributes)
                    .build();
        }
        else{
            soundPool = new SoundPool(6, AudioManager.STREAM_MUSIC,0);
            //Old way of doing things in case the build is less than Lollipop version. Max # of
            // playable sounds at the same time is 6 (probs don't need that many), AudioManager
            // .Stream_Music plays audio through connected device (speakers or headphones), and
            // srcQuality was never implemented.
        }
        soundLostGame = soundPool.load(this,R.raw.game_lost,1);
        soundWonGame = soundPool.load(this,R.raw.success_fanfare,1);
        soundIntroTheme = soundPool.load(this,R.raw.intro_music,1);
        soundJadeTheme = soundPool.load(this,R.raw.jade_empire_theme,1);
        soundOpalTheme = soundPool.load(this,R.raw.opalancy_theme,1);*/

        Button newGameButton = findViewById(R.id.newGameButton);
        newGameButton.setOnClickListener(v -> startActivity(new Intent(MainActivity
                .this, createNewGame.class)));

        Button continueGameButton = findViewById(R.id.continueButton);
        continueGameButton.setOnClickListener((View v) -> {
            startActivity(new Intent(MainActivity.this, merchantInteractionUserBuys.class));
        });
        //continueGameButton.setVisibility(View.INVISIBLE);
        //TODO remove the myButton from screen_home.xml layout and from MainActivity.java. This
        // is here to demonstrate working code for commodityRecyclerView
        Button myButton;
        myButton = findViewById(R.id.buttonRecycler);
        myButton.setVisibility(View.INVISIBLE);
        myButton.setOnClickListener((View v) -> startActivity(new Intent(MainActivity.this,
                CommodityRecyclerViewDataClass.class)));
    }
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
/*
    public void Play(View v){
        if (mediaPlayer == null){
            mediaPlayer = MediaPlayer.create(this,R.raw.intro_music);
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        mediaPlayer.start();
    }

    private void stopPlayer() {
        if (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
            Toast.makeText(this, "Mediaplayer released", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop(){
        super.onStop();
        stopPlayer();
    }*/
    /*public void playSound(View v){
        switch(v.getId()){
            case R.id.button2:
                soundPool.play(soundOpalTheme,1,1,0,0,1);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }*/
}