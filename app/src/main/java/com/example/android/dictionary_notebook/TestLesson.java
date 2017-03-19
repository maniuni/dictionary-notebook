package com.example.android.dictionary_notebook;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class TestLesson extends AppCompatActivity {

    private String[] stringArrayQuestions;
    private String[] stringArrayOptions;

    private static final Random rgeneratorQuestion = new Random();
    private static final Random rgeneratorOption1 = new Random();
    private static final Random rgeneratorOption2 = new Random();

    int indexCorrect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Resources res = getResources();

        //choose randomly a test question and display it on the screen
        stringArrayQuestions = res.getStringArray(R.array.test_questions);
        String questionRandom = stringArrayQuestions[rgeneratorQuestion.nextInt(stringArrayQuestions.length)];
        TextView textViewQuestion = (TextView) findViewById(R.id.test_condition);
        textViewQuestion.setText(questionRandom);

        //make an array from all possible answers from the resource file
        stringArrayOptions = res.getStringArray(R.array.test_questions_answers);

        //store the radio buttons in variables, then in an array, shuffle the array
        RadioButton radioOption3 = (RadioButton) findViewById(R.id.option3);
        RadioButton radioOption2 = (RadioButton) findViewById(R.id.option2);
        RadioButton radioOption1 = (RadioButton) findViewById(R.id.option1);
        RadioButton[] radioButtonsArray = {radioOption1, radioOption2, radioOption3};
        Collections.shuffle(Arrays.asList(radioButtonsArray));

        //display the correct answer
        indexCorrect = Arrays.asList(stringArrayQuestions).indexOf(questionRandom);
        radioButtonsArray[0].setText(stringArrayOptions[indexCorrect]);

        //display one random option from the array with answers only if it's not the same as the other option and the correct answer
        String optionRandom1 = stringArrayOptions[rgeneratorOption1.nextInt(stringArrayOptions.length)];
        if(!optionRandom1.equals(stringArrayOptions[indexCorrect])) {
            radioButtonsArray[1].setText(optionRandom1);
        }

        //display one random option from the array with answers only if it's not the same as the other option and the correct answer
        String optionRandom2 = stringArrayOptions[rgeneratorOption2.nextInt(stringArrayOptions.length)];
        if(!optionRandom2.equals(optionRandom1) && !optionRandom2.equals(stringArrayOptions[indexCorrect])){
            radioButtonsArray[2].setText(optionRandom2);
        }
    }

    public void displayCorrectAnswer(View v){

        Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setEnabled(true);

        //store the radio buttons and their text in variables
        RadioButton radioOption3 = (RadioButton) findViewById(R.id.option3);
        RadioButton radioOption2 = (RadioButton) findViewById(R.id.option2);
        RadioButton radioOption1 = (RadioButton) findViewById(R.id.option1);
        String selected1 = radioOption1.getText().toString();
        String selected2 = radioOption2.getText().toString();
        String selected3 = radioOption3.getText().toString();

        // detect which radio button is checked
        // compare selected answer to correct answer and display a message on the screen if the user chose correctly or not
        // also change the background to red/green for wrong/correct
        if(radioOption1.isChecked()){
            if(stringArrayOptions[indexCorrect].equals(selected1)) {
                Toast.makeText(getApplicationContext(), R.string.correct, Toast.LENGTH_SHORT).show();
                radioOption1.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.correct));
                radioOption1.setButtonDrawable(R.drawable.correct);
            } else {
                Toast.makeText(getApplicationContext(), R.string.wrong, Toast.LENGTH_SHORT).show();
                radioOption1.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.wrong));
                radioOption1.setButtonDrawable(R.drawable.wrong);
            }
        } else {
            if(stringArrayOptions[indexCorrect].equals(selected1)) {
                radioOption1.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.correct));
                radioOption1.setButtonDrawable(R.drawable.correct);
            } else {
                radioOption1.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.wrong));
                radioOption1.setButtonDrawable(R.drawable.wrong);
            }
        }
        if(radioOption2.isChecked()){
            if(stringArrayOptions[indexCorrect].equals(selected2)) {
                Toast.makeText(getApplicationContext(), R.string.correct, Toast.LENGTH_SHORT).show();
                radioOption2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.correct));
                radioOption2.setButtonDrawable(R.drawable.correct);
            } else {
                Toast.makeText(getApplicationContext(), R.string.wrong, Toast.LENGTH_SHORT).show();
                radioOption2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.wrong));
                radioOption2.setButtonDrawable(R.drawable.wrong);
            }
        } else {
            if(stringArrayOptions[indexCorrect].equals(selected2)) {
                radioOption2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.correct));
                radioOption2.setButtonDrawable(R.drawable.correct);
            } else {
                radioOption2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.wrong));
                radioOption2.setButtonDrawable(R.drawable.wrong);
            }
        }
        if(radioOption3.isChecked()){
            if(stringArrayOptions[indexCorrect].equals(selected3)) {
                Toast.makeText(getApplicationContext(), R.string.correct, Toast.LENGTH_SHORT).show();
                radioOption3.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.correct));
                radioOption3.setButtonDrawable(R.drawable.correct);
            } else {
                Toast.makeText(getApplicationContext(), R.string.wrong, Toast.LENGTH_SHORT).show();
                radioOption3.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.wrong));
                radioOption3.setButtonDrawable(R.drawable.wrong);
            }
        } else {
            if(stringArrayOptions[indexCorrect].equals(selected3)) {
                radioOption3.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.correct));
                radioOption3.setButtonDrawable(R.drawable.correct);
            } else {
                radioOption3.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.wrong));
                radioOption3.setButtonDrawable(R.drawable.wrong);
            }
        }
    }

    //restart the activity to open a new test question
    public void restartTest(View view) {

        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
}
