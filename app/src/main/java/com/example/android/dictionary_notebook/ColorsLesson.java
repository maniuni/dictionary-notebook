package com.example.android.dictionary_notebook;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ColorsLesson extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mPlayerY, mPlayerGrey, mPlayerPi, mPlayerR, mPlayerBlack,
    mPlayerBlue, mPlayerGreen, mPlayerW, mPlayerBr, mPlayerPu, mPlayerO;

    private Button buttonY, buttonGrey, buttonPi, buttonR, buttonBlack,
    buttonBlue, buttonGreen, buttonW, buttonBr, buttonPu, buttonO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors_lesson);

        /*
           creating MediaPlayer objects with pronunciation for each color
        */
        mPlayerY = MediaPlayer.create(ColorsLesson.this, R.raw.yellow);
        mPlayerGrey = MediaPlayer.create(ColorsLesson.this, R.raw.grey);
        mPlayerPi = MediaPlayer.create(ColorsLesson.this, R.raw.pink);
        mPlayerR = MediaPlayer.create(ColorsLesson.this, R.raw.red);
        mPlayerBlack = MediaPlayer.create(ColorsLesson.this, R.raw.black);
        mPlayerBlue = MediaPlayer.create(ColorsLesson.this, R.raw.blue);
        mPlayerGreen = MediaPlayer.create(ColorsLesson.this, R.raw.green);
        mPlayerW = MediaPlayer.create(ColorsLesson.this, R.raw.white);
        mPlayerBr = MediaPlayer.create(ColorsLesson.this, R.raw.brown);
        mPlayerPu = MediaPlayer.create(ColorsLesson.this, R.raw.purple);
        mPlayerO = MediaPlayer.create(ColorsLesson.this, R.raw.orange);

        /*
            detect when a button with color is clicked and store the button in a variable
        */
        buttonY = (Button) findViewById(R.id.Button_yellow);
        buttonY.setOnClickListener(this);
        buttonGrey = (Button) findViewById(R.id.Button_grey);
        buttonGrey.setOnClickListener(this);
        buttonPi = (Button) findViewById(R.id.Button_pink);
        buttonPi.setOnClickListener(this);
        buttonR = (Button) findViewById(R.id.Button_red);
        buttonR.setOnClickListener(this);
        buttonBlack = (Button) findViewById(R.id.Button_black);
        buttonBlack.setOnClickListener(this);
        buttonBlue = (Button) findViewById(R.id.Button_blue);
        buttonBlue.setOnClickListener(this);
        buttonGreen = (Button) findViewById(R.id.Button_green);
        buttonGreen.setOnClickListener(this);
        buttonW = (Button) findViewById(R.id.Button_white);
        buttonW.setOnClickListener(this);
        buttonBr = (Button) findViewById(R.id.Button_brown);
        buttonBr.setOnClickListener(this);
        buttonPu = (Button) findViewById(R.id.Button_purple);
        buttonPu.setOnClickListener(this);
        buttonO = (Button) findViewById(R.id.Button_orange);
        buttonO.setOnClickListener(this);

    }

    /*
        play different sound and change the background and text color depending on which button is clicked
    */
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.Button_yellow:
                buttonY.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.yellow));
                buttonY.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black_text));
                //wait for 2 seconds
                Handler handlerY = new Handler();
                handlerY.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonY.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                        buttonY.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                    }
                }, 2000);
                mPlayerY.start();
                break;
            case R.id.Button_grey:
                buttonGrey.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.grey));
                buttonGrey.setTextColor(Color.WHITE);
                //wait for 2 seconds
                Handler handlerGrey = new Handler();
                handlerGrey.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonGrey.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                        buttonGrey.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                    }
                }, 2000);
                mPlayerGrey.start();
                break;
            case R.id.Button_pink:
                buttonPi.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.pink));
                buttonPi.setTextColor(Color.WHITE);
                //wait for 2 seconds
                Handler handlerPi = new Handler();
                handlerPi.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonPi.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                        buttonPi.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                    }
                }, 2000);
                mPlayerPi.start();
                break;
            case R.id.Button_red:
                buttonR.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                buttonR.setTextColor(Color.WHITE);
                //wait for 2 seconds
                Handler handlerR = new Handler();
                handlerR.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonR.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                        buttonR.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                    }
                }, 2000);
                mPlayerR.start();
                break;
            case R.id.Button_black:
                buttonBlack.setBackgroundColor(Color.BLACK);
                buttonBlack.setTextColor(Color.WHITE);
                //wait for 2 seconds
                Handler handlerBlack = new Handler();
                handlerBlack.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonBlack.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                        buttonBlack.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                    }
                }, 2000);
                mPlayerBlack.start();
                break;
            case R.id.Button_blue:
                buttonBlue.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
                buttonBlue.setTextColor(Color.WHITE);
                //wait for 2 seconds
                Handler handlerBlue = new Handler();
                handlerBlue.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonBlue.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                        buttonBlue.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                    }
                }, 2000);
                mPlayerBlue.start();
                break;
            case R.id.Button_green:
                buttonGreen.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
                buttonGreen.setTextColor(Color.WHITE);
                //wait for 2 seconds
                Handler handlerGreen = new Handler();
                handlerGreen.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonGreen.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                        buttonGreen.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                    }
                }, 2000);
                mPlayerGreen.start();
                break;
            case R.id.Button_white:
                buttonW.setBackgroundColor(Color.WHITE);
                buttonW.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black_text));
                //wait for 2 seconds
                Handler handlerW = new Handler();
                handlerW.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonW.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                        buttonW.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                    }
                }, 2000);
                mPlayerW.start();
                break;
            case R.id.Button_brown:
                buttonBr.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.brown));
                buttonBr.setTextColor(Color.WHITE);
                //wait for 2 seconds
                Handler handlerBr = new Handler();
                handlerBr.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonBr.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                        buttonBr.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                    }
                }, 2000);
                mPlayerBr.start();
                break;
            case R.id.Button_purple:
                buttonPu.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.purple));
                buttonPu.setTextColor(Color.WHITE);
                //wait for 2 seconds
                Handler handlerPu = new Handler();
                handlerPu.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonPu.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                        buttonPu.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                    }
                }, 2000);
                mPlayerPu.start();
                break;
            default:
                buttonO.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.orange));
                buttonO.setTextColor(Color.WHITE);
                //wait for 2 seconds
                Handler handlerO = new Handler();
                handlerO.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonO.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                        buttonO.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                    }
                }, 2000);
                mPlayerO.start();
                break;
        }
    }
}
