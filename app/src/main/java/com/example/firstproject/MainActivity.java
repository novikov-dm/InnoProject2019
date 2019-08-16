package com.example.firstproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Problem problem = new Problem();
    private TextView mHel;
    private TextView mQue;
    private EditText mEdit;
    private Button mBut;
    private Button mDec;

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

        mHel = findViewById(R.id.textViewMark);
        mQue = findViewById(R.id.textViewQuest);
        mEdit = findViewById(R.id.editTextAnswer);
        mBut = findViewById(R.id.buttonInt);
        mDec = findViewById(R.id.butDecision);



        mQue.setText(problem.getRequirement());

    }

    public void decision(View view) {
        Toast.makeText(this, "Посчитай внимательнее", Toast.LENGTH_SHORT).show();
    }

    public void test(View view) {
        problem.setUserAnswer(Double.parseDouble(mEdit.getText().toString()));
        if (problem.getVerdict()) {
            mHel.setText("YES");
        } else {
            mHel.setText("NO");
        }
    }
}