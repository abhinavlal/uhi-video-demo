package com.practo.uhivideodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Medibuddy
        button = (Button) findViewById(R.id.button_mb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity("https://abha-video-call.mbstg.in/");
            }
        });

        button = (Button) findViewById(R.id.button_bajaj);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity("https://doctors.bajajfinservhealth.in/join/telemedicine?t=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjEzNmUxMS0wYjRkLTQ5MGUtODQzZi00ZGU1ODg0OTUxNDciLCJhdWQiOiJwYXRpZW50IiwiaXNzIjoiZHJ4IiwianRpIjoiNGM2OGI0NTktZGZkZS00OWJiLTllOTAtODg5NjI0NmIzNjU0IiwiaWF0IjoxNjY5ODg5OTM1LCJleHAiOjE2NzE1NTk4MDg1MzV9.rIoPUO-o61v6q_pLPIgjm1DpnK4t0FbaRUs34eP38xg");
            }
        });

        button = (Button) findViewById(R.id.button_practo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity("https://practouhi.app.100ms.live/meeting/xhc-tsq-zft");
            }
        });
    }
    public void openNewActivity(String url){
        Intent intent = new Intent(this, ConsultationRoomActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }
}