package com.example.computer.vstopmotion;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetailSw1Activity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sw1);

        volumnImageButton = findViewById(R.id.imageButton17);
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
    public void clickVdo1  (View view){
        Intent intent = new Intent(DetailSw1Activity.this, VdostopSw1Activity.class);
        startActivity(intent);
    }
    public void clickNext1  (View view){
        Intent intent = new Intent(DetailSw1Activity.this, VdoSw1Activity.class);
        startActivity(intent);
    }

    public void clickBack(View view) {
        finish();
    }
    public  void playSound(View view) {  //ชนิดview ตัวแปรview
        mediaPlayer.start();
    }
}

