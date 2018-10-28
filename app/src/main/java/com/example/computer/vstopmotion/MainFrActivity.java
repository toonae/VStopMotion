package com.example.computer.vstopmotion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainFrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fr);
    }

    public void clickOne  (View view){
        Intent intent = new Intent(MainFrActivity.this, DetailFr2Activity.class);
        startActivity(intent);
    }
    public void clickTwo  (View view){
        Intent intent = new Intent(MainFrActivity.this, DetailFrActivity.class);
        startActivity(intent);
    }
    public void clickThree (View view){
        Intent intent = new Intent(MainFrActivity.this, DetailFr1Activity.class);
        startActivity(intent);
    }
    public void clickFour (View view){
        Intent intent = new Intent(MainFrActivity.this, DetailFr3Activity.class);
        startActivity(intent);
    }
    public void clickFive  (View view){
        Intent intent = new Intent(MainFrActivity.this, DetailFr4Activity.class);
        startActivity(intent);
    }
}
