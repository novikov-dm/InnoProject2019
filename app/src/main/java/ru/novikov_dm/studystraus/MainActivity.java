package ru.novikov_dm.studystraus;
//главная страница, вход в программу
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
import android.widget.TextView;
import android.widget.Toast;

import com.example.firstproject.R;

public class MainActivity extends AppCompatActivity {

    private int nProblems = 7;                                     //в массиве 7 задач
    private Problem[] problems = new Problem[nProblems];

    private TextView mTextViewQuestion;
    private EditText mEditTextAnswer;
    private Button mButtonInt;
    private Button mButtonDecision;

    String line;
    int count = 0;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);       //создаем раздел меню
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);                      //переключаем задачки
        setContentView(R.layout.activity_main);

        mTextViewQuestion = findViewById(R.id.textViewQuest);
        mEditTextAnswer = findViewById(R.id.editTextAnswer);          //все кнопки, функционал
        mButtonInt = findViewById(R.id.buttonInt);
        mButtonDecision = findViewById(R.id.butDecision);

        problems[0] = new Problem1();           //создаем массив из задач
        problems[1] = new Problem2();
        problems[2] = new Problem3();
        problems[3] = new Problem4();
        problems[4] = new Problem5();
        problems[5] = new Problem7();
        problems[6] = new Problem8();


        mTextViewQuestion.setMovementMethod(new ScrollingMovementMethod());
        mTextViewQuestion.setText(problems[count].getRequirement());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.about:                                                                     //переходим из меню в информацию о приложении
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent);
                return true;
            default:
                    return super.onOptionsItemSelected(item);
        }
    }

    public void decision(View view) {
        Toast.makeText(this, "А кто сказал, что у нас есть решение?", Toast.LENGTH_SHORT).show(); //кнопочка Показать решение
    }



    public void test(View view) {
            problems[count].setUserAnswer(mEditTextAnswer.getText().toString().trim()); //кнопочка проверить
            if (problems[count].getVerdict()) {
                Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show();
                count++;
                if (count < nProblems) {
                    mTextViewQuestion.setText(problems[count].getRequirement());
                }
            } else {
                Toast.makeText(this, "Неверно(", Toast.LENGTH_SHORT).show();
            }
    }

    public Button getmBut() {
        return mButtonInt;
    }

    public void setmBut(Button mBut) {
        this.mButtonInt = mBut;
    }

    public Button getmButtonDecision() {
        return mButtonDecision;
    }

    public void setmButtonDecision(Button mButtonDecision) {
        this.mButtonDecision = mButtonDecision;
    }
}