package com.example.jupviecpj.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jupviecpj.Class.NgayLamGVTG;
import com.example.jupviecpj.R;

import java.util.ArrayList;

public class NgayLamViecGVTGAdapter extends RecyclerView.Adapter<NgayLamViecGVTGAdapter.ViewHolder>{

    Context context;
    int layout;
    ArrayList<NgayLamGVTG> listNgay;

    public NgayLamViecGVTGAdapter(Context context, int layout, ArrayList<NgayLamGVTG> listNgay) {
        this.context = context;
        this.layout = layout;
        this.listNgay = listNgay;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NgayLamGVTG ngayLamGVTG = listNgay.get(position);
        holder.mtvPercentNgayLV.setText(String.valueOf(ngayLamGVTG.getPercent()));
        holder.mtvdayOfWeekNgayLV.setText(String.valueOf(ngayLamGVTG.getDayOfWeek()));
        holder.mtvDayNgayLV.setText(String.valueOf(ngayLamGVTG.getDay()));


    }

    @Override
    public int getItemCount() {
        return listNgay.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mtvPercentNgayLV, mtvdayOfWeekNgayLV, mtvDayNgayLV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mtvPercentNgayLV = itemView.findViewById(R.id.tvPercentNgayLV);
            mtvdayOfWeekNgayLV = itemView.findViewById(R.id.tvdayOfWeekNgayLV);
            mtvDayNgayLV = itemView.findViewById(R.id.tvDayNgayLV);
        }
    }
}
