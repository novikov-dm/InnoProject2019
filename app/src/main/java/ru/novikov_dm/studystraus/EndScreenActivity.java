package ru.novikov_dm.studystraus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EndScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_screen);
    }

    public void toMain(View view) {
        Intent intent = new Intent(EndScreenActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void toProblem1(View view) {
        Intent intent = new Intent(EndScreenActivity.this, Problem1.class);
        startActivity(intent);
    }
}
