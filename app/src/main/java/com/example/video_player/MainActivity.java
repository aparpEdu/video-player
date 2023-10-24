package com.example.video_player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button online = findViewById(R.id.online);
        Button offline = findViewById(R.id.offline);
        online.setOnClickListener(view ->
                startActivity(new Intent(getApplicationContext(), OnlineActivity.class)));
        offline.setOnClickListener(view ->
                startActivity(new Intent(getApplicationContext(), OfflineActivity.class)));
    }
}