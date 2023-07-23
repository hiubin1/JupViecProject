package com.example.jupviecpj.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jupviecpj.Activty.ChiTietKhuyenMaiActivity;
import com.example.jupviecpj.Activty.ChiTietNhanVienActivity;
import com.example.jupviecpj.Class.KhuyenMai;
import com.example.jupviecpj.Class.Top3Staff;
import com.example.jupviecpj.R;

import java.util.ArrayList;

public class Top3StaffAdapter extends RecyclerView.Adapter<Top3StaffAdapter.ViewHolder> {

    Context context;
    int layout;
    ArrayList<Top3Staff> top3Staffs;

    public Top3StaffAdapter(Context context, int layout, ArrayList<Top3Staff> top3Staffs) {
        this.context = context;
        this.layout = layout;
        this.top3Staffs = top3Staffs;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Top3Staff top3Staff = top3Staffs.get(position);
        holder.mimgbtnAvatarStaff.setImageResource(top3Staff.getPic());
        holder.tvNameStaff.setText(String.valueOf(top3Staff.getName()));
        holder.tvAgeStaff.setText(String.valueOf(top3Staff.getAge()));

        holder.mlayout_Top3_Staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoToStaffDetails(top3Staff);
            }
        });
        holder.mimgbtnAvatarStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoToStaffDetails(top3Staff);
            }
        });
        holder.tvDetailsStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoToStaffDetails(top3Staff);
            }
        });
        holder.tvAgeStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoToStaffDetails(top3Staff);
            }
        });
    }

    private void onClickGoToStaffDetails(Top3Staff top3Staff){
        Intent i = new Intent(context, ChiTietNhanVienActivity.class);
        context.startActivity(i);
    }

    @Override
    public int getItemCount() {
        return top3Staffs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public LinearLayout mlayout_Top3_Staff;
        public ImageButton mimgbtnAvatarStaff;
        public TextView tvNameStaff, tvAgeStaff,tvDetailsStaff;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mlayout_Top3_Staff = itemView.findViewById(R.id.layout_Top3_Staff);
            mimgbtnAvatarStaff = itemView.findViewById(R.id.imgbtnAvatarStaff);
            tvNameStaff = itemView.findViewById(R.id.tvNameStaff);
            tvAgeStaff = itemView.findViewById(R.id.tvAgeStaff);
            tvDetailsStaff = itemView.findViewById(R.id.tvDetailsStaff);
        }
    }
}
