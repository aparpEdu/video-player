package com.example.video_player;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class OfflineActivity extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline);
        videoView = findViewById(R.id.offlineVideo);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.iniciativata);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
        videoView.setOnCompletionListener(view -> {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video2);
            videoView.start();
        });
    }
}