package com.example.computer.vstopmotion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_me);
    }
    public void clickNext  (View view){
        Intent intent = new Intent(MainMeActivity.this, DetailMeActivity.class);
        startActivity(intent);
    }
    public void clickNext1  (View view){
        Intent intent = new Intent(MainMeActivity.this, DetailMe1Activity.class);
        startActivity(intent);
    }
    public void clickNext2 (View view){
        Intent intent = new Intent(MainMeActivity.this, DetailMe2Activity.class);
        startActivity(intent);
    }
    public void clickNext3 (View view){
        Intent intent = new Intent(MainMeActivity.this, DetailMe3Activity.class);
        startActivity(intent);
    }
    public void clickNext4  (View view){
        Intent intent = new Intent(MainMeActivity.this, DetailMe4Activity.class);
        startActivity(intent);
    }
}
