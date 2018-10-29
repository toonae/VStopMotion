package com.example.computer.vstopmotion;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetailSw2Activity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sw2);
        volumnImageButton = findViewById(R.id.imageButton18);
        mediaPlayer = MediaPlayer.create(this, R.raw.tu);
        volumnImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                }else {
                    mediaPlayer.start();

                }

            }
        });
    }
    public void clickVdo2  (View view){
        Intent intent = new Intent(DetailSw2Activity.this, VdostopSw2Activity.class);
        startActivity(intent);
    }
    public void clickNext2  (View view){
        Intent intent = new Intent(DetailSw2Activity.this, VdoSw2Activity.class);
        startActivity(intent);
    }

    public void clickBack(View view) {
        finish();
    }
    public  void playSound(View view) {  //ชนิดview ตัวแปรview
        mediaPlayer.start();
    }
}

