package com.example.computer.vstopmotion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainSwActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sw);
    }

    public void clickO (View view){
        Intent intent = new Intent(MainSwActivity.this, DetailSwActivity.class);
        startActivity(intent);
    }

    public void clickT (View view){
        Intent intent = new Intent(MainSwActivity.this, DetailSw1Activity.class);
        startActivity(intent);
    }

    public void clickTh (View view){
        Intent intent = new Intent(MainSwActivity.this, DetailSw2Activity.class);
        startActivity(intent);
    }

    public void clickF (View view){
        Intent intent = new Intent(MainSwActivity.this, DetailSw3Activity.class);
        startActivity(intent);
    }

    public void clickFi (View view){
        Intent intent = new Intent(MainSwActivity.this, DetailSw4Activity.class);
        startActivity(intent);
    }
}
