package net.skoba.montypythontrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
    }

     /*
     * Show score in a toast message.

    public void submitAnswers(View view) {

        scoreTotal();

        if (triviaScore >= 360) {
            String result = "CONGRATS! You got " + triviaScore + " points.";
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        }
        if (triviaScore >= 200 && triviaScore <= 359) {
            String result = "OK... You got " + triviaScore + " points.";
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        }
        if (triviaScore >= 43 && triviaScore <= 199) {
            String result = "BAD... You got " + triviaScore + " points.";
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        }
        if (triviaScore <= 42) {
            String result = "AWFUL... You got " + triviaScore + " points.";
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        }
        triviaScore = 0;

    }
     */
}
