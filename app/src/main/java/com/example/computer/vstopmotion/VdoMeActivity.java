package com.example.computer.vstopmotion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VdoMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vdo_me);
    }
    public void clickBack(View view) {
        finish();
    }
}
