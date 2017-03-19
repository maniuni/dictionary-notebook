package com.example.android.dictionary_notebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intentA, intentNums, intentColors, intentPronouns, intentGreet, intentTests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //open the chosen lesson
    public void openNewLesson(View v){

        switch (v.getId()) {

            case R.id.alphabet:
                intentA = new Intent(MainActivity.this, Alphabet.class);
                startActivity(intentA);
                break;
            case R.id.numbers:
                intentNums = new Intent(MainActivity.this, NumbersLesson.class);
                startActivity(intentNums);
                break;
            case R.id.colors:
                intentColors = new Intent(MainActivity.this, ColorsLesson.class);
                startActivity(intentColors);
                break;
            case R.id.pronouns:
                intentPronouns = new Intent(MainActivity.this, PronounsLesson.class);
                startActivity(intentPronouns);
                break;
            case R.id.greetings:
                intentGreet = new Intent(MainActivity.this, GreetingsLesson.class);
                startActivity(intentGreet);
                break;
            case R.id.tests:
                intentTests = new Intent(MainActivity.this, TestLesson.class);
                startActivity(intentTests);
                break;
        }
    }
}
