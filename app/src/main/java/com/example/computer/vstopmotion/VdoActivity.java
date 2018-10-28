package com.example.computer.vstopmotion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class VdoActivity extends AppCompatActivity {
ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vdo);

        im = findViewById(R.id.im6);
    }
}
