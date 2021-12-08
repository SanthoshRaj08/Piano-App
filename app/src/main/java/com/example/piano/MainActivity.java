package com.example.piano;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9,sound10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }
        else {
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }
        sound1=soundPool.load(this,R.raw.key01,1);
        sound2=soundPool.load(this,R.raw.key02,1);
        sound3=soundPool.load(this,R.raw.key03,1);
        sound4=soundPool.load(this,R.raw.key04,1);
        sound5=soundPool.load(this,R.raw.key05,1);
        sound6=soundPool.load(this,R.raw.key11,1);
        sound7=soundPool.load(this,R.raw.key12,1);
        sound8=soundPool.load(this,R.raw.key13,1);
        sound9=soundPool.load(this,R.raw.key14,1);
        sound10=soundPool.load(this,R.raw.key15,1);
    }

    public void click(View view) {
        switch(view.getId())
        {
            case R.id.b1:
                soundPool.play(sound1,1,1,0,0,1);
                break;
            case R.id.b2:
                soundPool.play(sound2,1,1,0,0,1);
                break;
            case R.id.b3:
                soundPool.play(sound3,1,1,0,0,1);
                break;
            case R.id.b4:
                soundPool.play(sound4,1,1,0,0,1);
                break;
            case R.id.b5:
                soundPool.play(sound5,1,1,0,0,1);
                break;
            case R.id.b6:
                soundPool.play(sound6,1,1,0,0,1);
                break;
            case R.id.b7:
                soundPool.play(sound7,1,1,0,0,1);
                break;
            case R.id.b8:
                soundPool.play(sound8,1,1,0,0,1);
                break;
            case R.id.b9:
                soundPool.play(sound9,1,1,0,0,1);
                break;
            case R.id.b10:
                soundPool.play(sound10,1,1,0,0,1);
                break;



        }
    }
}