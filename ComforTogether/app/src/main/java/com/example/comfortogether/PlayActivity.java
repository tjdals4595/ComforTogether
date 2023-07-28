package com.example.comfortogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlayActivity extends AppCompatActivity {

    ImageButton close_play_btn;
    Button sound_btn;
    Button vibration_btn;
    Button ml_brn;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        close_play_btn = findViewById(R.id.close_play_btn);
        sound_btn = findViewById(R.id.sound_btn);
        vibration_btn = findViewById(R.id.vibration_btn);
        ml_brn = findViewById(R.id.ml_brn);
    }

    public void onclick(View view) {
        switch (view.getId()){
            case R.id.close_play_btn:
                Intent go_main_intent = new Intent(PlayActivity.this,MainActivity.class);
                startActivity(go_main_intent);
                finish();
                break;

            case R.id.sound_btn:
                PlaySound();
                break;

            case R.id.vibration_btn:
                PlayVibration();
                break;

            case R.id.ml_brn:
                PlayML();
                break;

            default:
                break;
        }
    }
    private void PlaySound() {
        if(mediaPlayer == null){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ringtone_1);
            mediaPlayer.start();
        }else{
            mediaPlayer.stop();
            mediaPlayer = null;
            //PlaySound();
        }
    }

    private void PlayVibration() {
        Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        vibrator.vibrate(VibrationEffect.createOneShot(1000,100));
    }
    private void PlayML() {

    }
}