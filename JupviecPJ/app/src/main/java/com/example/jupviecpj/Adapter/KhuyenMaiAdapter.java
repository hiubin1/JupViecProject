package com.example.jupviecpj.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jupviecpj.Activty.ChiTietKhuyenMaiActivity;
import com.example.jupviecpj.Class.KhuyenMai;
import com.example.jupviecpj.R;

import java.util.ArrayList;

public class KhuyenMaiAdapter extends RecyclerView.Adapter<KhuyenMaiAdapter.ViewHolder> {

    Context context;
    int layout;
    ArrayList<KhuyenMai> ListKhuyenMai;

    public KhuyenMaiAdapter(Context context, int layout, ArrayList<KhuyenMai> listKhuyenMai) {
        this.context = context;
        this.layout = layout;
        ListKhuyenMai = listKhuyenMai;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        KhuyenMai khuyenMai = ListKhuyenMai.get(position);
        holder.mimgbtnKhuyenMai.setImageResource(khuyenMai.getPic());

        holder.mimgbtnKhuyenMai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoToSalesDetails(khuyenMai);
            }
        });
    }

    private void onClickGoToSalesDetails(KhuyenMai khuyenMai){
        Intent i = new Intent(context, ChiTietKhuyenMaiActivity.class);
        context.startActivity(i);
    }

    @Override
    public int getItemCount() {
        return ListKhuyenMai.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageButton mimgbtnKhuyenMai;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mimgbtnKhuyenMai = itemView.findViewById(R.id.imgbtnKhuyenMai);
        }
    }
}
