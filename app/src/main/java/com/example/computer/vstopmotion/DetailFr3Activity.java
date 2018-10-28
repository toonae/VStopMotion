package com.example.computer.vstopmotion;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetailFr3Activity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_fr3);

        volumnImageButton3 = findViewById(R.id.imageButton7);
        mediaPlayer = MediaPlayer.create(this, R.raw.tu);
        volumnImageButton3.setOnClickListener(new View.OnClickListener() {
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
    public void clickBack(View view) {
        finish();
    }
    public  void playSound(View view) {  //ชนิดview ตัวแปรview
        mediaPlayer.start();
    }
}
