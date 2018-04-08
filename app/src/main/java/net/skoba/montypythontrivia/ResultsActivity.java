package net.skoba.montypythontrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    int finalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView resultsMessage = findViewById(R.id.resultsMessage);
        TextView resultsTitle = findViewById(R.id.resultsTitle);
        TextView results = findViewById(R.id.results);
        finalScore = getIntent().getIntExtra("finalScore", 0);

        if (finalScore >= 300) {
            resultsMessage.setText(getString(R.string.yay_text));
            resultsTitle.setText(getString(R.string.yay_title));
            results.setText(finalScore + getString(R.string.total));
        }
        if (finalScore >= 100 && finalScore <= 299) {
            resultsMessage.setText(getString(R.string.ehh_text));
            resultsTitle.setText(getString(R.string.ehh_title));
            results.setText(finalScore + getString(R.string.total));
        }
        if (finalScore >= 0 && finalScore <= 99) {
            resultsMessage.setText(getString(R.string.bad_text));
            resultsTitle.setText(getString(R.string.bad_title));
            results.setText(finalScore + getString(R.string.total));
        }

        Button resetQuiz = findViewById(R.id.reset);
        resetQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beginIntent = new Intent(ResultsActivity.this, StartActivity.class);
                startActivity(beginIntent);
            }
        });
    }
}

