package com.example.android.dictionary_notebook;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NumbersLesson extends AppCompatActivity {

    MediaPlayer mPlayer1, mPlayer2, mPlayer3, mPlayer4,
    mPlayer5, mPlayer6, mPlayer7, mPlayer8, mPlayer9, mPlayer10, mPlayer0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_lesson);

        //creating MediaPlayer objects with different sound for each number
        mPlayer0 = MediaPlayer.create(NumbersLesson.this, R.raw.num0);
        mPlayer1 = MediaPlayer.create(NumbersLesson.this, R.raw.num1);
        mPlayer2 = MediaPlayer.create(NumbersLesson.this, R.raw.num2);
        mPlayer3 = MediaPlayer.create(NumbersLesson.this, R.raw.num3);
        mPlayer4 = MediaPlayer.create(NumbersLesson.this, R.raw.num4);
        mPlayer5 = MediaPlayer.create(NumbersLesson.this, R.raw.num5);
        mPlayer6 = MediaPlayer.create(NumbersLesson.this, R.raw.num6);
        mPlayer7 = MediaPlayer.create(NumbersLesson.this, R.raw.num7);
        mPlayer8 = MediaPlayer.create(NumbersLesson.this, R.raw.num8);
        mPlayer9 = MediaPlayer.create(NumbersLesson.this, R.raw.num9);
        mPlayer10 = MediaPlayer.create(NumbersLesson.this, R.raw.num10);

    }

    //playing a different sound and changing button text depending on which button is clicked
    public void buttonClicked(View v) {

        switch (v.getId()) {

            case R.id.Button0:
                mPlayer0.start();
                final Button button0 = (Button) findViewById(R.id.Button0);
                button0.setText("0");
                //wait for 2 seconds
                Handler handler0 = new Handler();
                handler0.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button0.setText(R.string.num0);
                    }
                }, 2000);
                break;
            case R.id.Button1:
                mPlayer1.start();
                final Button button1 = (Button) findViewById(R.id.Button1);
                button1.setText("1");
                //wait for 2 seconds
                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button1.setText(R.string.num1);
                    }
                }, 2000);
                break;
            case R.id.Button2:
                mPlayer2.start();
                final Button button2 = (Button) findViewById(R.id.Button2);
                button2.setText("2");
                //wait for 2 seconds
                Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button2.setText(R.string.num2);
                    }
                }, 2000);
                break;
            case R.id.Button3:
                mPlayer3.start();
                final Button button3 = (Button) findViewById(R.id.Button3);
                button3.setText("3");
                //wait for 2 seconds
                Handler handler3 = new Handler();
                handler3.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button3.setText(R.string.num3);
                    }
                }, 2000);
                break;
            case R.id.Button4:
                mPlayer4.start();
                final Button button4 = (Button) findViewById(R.id.Button4);
                button4.setText("4");
                //wait for 2 seconds
                Handler handler4 = new Handler();
                handler4.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button4.setText(R.string.num4);
                    }
                }, 2000);
                break;
            case R.id.Button5:
                mPlayer5.start();
                final Button button5 = (Button) findViewById(R.id.Button5);
                button5.setText("5");
                //wait for 2 seconds
                Handler handler5 = new Handler();
                handler5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button5.setText(R.string.num5);
                    }
                }, 2000);
                break;
            case R.id.Button6:
                mPlayer6.start();
                final Button button6 = (Button) findViewById(R.id.Button6);
                button6.setText("6");
                //wait for 2 seconds
                Handler handler6 = new Handler();
                handler6.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button6.setText(R.string.num6);
                    }
                }, 2000);
                break;
            case R.id.Button7:
                mPlayer7.start();
                final Button button7 = (Button) findViewById(R.id.Button7);
                button7.setText("7");
                //wait for 2 seconds
                Handler handler7 = new Handler();
                handler7.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button7.setText(R.string.num7);
                    }
                }, 2000);
                break;
            case R.id.Button8:
                mPlayer8.start();
                final Button button8 = (Button) findViewById(R.id.Button8);
                button8.setText("8");
                //wait for 2 seconds
                Handler handler8 = new Handler();
                handler8.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button8.setText(R.string.num8);
                    }
                }, 2000);
                break;
            case R.id.Button9:
                mPlayer9.start();
                final Button button9 = (Button) findViewById(R.id.Button9);
                button9.setText("9");
                //wait for 2 seconds
                Handler handler9 = new Handler();
                handler9.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button9.setText(R.string.num9);
                    }
                }, 2000);
                break;
            default:
                mPlayer10.start();
                final Button button10 = (Button) findViewById(R.id.Button10);
                button10.setText("10");
                //wait for 2 seconds
                Handler handler10 = new Handler();
                handler10.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button10.setText(R.string.num10);
                    }
                }, 2000);
                break;
        }
    }
}
