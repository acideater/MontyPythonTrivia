package net.skoba.montypythontrivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {


    int triviaScore = 0; //variable for counting the score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    /*
     * Method for question 1.
     */
    public void questionOne() {

        RadioButton answer12 = findViewById(R.id.answer12);

        if (answer12.isChecked()) {
            triviaScore = triviaScore + 42;
        }
    }

    /*
     * Method for question 2.
     */
    public void questionTwo() {

        RadioButton answer21 = findViewById(R.id.answer21);
        if (answer21.isChecked()) {
            triviaScore = triviaScore + 42;
        }

    }

    /*
     * Method for question 3
     */
    public void questionThree() {

        RadioButton answer34 = findViewById(R.id.answer34);

        if (answer34.isChecked()) {
            triviaScore = triviaScore + 42;
        }
    }

    /*
     * Method for question 4
     */
    public void questionFour() {

        RadioButton answer42 = findViewById(R.id.answer42);

        if (answer42.isChecked()) {
            triviaScore = triviaScore + 42;
        }
    }

    /*
     * Method for question 5
     */
    public void questionFive() {

        RadioButton answer53 = findViewById(R.id.answer53);

        if (answer53.isChecked()) {
            triviaScore = triviaScore + 42;
        }
    }

    /*
     * Method for question 6
     */
    public void questionSix() {
        EditText text = (EditText) findViewById(R.id.answer60); //gets you the contents of edit text
        String answer60 = text.getText().toString();

        if ("Terry Jones".equalsIgnoreCase(answer60)) {
            triviaScore = triviaScore + 42;
        }
    }

    /*
     * Method for question 7
     */
    public void questionSeven() {

        RadioButton answer74 = findViewById(R.id.answer74);

        if (answer74.isChecked()) {
            triviaScore = triviaScore + 42;
        }
    }

    /*
     * Method for question 8
     */
    public void questionEight() {

        RadioButton answer82 = findViewById(R.id.answer82);

        if (answer82.isChecked()) {
            triviaScore = triviaScore + 42;
        }
    }

    /*
     * Method for question 9
     */
    public void questionNine() {

        RadioButton answer91 = findViewById(R.id.answer91);

        if (answer91.isChecked()) {
            triviaScore = triviaScore + 42;
        }
    }

    /*
     * Method for question 10.
     */
    public void questionTen() {

        CheckBox answer101 = findViewById(R.id.answer101);
        if (answer101.isChecked()) {
            triviaScore = triviaScore + 14;
        }

        CheckBox answer102 = findViewById(R.id.answer102);
        if (answer102.isChecked()) {
            triviaScore = triviaScore - 7;
        }

        CheckBox answer103 = findViewById(R.id.answer103);
        if (answer103.isChecked()) {
            triviaScore = triviaScore + 14;
        }

        CheckBox answer104 = findViewById(R.id.answer104);
        if (answer104.isChecked()) {
            triviaScore = triviaScore - 7;
        }

        CheckBox answer105 = findViewById(R.id.answer105);
        if (answer105.isChecked()) {
            triviaScore = triviaScore - 7;
        }

        CheckBox answer106 = findViewById(R.id.answer106);
        if (answer106.isChecked()) {
            triviaScore = triviaScore + 14;
        }

        CheckBox answer107 = findViewById(R.id.answer107);
        if (answer107.isChecked()) {
            triviaScore = triviaScore - 7;
        }

        CheckBox answer108 = findViewById(R.id.answer108);
        if (answer108.isChecked()) {
            triviaScore = triviaScore - 7;
        }

        CheckBox answer109 = findViewById(R.id.answer109);
        if (answer109.isChecked()) {
            triviaScore = triviaScore - 7;
        }
    }

    public void finalScore() {
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
        questionSeven();
        questionEight();
        questionNine();
        questionTen();
    }

    public void openResultsActivity(View view) {
        finalScore();

        Intent resultsIntent = new Intent(this, ResultsActivity.class);
        resultsIntent.putExtra("finalScore", triviaScore);
        startActivity(resultsIntent);
    }




    /*
     * TODOs:
     * add empty question warning
     */

}

