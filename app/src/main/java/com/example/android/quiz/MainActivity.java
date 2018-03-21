package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitTest(View view) {

        CheckBox azCheckBox = findViewById(R.id.az_4_corners);
        boolean azCorrect = azCheckBox.isChecked();
        CheckBox coCheckBox = findViewById(R.id.co_4_corners);
        boolean coCorrect = coCheckBox.isChecked();
        CheckBox nmCheckBox = findViewById(R.id.nm_4_corners);
        boolean nmCorrect = nmCheckBox.isChecked();
        CheckBox utCheckBox = findViewById(R.id.ut_4_corners);
        boolean utCorrect = utCheckBox.isChecked();
        RadioButton q2Answer = findViewById(R.id.q2_correct);
        boolean q2Correct = q2Answer.isChecked();
        RadioButton q3Answer = findViewById(R.id.q3_correct);
        boolean q3Correct = q3Answer.isChecked();
        RadioButton q4Answer = findViewById(R.id.q4_correct);
        boolean q4Correct = q4Answer.isChecked();
        RadioButton q5Answer = findViewById(R.id.q5_correct);
        boolean q5Correct = q5Answer.isChecked();
        RadioButton q6Answer = findViewById(R.id.q6_correct);
        boolean q6Correct = q6Answer.isChecked();
        RadioButton q7Answer = findViewById(R.id.q7_correct);
        boolean q7Correct = q7Answer.isChecked();
        int duration = Toast.LENGTH_LONG;

        EditText q8 = this.findViewById(R.id.q8);
        String answer8 = q8.getText().toString().toLowerCase().trim();
        Boolean q8Correct = (answer8.equals("santa fe"));


        if (azCorrect) {
            score = score + 1;
        }

        if (coCorrect) {
            score = score + 1;
        }

        if (nmCorrect) {
            score = score + 1;
        }

        if (utCorrect) {
            score = score + 1;
        }
        if (q2Correct) {
            score = score + 1;
        }
        if (q3Correct) {
            score = score + 1;
        }
        if (q4Correct) {
            score = score + 1;
        }
        if (q5Correct) {
            score = score + 1;
        }
        if (q6Correct) {
            score = score + 1;
        }
        if (q7Correct) {
            score = score + 1;
        }

        if (q8Correct) {
            score = score + 1;
        }

        Toast toast = Toast.makeText(this, "You scored " + score + "/11", duration);
        toast.show();

        score = 0;
    }

}


