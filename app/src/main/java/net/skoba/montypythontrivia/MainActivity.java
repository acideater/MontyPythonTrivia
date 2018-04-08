/*
 * Grow With Google Scholarship: Android Basics
 * Project: Quiz App
 * Version: 1.1
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    public void openStartActivity(View view) {
        Intent i = new Intent(this, StartActivity.class);
        startActivity(i);
    }


}