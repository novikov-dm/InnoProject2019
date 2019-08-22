package ru.novikov_dm.studystraus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problems1Activity extends AppCompatActivity {

    private int nProblems = 7;
    private Problem[] problems = new Problem[nProblems];

    private TextView mHel;
    private TextView mTextViewQuestion;
    private EditText mEditTextAnswer;
    private Button mButtonInt;
    private Button mButDecision;
    private ImageView mWrong;
    private ProgressBar mProgressBar;
    String line;
    int count = 0;

    List<Integer> questions = new ArrayList<Integer>();
    List<Integer> answers = new ArrayList<Integer>();


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems1);

        mProgressBar = findViewById(R.id.progressBar);

        mTextViewQuestion = findViewById(R.id.textViewQuest);
        mEditTextAnswer = findViewById(R.id.editTextAnswer);
        mButtonInt = findViewById(R.id.buttonInt);
        mButDecision = findViewById(R.id.butDecision);


        problems[0] = new Problem1();
        problems[1] = new Problem2();
        problems[2] = new Problem3();
        problems[3] = new Problem4();
        problems[4] = new Problem5();
        problems[5] = new Problem7();
        problems[6] = new Problem8();

        Collections.shuffle(Arrays.asList(problems));

        mTextViewQuestion.setMovementMethod(new ScrollingMovementMethod());
        mTextViewQuestion.setText(problems[count].getRequirement());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.about:
                Intent intent = new Intent(Problems1Activity.this, InfoActivity.class);
                startActivity(intent);
                return true;
            default:
                    return super.onOptionsItemSelected(item);
        }
    }

    public void decision(View view) {
        Toast.makeText(this, "А кто сказал, что у нас есть решение?", Toast.LENGTH_SHORT).show();
    }

    public void test(View view) {
            problems[count].setUserAnswer(mEditTextAnswer.getText().toString().trim());
            if (problems[count].getVerdict()) {
                mEditTextAnswer.setText("");
                Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show();
                count++;
                mProgressBar.setProgress(count * 10);
                if (count < nProblems) {
                    mTextViewQuestion.setText(problems[count].getRequirement());
                }
                else{
                    Intent intent = new Intent(Problems1Activity.this, EndScreenActivity.class);
                    startActivity(intent);
                }
            } else {
                mEditTextAnswer.setText("");
                Toast.makeText(this, "Неверно(", Toast.LENGTH_SHORT).show();
            }
    }

}