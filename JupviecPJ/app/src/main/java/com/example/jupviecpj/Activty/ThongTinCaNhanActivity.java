package com.example.jupviecpj.Activty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jupviecpj.R;

public class ThongTinCaNhanActivity extends AppCompatActivity {



    Toolbar toolbar;

    ImageView mimgAvatarUser;
    TextView tvTitleToolbar,tvNameUser,tvPhoneUser,tvEmailUser;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_ca_nhan);

        toolbar = findViewById(R.id.Toolbar_app);
        tvTitleToolbar = findViewById(R.id.toolbar_title);
        tvNameUser = findViewById(R.id.tvNameUserDetails);
        tvPhoneUser = findViewById(R.id.tvPhoneUser);
        mimgAvatarUser = findViewById(R.id.imgAvatarUser);


        AppCompatActivity activity = (AppCompatActivity) this;
        activity.setSupportActionBar(toolbar);
        tvTitleToolbar.setText("Cá nhân");
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



    public void btnSaveAddress_onclick(View view) {
    }

    public void btnSettingInfo_onclick(View view) {

    }

    public void btnStaffLike_onclick(View view) {
    }

    public void btnLogOut_onclick(View view) {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }

    public void btnBlockNV_onclick(View view) {
        Intent i = new Intent(getApplicationContext(),BlockNhanVienActivity.class);
        startActivity(i);
    }
}