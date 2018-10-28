package com.example.computer.vstopmotion;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VdostopSw1Activity extends AppCompatActivity {
    VideoView Video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vdostop_sw1);

        final VideoView myVideoV = (VideoView)findViewById(R.id.videoView2);
        myVideoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.vdoyam));
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
        Video.start();
    }
}

