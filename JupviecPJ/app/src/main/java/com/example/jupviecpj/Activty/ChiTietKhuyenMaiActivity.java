package com.example.jupviecpj.Activty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jupviecpj.R;

public class ChiTietKhuyenMaiActivity extends AppCompatActivity {
    Toolbar toolbar;

    TextView tvTitleToolbar;

    ImageView mimgSalesDetail;


    TextView mtvTitleSalesDetails, mtvCodeSalesDetails, mtvDateStartSalesDetails, mtvDateEndSalesDetails, mtvContentSalesDetails;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_khuyen_mai);
        toolbar = findViewById(R.id.Toolbar_app);
        tvTitleToolbar = findViewById(R.id.toolbar_title);
        mimgSalesDetail = findViewById(R.id.imgSalesDetail);
        mtvTitleSalesDetails = findViewById(R.id.tvTitleSalesDetails);
        mtvCodeSalesDetails = findViewById(R.id.tvCodeSalesDetails);
        mtvDateStartSalesDetails = findViewById(R.id.tvDateStartSalesDetails);
        mtvDateEndSalesDetails = findViewById(R.id.tvDateEndSalesDetails);
        mtvContentSalesDetails = findViewById(R.id.tvContentSalesDetails);


        AppCompatActivity activity = (AppCompatActivity) this;
        activity.setSupportActionBar(toolbar);
        tvTitleToolbar.setText("Chi tiết khuyến mãi");
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
}