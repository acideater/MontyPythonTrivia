/*
 * Grow With Google Scholarship: Android Basics
 * Project: Quiz App
 * Version: 1.2
 * App Name: Monty Python Trivia
 * Author: AnaP Pimentel
 */

package net.skoba.montypythontrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // open next activity with quiz
    public void openStartActivity(View view) {
        Intent startTrivia = new Intent(this, QuizActivity.class);
        startActivity(startTrivia);
    }


}