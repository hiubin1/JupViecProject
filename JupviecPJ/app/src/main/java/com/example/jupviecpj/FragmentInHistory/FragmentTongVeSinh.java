package com.example.jupviecpj.FragmentInHistory;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.jupviecpj.Adapter.ViewPagerAdapterHistory;
import com.example.jupviecpj.Adapter.ViewPagerAdapterTongVeSinh;
import com.example.jupviecpj.R;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentTongVeSinh#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTongVeSinh extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentTongVeSinh() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentTongVeSinh.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentTongVeSinh newInstance(String param1, String param2) {
        FragmentTongVeSinh fragment = new FragmentTongVeSinh();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private TabLayout mTablayoutTongVS;
    private ViewPager mViewPagerTongVs;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =  inflater.inflate(R.layout.fragment_tong_ve_sinh, container, false);
        mTablayoutTongVS = v.findViewById(R.id.Tab_Layout_TongVS);
        mViewPagerTongVs = v.findViewById(R.id.View_Pager_TongVS);
        mTablayoutTongVS.addTab(mTablayoutTongVS.newTab().setText("Tổng vệ sinh"));
        mTablayoutTongVS.addTab(mTablayoutTongVS.newTab().setText("Yêu cầu khảo sát"));
        mTablayoutTongVS.setTabGravity(mTablayoutTongVS.GRAVITY_FILL);
        setTabDividers();
        final ViewPagerAdapterTongVeSinh adapterTongVeSinh = new ViewPagerAdapterTongVeSinh(v.getContext(),getFragmentManager(),mTablayoutTongVS.getTabCount());
        mViewPagerTongVs.setAdapter(adapterTongVeSinh);
        mViewPagerTongVs.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTablayoutTongVS));
        mTablayoutTongVS.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPagerTongVs.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        return v;
    }
    private void setTabDividers(){
        View root = mTablayoutTongVS.getChildAt(0);
        if(root instanceof LinearLayout){
            ((LinearLayout) root).setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
            GradientDrawable drawable = new GradientDrawable();
            drawable.setColor(Color.rgb(26,72,142));
            drawable.setSize(3,1);
            ((LinearLayout) root).setDividerPadding(10);
            ((LinearLayout) root).setDividerDrawable(drawable);
        }
    }
}