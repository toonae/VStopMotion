package com.example.computer.vstopmotion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VdoSw2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vdo_sw2);
    }
    public void clickBack(View view) {
        finish();
    }
}