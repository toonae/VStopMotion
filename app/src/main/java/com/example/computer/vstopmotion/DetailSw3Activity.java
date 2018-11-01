package com.example.computer.vstopmotion;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetailSw3Activity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sw3);

        volumnImageButton = findViewById(R.id.imageButton19);
        mediaPlayer = MediaPlayer.create(this, R.raw.sbua);
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
    public void clickVdo3  (View view){
        Intent intent = new Intent(DetailSw3Activity.this, VdostopSw3Activity.class);
        startActivity(intent);
    }
    public void clickNext3  (View view){
        Intent intent = new Intent(DetailSw3Activity.this, VdoSw3Activity.class);
        startActivity(intent);
    }

    public void clickBack(View view) {
        finish();
    }
    public  void playSound(View view) {  //ชนิดview ตัวแปรview
        mediaPlayer.start();
    }
}

