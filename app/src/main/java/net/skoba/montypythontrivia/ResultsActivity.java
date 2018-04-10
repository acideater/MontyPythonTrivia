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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    int finalScore; //variable holding the score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        // set of title, image and text for each result
        ImageView resultsImage = findViewById(R.id.resultsImage);
        TextView resultsMessage = findViewById(R.id.resultsMessage);
        TextView resultsTitle = findViewById(R.id.resultsTitle);
        TextView results = findViewById(R.id.results);
        // brings to this activity the score from last activity's quiz
        finalScore = getIntent().getIntExtra("finalScore", 0);

        //points and results
        if (finalScore >= 320) {
            resultsImage.setImageResource(R.drawable.twit);
            resultsMessage.setText(getString(R.string.yay_text));
            resultsTitle.setText(getString(R.string.yay_title));
            results.setText(finalScore + getString(R.string.total));
        }
        if (finalScore >= 120 && finalScore <= 319) {
            resultsImage.setImageResource(R.drawable.dulllife);
            resultsMessage.setText(getString(R.string.ehh_text));
            resultsTitle.setText(getString(R.string.ehh_title));
            results.setText(finalScore + getString(R.string.total));
        }
        if (finalScore >= 0 && finalScore <= 119) {
            resultsImage.setImageResource(R.drawable.spanishinquisition);
            resultsMessage.setText(getString(R.string.bad_text));
            resultsTitle.setText(getString(R.string.bad_title));
            results.setText(finalScore + getString(R.string.total));
        }

        // try again (reset) button
        Button resetQuiz = findViewById(R.id.reset);
        resetQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tryAgain = new Intent(ResultsActivity.this, MainActivity.class);
                startActivity(tryAgain);
            }
        });
    }
}

