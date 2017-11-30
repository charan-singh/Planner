package com.example.android.planner;

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

    protected void onGridClick(View v){

        Intent i = new Intent(MainActivity.this, CourseDetailsActivity.class);
        startActivity(i);
    }
}

