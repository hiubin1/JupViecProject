package com.example.jupviecpj.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jupviecpj.Class.Active;
import com.example.jupviecpj.R;

import java.util.ArrayList;

public class ActiveAdapter extends RecyclerView.Adapter<ActiveAdapter.ViewHolder> {
    Context context;
    int layout;
    ArrayList<Active> arrayList;

    public ActiveAdapter(Context context, int layout, ArrayList<Active> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout, parent, false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Active active = arrayList.get(position);
        holder.tvTitles.setText(String.valueOf(active.getTitle()));
        holder.tvNoties.setText(String.valueOf(active.getNoti()));
        holder.tvDateTimes.setText(String.valueOf(active.getDatetime()));
        holder.imgActiveBell.setImageResource(active.getPic());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitles, tvNoties, tvDateTimes;
        public ImageView imgActiveBell;
        public ViewHolder(@NonNull View v) {
            super(v);
            tvTitles = v.findViewById(R.id.Titles);
            tvNoties = v.findViewById(R.id.Noties);
            tvDateTimes = v.findViewById(R.id.DateTimes);
            imgActiveBell = v.findViewById(R.id.ActiveBell);
        }
    }
}
