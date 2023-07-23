package com.example.jupviecpj.Activty;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.jupviecpj.R;

public class VideoFullScreenActivity extends AppCompatActivity {

    WebView mVideoFullScreen;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_full_screen);
        mVideoFullScreen = findViewById(R.id.fullScreen_Video);

        String link = getIntent().getStringExtra("link");

        mVideoFullScreen.loadUrl(link);
        mVideoFullScreen.setWebViewClient(new WebViewClient());
        mVideoFullScreen.setWebChromeClient(new WebChromeClient());
        mVideoFullScreen.getSettings().setJavaScriptEnabled(true);
    }
}