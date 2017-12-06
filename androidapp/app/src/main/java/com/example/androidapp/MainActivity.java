package com.example.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickCalendar(View view) {
        Intent i = new Intent(this, CalendarActivity.class);
        startActivity(i);
    }

    public void onClickTask(View view) {
        Intent i = new Intent(this, TaskPlannerActivity.class);
        startActivity(i);
    }

    public void onClickAccount(View view) {

    }

    public void onClickSettings(View view) {
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }

}
