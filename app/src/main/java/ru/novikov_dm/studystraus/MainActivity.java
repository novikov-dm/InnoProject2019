package ru.novikov_dm.studystraus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    //private int nProblems = 7;
    //private Problem[] problems = new Problem[nProblems];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void toProblems1(View view) {


        //problems[0] = new Problem1();
        //problems[1] = new Problem2();
        //problems[2] = new Problem3();
        //problems[3] = new Problem4();
        //problems[4] = new Problem5();
        //problems[5] = new Problem7();
        //problems[6] = new Problem8();

        Problems problems = new Problems(new Problem1(), new Problem2(), new Problem3(), new Problem4(), new Problem5());

        Intent intent = new Intent(MainActivity.this, Problems1Activity.class);
        intent.putExtra(Problems.class.getSimpleName(), problems);
        startActivity(intent);
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
}

