package com.example.jupviecpj.Activty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.example.jupviecpj.R;

public class PhapLyActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView tvTitleToolbar;

    WebView mwebViewPhapLy;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phap_ly);
        toolbar = findViewById(R.id.Toolbar_app);
        tvTitleToolbar = findViewById(R.id.toolbar_title);

        mwebViewPhapLy = findViewById(R.id.WebView_PhapLy);
        mwebViewPhapLy.loadUrl("https://legacy.jupviec.vn/dieu-khoan-su-dung.html?fbclid=IwAR1bgEuubtdOhcJg2hML35kTQl_ZuKLM-ljw-up4c_d7ewtrHC0iQiolSgY");
        mwebViewPhapLy.setWebViewClient(new WebViewClient());
        WebSettings webSettings = mwebViewPhapLy.getSettings();
        webSettings.setJavaScriptEnabled(true);

        AppCompatActivity activity = (AppCompatActivity) this;
        activity.setSupportActionBar(toolbar);
        tvTitleToolbar.setText("Pháp lý");
        activity.getSupportActionBar().setDisplayShowTitleEnabled(false);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        if (mwebViewPhapLy.canGoBack()){
            mwebViewPhapLy.goBack();
        } else {
            super.onBackPressed();
        }
    }
}