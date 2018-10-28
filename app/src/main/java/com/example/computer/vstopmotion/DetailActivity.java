package com.example.computer.vstopmotion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    public void next (View view) {
        Intent intent = new Intent(DetailActivity.this, VdoActivity.class);
        startActivity(intent);
    }
    public void clickVdo (View view) {
        Intent intent = new Intent(DetailActivity.this, VdostopActivity.class);
        startActivity(intent);
    }

}
