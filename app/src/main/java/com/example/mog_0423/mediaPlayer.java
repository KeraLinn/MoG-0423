package com.example.mog_0423;

import android.app.Activity;
import android.media.MediaPlayer;

public class mediaPlayer extends Activity {
    protected static MediaPlayer mediaPlayer;

    public static String ACTION_PLAY = "com.example.mog_0423.PLAY";
    public static String ACTION_PAUSE = "com.example.mog_0423.PAUSE";

    /*public void onNewIntent(Intent intent){
        if(intent.getAction().equals(ACTION_PLAY)){
            //Play
            mediaPlayer = MediaPlayer.create(this, R.raw.intro_music);
            mediaPlayer.start();
            //return super.onStartCommand(intent, flags, startId);
        }
        else if(intent.getAction().equals(ACTION_PAUSE)){
            //Pause
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }*/
/*
    public static void playNewMusic(int raw){
        if (mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        mediaPlayer = MediaPlayer.create(, raw);
        mediaPlayer.start();
    }
*/

   /* @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public int onStartCommand(Intent intent,int flags, int startId){
        mediaPlayer = MediaPlayer.create(this, R.raw.intro_music);
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public boolean stopService(Intent intent){
        return super.stopService(intent);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
        mediaPlayer = null;
    }*/
}
