package com.example.jupviecpj.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.jupviecpj.FragmentInHistory.FragmentDinhKy;
import com.example.jupviecpj.FragmentInHistory.FragmentDungLe;
import com.example.jupviecpj.FragmentInHistory.FragmentTongVeSinh;

public class ViewPagerAdapterHistory extends FragmentStatePagerAdapter {
    Context context;
    int totalTabs;

    public ViewPagerAdapterHistory(Context c, FragmentManager fragmentManager, int totalTabs) {
        super(fragmentManager);
        context = c;
        this.totalTabs = totalTabs;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentDungLe();

            case 1:
                return new FragmentDinhKy();

            case 2:
                return new FragmentTongVeSinh();

            default:
                 return new FragmentDungLe();
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

}
