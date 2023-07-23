package com.example.jupviecpj.Activty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.example.jupviecpj.R;

public class CauHoiThuongGapActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView tvTitleToolbar;

    WebView mwebViewCHTG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau_hoi_thuong_gap);
        toolbar = findViewById(R.id.Toolbar_app);
        tvTitleToolbar = findViewById(R.id.toolbar_title);

        mwebViewCHTG = findViewById(R.id.WebView_CHTG);
        mwebViewCHTG.loadUrl("https://legacy.jupviec.vn/cau-hoi-thuong-gap/");
        mwebViewCHTG.setWebViewClient(new WebViewClient());
        WebSettings webSettings = mwebViewCHTG.getSettings();
        webSettings.setJavaScriptEnabled(true);

        AppCompatActivity activity = (AppCompatActivity) this;
        activity.setSupportActionBar(toolbar);
        tvTitleToolbar.setText("Câu hỏi thường gặp");
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
        if (mwebViewCHTG.canGoBack()){
            mwebViewCHTG.goBack();
        } else {
            super.onBackPressed();
        }
    }
}