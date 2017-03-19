package com.example.android.dictionary_notebook;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PronounsLesson extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mPlayerI, mPlayerYou1, mPlayerShe,
            mPlayerHe, mPlayerIt, mPlayerWe, mPlayerYou2, mPlayerThey;
    private Button buttonI, buttonYou1, buttonShe,
            buttonHe, buttonIt, buttonWe, buttonYou2, buttonThey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronouns_lesson);

        /*
            create MediaPlayer objects with different pronunciation for each sentence
        */
        mPlayerI = MediaPlayer.create(PronounsLesson.this, R.raw.iam);
        mPlayerYou1 = MediaPlayer.create(PronounsLesson.this, R.raw.you1);
        mPlayerShe = MediaPlayer.create(PronounsLesson.this, R.raw.she);
        mPlayerHe = MediaPlayer.create(PronounsLesson.this, R.raw.he);
        mPlayerIt = MediaPlayer.create(PronounsLesson.this, R.raw.it);
        mPlayerWe = MediaPlayer.create(PronounsLesson.this, R.raw.we);
        mPlayerYou2 = MediaPlayer.create(PronounsLesson.this, R.raw.you2);
        mPlayerThey = MediaPlayer.create(PronounsLesson.this, R.raw.they);

        /*
            detect when a button is clicked and store the button in a variable
        */
        buttonI = (Button) findViewById(R.id.Button_i);
        buttonI.setOnClickListener(this);
        buttonYou1 = (Button) findViewById(R.id.Button_you1);
        buttonYou1.setOnClickListener(this);
        buttonShe = (Button) findViewById(R.id.Button_she);
        buttonShe.setOnClickListener(this);
        buttonHe = (Button) findViewById(R.id.Button_he);
        buttonHe.setOnClickListener(this);
        buttonIt = (Button) findViewById(R.id.Button_it);
        buttonIt.setOnClickListener(this);
        buttonWe = (Button) findViewById(R.id.Button_we);
        buttonWe.setOnClickListener(this);
        buttonYou2 = (Button) findViewById(R.id.Button_you2);
        buttonYou2.setOnClickListener(this);
        buttonThey = (Button) findViewById(R.id.Button_they);
        buttonThey.setOnClickListener(this);
    }

    /*
       play different sound and change the button text depending on which button is clicked
   */
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.Button_i:
                buttonI.setText(R.string.i_am_bg);
                //wait for 2 seconds
                Handler handlerI = new Handler();
                handlerI.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonI.setText(R.string.i_am);
                    }
                }, 2000);
                mPlayerI.start();
                break;
            case R.id.Button_you1:
                buttonYou1.setText(R.string.you_are1_bg);
                //wait for 2 seconds
                Handler handlerYou1 = new Handler();
                handlerYou1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonYou1.setText(R.string.you_are1);
                    }
                }, 2000);
                mPlayerYou1.start();
                break;
            case R.id.Button_she:
                buttonShe.setText(R.string.she_is_bg);
                //wait for 2 seconds
                Handler handlerShe = new Handler();
                handlerShe.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonShe.setText(R.string.she_is);
                    }
                }, 2000);
                mPlayerShe.start();
                break;
            case R.id.Button_he:
                buttonHe.setText(R.string.he_is_bg);
                //wait for 2 seconds
                Handler handlerHe = new Handler();
                handlerHe.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonHe.setText(R.string.he_is);
                    }
                }, 2000);
                mPlayerHe.start();
                break;
            case R.id.Button_it:
                buttonIt.setText(R.string.it_is_bg);
                //wait for 2 seconds
                Handler handlerIt = new Handler();
                handlerIt.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonIt.setText(R.string.it_is);
                    }
                }, 2000);
                mPlayerIt.start();
                break;
            case R.id.Button_we:
                buttonWe.setText(R.string.we_are_bg);
                //wait for 2 seconds
                Handler handlerWe = new Handler();
                handlerWe.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonWe.setText(R.string.we_are);
                    }
                }, 2000);
                mPlayerWe.start();
                break;
            case R.id.Button_you2:
                buttonYou2.setText(R.string.you_are2_bg);
                //wait for 2 seconds
                Handler handlerYou2 = new Handler();
                handlerYou2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonYou2.setText(R.string.you_are2);
                    }
                }, 2000);
                mPlayerYou2.start();
                break;
            default:
                buttonThey.setText(R.string.they_are_bg);
                //wait for 2 seconds
                Handler handlerThey = new Handler();
                handlerThey.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonThey.setText(R.string.they_are);
                    }
                }, 2000);
                mPlayerThey.start();
                break;
        }
    }
}
