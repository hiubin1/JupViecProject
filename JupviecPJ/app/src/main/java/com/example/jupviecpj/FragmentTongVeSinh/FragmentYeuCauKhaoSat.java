package com.example.jupviecpj.FragmentTongVeSinh;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jupviecpj.Adapter.YCKS_TVSAdapter;
import com.example.jupviecpj.Class.YeuCauKhaoSat_TVS;
import com.example.jupviecpj.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentYeuCauKhaoSat#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentYeuCauKhaoSat extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentYeuCauKhaoSat() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentYeuCauKhaoSat.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentYeuCauKhaoSat newInstance(String param1, String param2) {
        FragmentYeuCauKhaoSat fragment = new FragmentYeuCauKhaoSat();
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

    View v;

    RecyclerView mRCview_YCKS_TVS;
    RecyclerView.LayoutManager layoutManagerYCKS;
    ArrayList<YeuCauKhaoSat_TVS> ListYSKS_TVS;
    YCKS_TVSAdapter ycks_tvsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_yeu_cau_khao_sat, container, false);
        SetRV_YCKS_TVS();
        return v;
    }

    public void SetRV_YCKS_TVS(){
        mRCview_YCKS_TVS = v.findViewById(R.id.RCView_YCKS_TVS);
        layoutManagerYCKS = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        mRCview_YCKS_TVS.setLayoutManager(layoutManagerYCKS);
        ListYSKS_TVS = YeuCauKhaoSat_TVS.init();
        ycks_tvsAdapter = new YCKS_TVSAdapter(getContext(),R.layout.list_yeucaukhaosat_tongvesinh,ListYSKS_TVS);
        mRCview_YCKS_TVS.setAdapter(ycks_tvsAdapter);
    }
}