package com.example.computer.vstopmotion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void clickM (View view){
        Intent intent = new Intent(MainMenuActivity.this, MainMeActivity.class);
        startActivity(intent);
    }
    public void clickS (View view){
        Intent intent = new Intent(MainMenuActivity.this, MainSwActivity.class);
        startActivity(intent);
    }
    public void clickF (View view){
        Intent intent = new Intent(MainMenuActivity.this, MainFrActivity.class);
        startActivity(intent);
    }

    public void clickSearch (View view){
        Intent intent = new Intent(MainMenuActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void clickPro (View view){
        Intent intent = new Intent(MainMenuActivity.this, NewActivity.class);
        startActivity(intent);
    }
    public void clickH (View view){
        Intent intent = new Intent(MainMenuActivity.this, HistoryActivity.class);
        startActivity(intent);
    }
}
