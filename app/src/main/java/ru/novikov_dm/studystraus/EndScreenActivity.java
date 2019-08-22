package ru.novikov_dm.studystraus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.about:
                Intent intent = new Intent(EndScreenActivity.this, InfoActivity.class);
                startActivity(intent);
                return true;
            case R.id.tasks:
                intent = new Intent(EndScreenActivity.this, MainActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
