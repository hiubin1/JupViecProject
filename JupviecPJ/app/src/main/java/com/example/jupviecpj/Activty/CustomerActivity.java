package com.example.jupviecpj.Activty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jupviecpj.FragmentCus.FragmentActivity;
import com.example.jupviecpj.FragmentCus.FragmentHistory;
import com.example.jupviecpj.FragmentCus.FragmentHome;
import com.example.jupviecpj.FragmentCus.FragmentMore;
import com.example.jupviecpj.FragmentCus.FragmentNotice;

import com.example.jupviecpj.R;
import com.example.jupviecpj.databinding.ActivityCustomerBinding;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CustomerActivity extends AppCompatActivity {


    ActivityCustomerBinding binding;





    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadFragment(new FragmentHome());





        BottomNavigationView bottomNavigation = findViewById(R.id.bottom_nav_cus);
        BadgeDrawable badgeDrawable = bottomNavigation.getOrCreateBadge(R.id.nav_notice);
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(7);



        binding.bottomNavCus.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_home) {
                loadFragment(new FragmentHome());
            } else if (item.getItemId() == R.id.nav_history) {
                loadFragment(new FragmentHistory());

            } else if (item.getItemId() == R.id.nav_activty) {
                loadFragment(new FragmentActivity());

            } else if (item.getItemId() == R.id.nav_notice) {
                loadFragment(new FragmentNotice());

            } else if (item.getItemId() == R.id.nav_more) {
                loadFragment(new FragmentMore());

            }
            return true;
        });
    }
        private void loadFragment (Fragment fragment){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.Frame_container, fragment);
            fragmentTransaction.commit();
        }

    public void imgbtnAvaterUser_onclick(View view) {
        Intent i = new Intent(getApplicationContext(),ThongTinCaNhanActivity.class);
        startActivity(i);
    }

    public void btnAddress_onclick(View view) {
    }



    public void btnBlockNV_onclick(View view) {
        Intent i = new Intent(getApplicationContext(),BlockNhanVienActivity.class);
        startActivity(i);
    }

    public void btnQuest_onclick(View view) {
        Intent i = new Intent(getApplicationContext(), CauHoiThuongGapActivity.class);
        startActivity(i);
    }

    public void btnBenefits_onclick(View view) {
        Intent i = new Intent(getApplicationContext(), QuyenLoiCuaKhachHangActivity.class);
        startActivity(i);
    }

    public void btnJuridical_onclick(View view) {
        Intent i = new Intent(getApplicationContext(), PhapLyActivity.class);
        startActivity(i);
    }

    public void btnComplain_onclick(View view) {
        Intent i = new Intent(getApplicationContext(), GopYHoTroActivity.class);
        startActivity(i);
    }

    public void btnHelpCenter_onclick(View view) {
        Intent i = new Intent(getApplicationContext(),TrungTamHoTroActivity.class);
        startActivity(i);
    }

    public void imgbtnGVTG_onclick(View view) {
        Intent i = new Intent(getApplicationContext(), GiupViecTheoGioActivity.class);
        startActivity(i);
    }

    public void imgbtnGVDK_onclick(View view) {
        Intent i = new Intent(getApplicationContext(), GiupViecDinhKyActivity.class);
        startActivity(i);
    }

    public void imgbtnTVS_onclick(View view) {
        Intent i = new Intent(getApplicationContext(), TongVeSinhActivty.class);
        startActivity(i);
    }

    public void imgbtnVSSF_onclick(View view) {
        Intent i = new Intent(getApplicationContext(), VeSinhVatDungActivity.class);
        startActivity(i);
    }
}
