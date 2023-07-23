package com.example.jupviecpj.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jupviecpj.Class.DichVu;
import com.example.jupviecpj.R;

import java.util.ArrayList;

public class DichVuAdapter extends RecyclerView.Adapter<DichVuAdapter.ViewHolder>{

    Context context;
    int layout;
    ArrayList<DichVu> ListDichVu;

    public DichVuAdapter(Context context, int layout, ArrayList<DichVu> listDichVu) {
        this.context = context;
        this.layout = layout;
        ListDichVu = listDichVu;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DichVu dichVu = ListDichVu.get(position);
        holder.mtvTenDV.setText(String.valueOf(dichVu.getName()));
        holder.mimgbtnDV.setImageResource(dichVu.getPic());
    }

    @Override
    public int getItemCount() {
        return ListDichVu.size();
    }

    public static  class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mtvTenDV;
        public ImageButton mimgbtnDV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mtvTenDV = itemView.findViewById(R.id.tvTenDV);
            mimgbtnDV = itemView.findViewById(R.id.imgbtnDV);
        }
    }
}
