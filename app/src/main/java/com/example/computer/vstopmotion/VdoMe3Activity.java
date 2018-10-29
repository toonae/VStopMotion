package com.example.computer.vstopmotion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VdoMe3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vdo_me3);
    }
    public void clickBack(View view) {
        finish();
    }
}
