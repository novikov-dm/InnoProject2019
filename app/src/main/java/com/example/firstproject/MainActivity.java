package com.example.firstproject;

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
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int nProblems = 7;
    private Problem[] problems = new Problem[nProblems];

    private TextView mHel;
    private TextView mQue;
    private EditText mEdit;
    private Button mBut;
    private Button mDec;
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
        setContentView(R.layout.activity_main);

        mProgressBar = findViewById(R.id.progressBar);

        mQue = findViewById(R.id.textViewQuest);
        mEdit = findViewById(R.id.editTextAnswer);
        mBut = findViewById(R.id.buttonInt);
        mDec = findViewById(R.id.butDecision);

        problems[0] = new Problem1();
        problems[1] = new Problem2();
        problems[2] = new Problem3();
        problems[3] = new Problem4();
        problems[4] = new Problem5();
        problems[5] = new Problem7();
        problems[6] = new Problem8();


        mQue.setMovementMethod(new ScrollingMovementMethod());
        mQue.setText(problems[count].getRequirement());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.about:
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
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
            problems[count].setUserAnswer(mEdit.getText().toString().trim());
            if (problems[count].getVerdict()) {
                mEdit.setText("");
                Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show();
                count++;
                mProgressBar.setProgress(count * 10);
                if (count < nProblems) {
                    mQue.setText(problems[count].getRequirement());
                }
                else{
                    Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                    startActivity(intent);
                }
            } else {
                mEdit.setText("");
                Toast.makeText(this, "Неверно(", Toast.LENGTH_SHORT).show();
            }
    }
}