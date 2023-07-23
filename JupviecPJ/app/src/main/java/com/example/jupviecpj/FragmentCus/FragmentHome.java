package com.example.jupviecpj.FragmentCus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jupviecpj.Adapter.DichVuAdapter;
import com.example.jupviecpj.Adapter.KhuyenMaiAdapter;
import com.example.jupviecpj.Adapter.Top3StaffAdapter;
import com.example.jupviecpj.Adapter.VidYoutubeAdapter;
import com.example.jupviecpj.Class.DichVu;
import com.example.jupviecpj.Class.KhuyenMai;
import com.example.jupviecpj.Class.Top3Staff;
import com.example.jupviecpj.Class.Video;
import com.example.jupviecpj.R;
import com.google.android.material.badge.BadgeDrawable;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentHome#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentHome extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentHome() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentHome.
     */
    // TODO: Rename and change types and number of parameters

    public static FragmentHome newInstance(String param1, String param2) {
        FragmentHome fragment = new FragmentHome();
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

    RecyclerView mRCviewStaffTop3,mRCviewVideo, mRCviewKhuyenMai;
    View rootView;

    LinearLayoutManager linearLayoutManager;

    RecyclerView.LayoutManager layoutManagerStaffTop3,layoutManagerKM;

    ArrayList<Top3Staff> ListStaff;

    ArrayList<KhuyenMai> ListKhuyenMai;


    ArrayList<Video> VideoList;

    Top3StaffAdapter top3StaffAdapter;


    KhuyenMaiAdapter khuyenMaiAdapter;

    ImageView mimgbtnGVTG, mimgbtnGVDK, mimgbtnTVS, mimgbtnVSVD;

    TextView mtvGVTG, mtvGVDK, mtvTVS, mtvVSVD, mtvNameUser, mtvMoney;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView =  inflater.inflate(R.layout.fragment_home, container, false);

        mimgbtnGVTG = rootView.findViewById(R.id.imgbtnGVTG);
        mimgbtnGVDK = rootView.findViewById(R.id.imgbtnGVDK);
        mimgbtnTVS = rootView.findViewById(R.id.imgbtnTVS);
        mimgbtnVSVD = rootView.findViewById(R.id.imgbtnVSVD);


        mtvGVTG = rootView.findViewById(R.id.tvGVTG);
        mtvGVDK = rootView.findViewById(R.id.tvGVDK);
        mtvTVS = rootView.findViewById(R.id.tvTVS);
        mtvVSVD = rootView.findViewById(R.id.tvVSVD);
        mtvNameUser = rootView.findViewById(R.id.tvNameCus);
        mtvMoney = rootView.findViewById(R.id.tvMoney);





        SetRVTop3Staff();

        SetRVVideo();

        SetRVKhuyenMai();

        return rootView;
    }

    public void SetRVTop3Staff(){
        mRCviewStaffTop3 = rootView.findViewById(R.id.RCviewStaffTop3);
        layoutManagerStaffTop3 = new GridLayoutManager(getContext(),3);
        mRCviewStaffTop3.setLayoutManager(layoutManagerStaffTop3);
        ListStaff = Top3Staff.init();
        top3StaffAdapter = new Top3StaffAdapter(getContext(),R.layout.list_top3_nhanvien,ListStaff);
        mRCviewStaffTop3.setAdapter(top3StaffAdapter);
    }

    public void SetRVVideo(){
        mRCviewVideo = rootView.findViewById(R.id.RCviewVideo);
        mRCviewVideo.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        mRCviewVideo.setLayoutManager(linearLayoutManager);
        VideoList = Video.init();
        VidYoutubeAdapter vidYoutubeAdapter = new VidYoutubeAdapter(VideoList,getContext());
        mRCviewVideo.setAdapter(vidYoutubeAdapter);
    }

    public void SetRVKhuyenMai(){
        mRCviewKhuyenMai = rootView.findViewById(R.id.RCViewKhuyenMai);
        layoutManagerKM = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        mRCviewKhuyenMai.setLayoutManager(layoutManagerKM);
        ListKhuyenMai = KhuyenMai.init();
        khuyenMaiAdapter = new KhuyenMaiAdapter(getContext(),R.layout.list_khuyenmai,ListKhuyenMai);
        mRCviewKhuyenMai.setAdapter(khuyenMaiAdapter);
    }
}