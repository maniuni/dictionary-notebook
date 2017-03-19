package com.example.android.dictionary_notebook;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GreetingsLesson extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mPlayerWelcome, mPlayerHello, mPlayerMorning, 
            mPlayerNoon, mPlayerEvening, mPlayerHow, 
            mPlayerFine, mPlayerMeet, mPlayerSee, mPlayerBye;
    
    private Button buttonWelcome, buttonHello, buttonMorning,
            buttonNoon, buttonEvening, buttonHow, 
            buttonFine, buttonMeet, buttonSee, buttonBye;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings_lesson);
        
        /*
            create MediaPlayer objects with different pronunciation for each sentence
        */
        mPlayerWelcome = MediaPlayer.create(GreetingsLesson.this, R.raw.welcome);
        mPlayerHello = MediaPlayer.create(GreetingsLesson.this, R.raw.hello);
        mPlayerMorning = MediaPlayer.create(GreetingsLesson.this, R.raw.morning);
        mPlayerNoon = MediaPlayer.create(GreetingsLesson.this, R.raw.noon);
        mPlayerEvening = MediaPlayer.create(GreetingsLesson.this, R.raw.evening);
        mPlayerHow = MediaPlayer.create(GreetingsLesson.this, R.raw.how);
        mPlayerFine = MediaPlayer.create(GreetingsLesson.this, R.raw.fine);
        mPlayerMeet = MediaPlayer.create(GreetingsLesson.this, R.raw.meet);
        mPlayerSee = MediaPlayer.create(GreetingsLesson.this, R.raw.see);
        mPlayerBye = MediaPlayer.create(GreetingsLesson.this, R.raw.bye);
        /*
            detect when a button is clicked and store the button in a variable
        */
        buttonWelcome = (Button) findViewById(R.id.Button_welcome);
        buttonWelcome.setOnClickListener(this);
        buttonHello = (Button) findViewById(R.id.Button_hello);
        buttonHello.setOnClickListener(this);
        buttonMorning = (Button) findViewById(R.id.Button_morning);
        buttonMorning.setOnClickListener(this);
        buttonNoon = (Button) findViewById(R.id.Button_noon);
        buttonNoon.setOnClickListener(this);
        buttonEvening = (Button) findViewById(R.id.Button_evening);
        buttonEvening.setOnClickListener(this);
        buttonHow = (Button) findViewById(R.id.Button_how);
        buttonHow.setOnClickListener(this);
        buttonFine = (Button) findViewById(R.id.Button_fine);
        buttonFine.setOnClickListener(this);
        buttonMeet = (Button) findViewById(R.id.Button_meet);
        buttonMeet.setOnClickListener(this);
        buttonSee = (Button) findViewById(R.id.Button_see);
        buttonSee.setOnClickListener(this);
        buttonBye = (Button) findViewById(R.id.Button_bye);
        buttonBye.setOnClickListener(this);
    }

    /*
       play different sound and change the button text depending on which button is clicked
   */
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.Button_welcome:
                buttonWelcome.setText(R.string.welcome_bg);
                //wait for 2 seconds
                Handler handlerWelcome = new Handler();
                handlerWelcome.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonWelcome.setText(R.string.welcome);
                    }
                }, 2000);
                mPlayerWelcome.start();
                break;
            case R.id.Button_hello:
                buttonHello.setText(R.string.hello_bg);
                //wait for 2 seconds
                Handler handlerHello = new Handler();
                handlerHello.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonHello.setText(R.string.hello);
                    }
                }, 2000);
                mPlayerHello.start();
                break;
            case R.id.Button_morning:
                buttonMorning.setText(R.string.morning_bg);
                //wait for 2 seconds
                Handler handlerMorning = new Handler();
                handlerMorning.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonMorning.setText(R.string.morning);
                    }
                }, 2000);
                mPlayerMorning.start();
                break;
            case R.id.Button_noon:
                buttonNoon.setText(R.string.noon_bg);
                //wait for 2 seconds
                Handler handlerNoon = new Handler();
                handlerNoon.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonNoon.setText(R.string.noon);
                    }
                }, 2000);
                mPlayerNoon.start();
                break;
            case R.id.Button_evening:
                buttonEvening.setText(R.string.evening_bg);
                //wait for 2 seconds
                Handler handlerEvening = new Handler();
                handlerEvening.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonEvening.setText(R.string.evening);
                    }
                }, 2000);
                mPlayerEvening.start();
                break;
            case R.id.Button_how:
                buttonHow.setText(R.string.how_bg);
                //wait for 2 seconds
                Handler handlerHow = new Handler();
                handlerHow.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonHow.setText(R.string.how);
                    }
                }, 2000);
                mPlayerHow.start();
                break;
            case R.id.Button_fine:
                buttonFine.setText(R.string.fine_bg);
                //wait for 2 seconds
                Handler handlerFine = new Handler();
                handlerFine.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonFine.setText(R.string.fine);
                    }
                }, 2000);
                mPlayerFine.start();
                break;
            case R.id.Button_meet:
                buttonMeet.setText(R.string.meet_bg);
                //wait for 2 seconds
                Handler handlerMeet = new Handler();
                handlerMeet.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonMeet.setText(R.string.meet);
                    }
                }, 2000);
                mPlayerMeet.start();
                break;
            case R.id.Button_see:
                buttonSee.setText(R.string.see_bg);
                //wait for 2 seconds
                Handler handlerSee = new Handler();
                handlerSee.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonSee.setText(R.string.see);
                    }
                }, 2000);
                mPlayerSee.start();
                break;
            case R.id.Button_bye:
                buttonBye.setText(R.string.bye_bg);
                //wait for 2 seconds
                Handler handlerBye = new Handler();
                handlerBye.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        buttonBye.setText(R.string.bye);
                    }
                }, 2000);
                mPlayerBye.start();
                break;
        }
    }
}
