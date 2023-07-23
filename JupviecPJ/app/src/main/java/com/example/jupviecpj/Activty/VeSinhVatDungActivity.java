package com.example.jupviecpj.Activty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.jupviecpj.R;

public class VeSinhVatDungActivity extends AppCompatActivity {
    Toolbar toolbar;

    TextView tvTitleToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ve_sinh_vat_dung);
        toolbar = findViewById(R.id.Toolbar_app);
        tvTitleToolbar = findViewById(R.id.toolbar_title);
        AppCompatActivity activity = (AppCompatActivity) this;
        activity.setSupportActionBar(toolbar);
        tvTitleToolbar.setText("Vệ sinh sofa, nệm, rèm, thảm");
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