package com.example.jupviecpj.Activty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.example.jupviecpj.R;

public class TrungTamHoTroActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView tvTitleToolbar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trung_tam_ho_tro);
        toolbar = findViewById(R.id.Toolbar_app);
        tvTitleToolbar = findViewById(R.id.toolbar_title);


        AppCompatActivity activity = (AppCompatActivity) this;
        activity.setSupportActionBar(toolbar);
        tvTitleToolbar.setText("Trung tâm hỗ trợ");
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
    public void btn_FacebookJupViec(View view) {
        Intent ifb = new Intent(Intent.ACTION_VIEW);
        ifb.setData(Uri.parse("https://www.facebook.com/JupViec?mibextid=ZbWKwL"));
        startActivity(ifb);
    }

    public void btn_websiteJupViec(View view) {
        Intent iws = new Intent(Intent.ACTION_VIEW);
        iws.setData(Uri.parse("https://jupviec.vn/"));
        startActivity(iws);
    }
}