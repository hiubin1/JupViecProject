package com.example.jupviecpj.FragmentCus;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jupviecpj.Adapter.ThongBaoAdapter;
import com.example.jupviecpj.Class.ThongBao;
import com.example.jupviecpj.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentNotice#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentNotice extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentNotice() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentNotice.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentNotice newInstance(String param1, String param2) {
        FragmentNotice fragment = new FragmentNotice();
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
    Toolbar toolbar;
    TextView tvTitleToolbar;

    RecyclerView mRCviewNotice;
    RecyclerView.LayoutManager layoutManagerNotice;

    ArrayList<ThongBao> ListThongBao;

    ThongBaoAdapter thongBaoAdapter;

    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_notice, container, false);
        toolbar = v.findViewById(R.id.Toolbar_app);
        tvTitleToolbar = v.findViewById(R.id.toolbar_title);


        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);
        tvTitleToolbar.setText("Thông báo");
        activity.getSupportActionBar().setDisplayShowTitleEnabled(false);
        SetRVNotice();
        return v;

    }

    public void SetRVNotice(){
        mRCviewNotice = v.findViewById(R.id.RCviewNotice);
        layoutManagerNotice = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false);
        mRCviewNotice.setLayoutManager(layoutManagerNotice);
        ListThongBao = ThongBao.init();
        thongBaoAdapter = new ThongBaoAdapter(getContext(),R.layout.list_notice,ListThongBao);
        mRCviewNotice.setAdapter(thongBaoAdapter);
    }
}