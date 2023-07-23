package com.example.jupviecpj.FragmentCus;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.widget.Toolbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.jupviecpj.Adapter.ViewPagerAdapterHistory;
import com.example.jupviecpj.R;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentHistory#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentHistory extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentHistory() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentHistory.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentHistory newInstance(String param1, String param2) {
        FragmentHistory fragment = new FragmentHistory();
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
    private TabLayout mTablayoutHistory;
    private ViewPager mViewPagerHistory;
    View v;

    Toolbar toolbar;
    TextView tvTitleToolbar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        v =  inflater.inflate(R.layout.fragment_history, container, false);
        mTablayoutHistory = v.findViewById(R.id.Tab_Layout_History);
        mViewPagerHistory = v.findViewById(R.id.View_Pager_History);
        mTablayoutHistory.addTab(mTablayoutHistory.newTab().setText("DÙNG LẺ"));
        mTablayoutHistory.addTab(mTablayoutHistory.newTab().setText("ĐỊNH KỲ/SĐTV"));
        mTablayoutHistory.addTab(mTablayoutHistory.newTab().setText("TỔNG VỆ SINH"));
        mTablayoutHistory.setTabGravity(mTablayoutHistory.GRAVITY_FILL);


        toolbar = v.findViewById(R.id.Toolbar_app);
        tvTitleToolbar = v.findViewById(R.id.toolbar_title);

        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);
        tvTitleToolbar.setText("Lịch sử");
        activity.getSupportActionBar().setDisplayShowTitleEnabled(false);

        final ViewPagerAdapterHistory adapterHistory = new ViewPagerAdapterHistory(v.getContext(),getFragmentManager(),mTablayoutHistory.getTabCount());
        mViewPagerHistory.setAdapter(adapterHistory);
        mViewPagerHistory.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTablayoutHistory));
        mTablayoutHistory.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPagerHistory.setCurrentItem(tab.getPosition());
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
        View root = mTablayoutHistory.getChildAt(0);
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