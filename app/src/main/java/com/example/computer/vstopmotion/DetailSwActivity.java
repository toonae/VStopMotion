package com.example.computer.vstopmotion;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetailSwActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sw);

        volumnImageButton = findViewById(R.id.imageButton16);
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

    public void clickVdo  (View view){
        Intent intent = new Intent(DetailSwActivity.this, DetailFr2Activity.class);
        startActivity(intent);
    }
    public void clickNext  (View view){
        Intent intent = new Intent(DetailSwActivity.this, DetailFr2Activity.class);
        startActivity(intent);
    }

    public void clickBack(View view) {
        finish();
    }
    public  void playSound(View view) {  //ชนิดview ตัวแปรview
        mediaPlayer.start();
    }
}

