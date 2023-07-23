package com.example.jupviecpj.FragmentInHistory;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jupviecpj.Adapter.LichSuDungLeAdapter;
import com.example.jupviecpj.Class.LichSuDungLe;
import com.example.jupviecpj.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentDungLe#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentDungLe extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentDungLe() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentDungLe.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentDungLe newInstance(String param1, String param2) {
        FragmentDungLe fragment = new FragmentDungLe();
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

    RecyclerView mRCviewHisDL;
    RecyclerView.LayoutManager layoutManagerHisDL;

    ArrayList<LichSuDungLe> ListLSDL;

    LichSuDungLeAdapter lichSuDungLeAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v =  inflater.inflate(R.layout.fragment_dung_le, container, false);

        mRCviewHisDL = v.findViewById(R.id.RCView_LichSuDungLe);
        SetRV_HisDL();
        return v;
    }

    public void SetRV_HisDL(){
        layoutManagerHisDL = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        mRCviewHisDL.setLayoutManager(layoutManagerHisDL);
        ListLSDL = LichSuDungLe.init();
        lichSuDungLeAdapter = new LichSuDungLeAdapter(getContext(),R.layout.list_lichsu_dungle,ListLSDL);
        mRCviewHisDL.setAdapter(lichSuDungLeAdapter);
    }
}