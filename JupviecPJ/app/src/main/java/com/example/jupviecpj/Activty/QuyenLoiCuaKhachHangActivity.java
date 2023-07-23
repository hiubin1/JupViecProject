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

public class QuyenLoiCuaKhachHangActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView tvTitleToolbar;

    WebView mwebViewQLCKH;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quyen_loi_cua_khach_hang);
        toolbar = findViewById(R.id.Toolbar_app);
        tvTitleToolbar = findViewById(R.id.toolbar_title);

        mwebViewQLCKH = findViewById(R.id.WebView_QLCKH);
        mwebViewQLCKH.loadUrl("https://legacy.jupviec.vn/cam-ket-cua-chung-toi.html?fbclid=IwAR2WMLVIkN1KKMzQnLDciVXtBmvCIbATMYo0PjZ6VC7G59tEENv-XNoHJw4");
        mwebViewQLCKH.setWebViewClient(new WebViewClient());
        WebSettings webSettings = mwebViewQLCKH.getSettings();
        webSettings.setJavaScriptEnabled(true);

        AppCompatActivity activity = (AppCompatActivity) this;
        activity.setSupportActionBar(toolbar);
        tvTitleToolbar.setText("Quyền lợi của khách hàng");
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
        if (mwebViewQLCKH.canGoBack()){
            mwebViewQLCKH.goBack();
        } else {
            super.onBackPressed();
        }
    }
}