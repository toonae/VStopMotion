package com.example.computer.vstopmotion;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class DetailFr3Activity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton3;
    VideoView Video;

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

        final VideoView myVideoV = (VideoView)findViewById(R.id.videoView14);
        myVideoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.vma));
        myVideoV.setMediaController(new MediaController(this));
        myVideoV.requestFocus();

        myVideoV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myVideoV.isPressed())
                {
                    myVideoV.start();
                } else {
                    myVideoV.pause();
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
