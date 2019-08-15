package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private TextView mHel;
    private TextView mQue;
    private EditText mEdit;
    private Button mBut;
    private Button mDec;

    String line;
    int count = 0;

    List<Integer> questions = new ArrayList<Integer>();
    List<Integer> answers = new ArrayList<Integer>();

    int min = 1;
    int max = 10;
    int dif = max - min;
    Random random = new Random();
    int number1 = random.nextInt(dif) + min;
    int number2 = random.nextInt(dif) + min;
    int number3 = random.nextInt(dif) + min;

    String QUESTION = "-%d * (%d - %d)";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHel = findViewById(R.id.textViewMark);
        mQue = findViewById(R.id.textViewQuest);
        mEdit = findViewById(R.id.editTextAnswer);
        mBut = findViewById(R.id.buttonInt);
        mDec = findViewById(R.id.butDecision);


        mQue.setText(String.format(QUESTION, number1, number2, number3));


    }

    //сравниваем ответ пользовавтеля
    //с правильным ответом
    public void test(View view) {
        if (count < 4) {
            String answer = mEdit.getText().toString().trim();
            String rightAnswer = String.valueOf(-number1 * (number2 - number3));
            Tester tester = new Tester(answer, rightAnswer);
            mHel.setText(tester.test());

        }
    }

    public void decision(View view) {
        Toast.makeText(this, "Выполни действе в скобках, а затем умножь", Toast.LENGTH_LONG).show();
    }
}