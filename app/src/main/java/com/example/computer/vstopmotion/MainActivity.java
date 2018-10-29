package com.example.computer.vstopmotion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }

    public void imb (View view){
        Intent intent = new Intent(MainActivity.this, DetailMeActivity.class);
        startActivity(intent);
    }
}