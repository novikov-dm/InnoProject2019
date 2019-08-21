package ru.novikov_dm.studystraus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    //private int nProblems = 7;
    //private Problem[] problems = new Problem[nProblems];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toProblems1(View view) {


        //problems[0] = new Problem1();
        //problems[1] = new Problem2();
        //problems[2] = new Problem3();
        //problems[3] = new Problem4();
        //problems[4] = new Problem5();
        //problems[5] = new Problem7();
        //problems[6] = new Problem8();

        Intent intent = new Intent(MainActivity.this, Problems1Activity.class);
        startActivity(intent);
    }
}
