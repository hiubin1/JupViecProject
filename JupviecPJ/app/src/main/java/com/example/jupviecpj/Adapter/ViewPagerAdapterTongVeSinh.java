package com.example.jupviecpj.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.jupviecpj.FragmentTongVeSinh.FragmentTongVS;
import com.example.jupviecpj.FragmentTongVeSinh.FragmentYeuCauKhaoSat;

public class ViewPagerAdapterTongVeSinh  extends FragmentStatePagerAdapter {

    Context context;
    int totalTabs;
    public ViewPagerAdapterTongVeSinh(Context c,FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentTongVS();
            case 1:
                return new FragmentYeuCauKhaoSat();
            default:
                return new FragmentTongVS();
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
