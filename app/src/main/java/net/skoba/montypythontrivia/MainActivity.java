/**
 * Grow With Google Scholarship: Android Basics
 * Project: Quiz App
 * Version: 1.0
 * App Name: Monty Python Trivia
 * Author: AnaP Pimentel
 */


package net.skoba.montypythontrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Variable for the trivia score.
     */
    int triviaScore = 0;

    /**
     * Method for question 1.
     */
    public void questionOne() {

        RadioButton answer12 = findViewById(R.id.answer12);

        if (answer12.isChecked()) {
            triviaScore = triviaScore + 42;
        }
    }

    /**
     * Method for question 2.
     */
    public void questionTwo() {

        RadioButton answer21 = findViewById(R.id.answer21);
        if (answer21.isChecked()) {
            triviaScore = triviaScore + 42;
        }

    }

    /**
     * Method for question 3
     */
    public void questionThree() {

        RadioButton answer34 = findViewById(R.id.answer34);

        if (answer34.isChecked()) {
            triviaScore = triviaScore + 42;
        }
    }

    /**
     * Method for question 4
     */
    public void questionFour() {

        RadioButton answer42 = findViewById(R.id.answer42);

        if (answer42.isChecked()) {
            triviaScore = triviaScore + 42;
        }
    }

    /**
     * Method for question 5
     */
    public void questionFive() {

        RadioButton answer53 = findViewById(R.id.answer53);

        if (answer53.isChecked()) {
            triviaScore = triviaScore + 42;
        }
    }





    /**
     * Method for question 10.
     */
    public void questionTen() {

        CheckBox answer101 = findViewById(R.id.answer101);
        if (answer101.isChecked()) {
            triviaScore = triviaScore + 14;
        }

        CheckBox answer103 = findViewById(R.id.answer103);
        if (answer103.isChecked()) {
            triviaScore = triviaScore + 14;
        }

        CheckBox answer106 = findViewById(R.id.answer106);
        if (answer106.isChecked()) {
            triviaScore = triviaScore + 14;
        }
    }





   // dead end
}