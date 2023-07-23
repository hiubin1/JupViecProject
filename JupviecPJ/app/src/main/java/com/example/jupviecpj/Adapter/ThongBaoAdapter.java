package com.example.jupviecpj.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jupviecpj.Class.ThongBao;
import com.example.jupviecpj.R;

import java.util.ArrayList;

public class ThongBaoAdapter extends RecyclerView.Adapter<ThongBaoAdapter.ViewHolder> {

    Context context;
    int layout;
    ArrayList<ThongBao> ListThongBao;

    public ThongBaoAdapter(Context context, int layout, ArrayList<ThongBao> listThongBao) {
        this.context = context;
        this.layout = layout;
        ListThongBao = listThongBao;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ThongBao thongBao = ListThongBao.get(position);
        holder.mtvTitleNotice.setText(thongBao.getTitleNotice());
        holder.mtvContentNotice.setText(thongBao.getContentNotice());
        holder.mTimeUploadNotice.setText(thongBao.getTimeUpload());

    }

    @Override
    public int getItemCount() {
        return ListThongBao.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mtvTitleNotice, mtvContentNotice,mTimeUploadNotice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mtvTitleNotice = itemView.findViewById(R.id.tvTitleNotice);
            mtvContentNotice = itemView.findViewById(R.id.tvContentNotice);
            mTimeUploadNotice = itemView.findViewById(R.id.tvTimeUploadNotice);
        }
    }
}
