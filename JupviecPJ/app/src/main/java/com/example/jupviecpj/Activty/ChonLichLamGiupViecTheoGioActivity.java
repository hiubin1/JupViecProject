package com.example.jupviecpj.Activty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.jupviecpj.Adapter.NgayLamViecGVTGAdapter;
import com.example.jupviecpj.Class.NgayLamGVTG;
import com.example.jupviecpj.R;

import java.util.ArrayList;

public class ChonLichLamGiupViecTheoGioActivity extends AppCompatActivity {

    Toolbar toolbar;

    TextView tvTitleToolbar;

    private RecyclerView mRCviewNgayLamViecGVTG;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<NgayLamGVTG> listNgay;
    private NgayLamViecGVTGAdapter ngayLamViecGVTGAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_lich_lam_giup_viec_theo_gio);
        toolbar = findViewById(R.id.Toolbar_app);
        tvTitleToolbar = findViewById(R.id.toolbar_title);
        AppCompatActivity activity = (AppCompatActivity) this;
        activity.setSupportActionBar(toolbar);
        tvTitleToolbar.setText("Giúp việc theo giờ");
        activity.getSupportActionBar().setDisplayShowTitleEnabled(false);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setRCviewNgayLamViecGVTG();
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

    public void setRCviewNgayLamViecGVTG(){
        mRCviewNgayLamViecGVTG = findViewById(R.id.RCView_NgayLamGVTG);
        layoutManager = new LinearLayoutManager(ChonLichLamGiupViecTheoGioActivity.this,LinearLayoutManager.HORIZONTAL,false);
        mRCviewNgayLamViecGVTG.setLayoutManager(layoutManager);
        listNgay = NgayLamGVTG.init();
        ngayLamViecGVTGAdapter = new NgayLamViecGVTGAdapter(ChonLichLamGiupViecTheoGioActivity.this,R.layout.list_ngaylamviec_gvtg,listNgay);
        mRCviewNgayLamViecGVTG.setAdapter(ngayLamViecGVTGAdapter);
    }

    public void btnTiepTucChonLichLamGVTG(View view) {
        Intent i = new Intent(getApplicationContext(), XacNhanDichVuGVTGActivity.class);
        startActivity(i);
    }
}