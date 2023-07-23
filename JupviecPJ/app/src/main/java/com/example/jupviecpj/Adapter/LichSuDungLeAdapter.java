package com.example.jupviecpj.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jupviecpj.Class.LichSuDungLe;
import com.example.jupviecpj.R;

import java.util.ArrayList;

public class LichSuDungLeAdapter extends RecyclerView.Adapter<LichSuDungLeAdapter.ViewHolder> {
    Context context;
    int layout;
    ArrayList<LichSuDungLe> ListLSDL;

    public LichSuDungLeAdapter(Context context, int layout, ArrayList<LichSuDungLe> listLSDL) {
        this.context = context;
        this.layout = layout;
        ListLSDL = listLSDL;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LichSuDungLe lichSuDungLe = ListLSDL.get(position);
        holder.mtvIdHisDL.setText(String.valueOf(lichSuDungLe.getId()));
        holder.mtvStatusHisDL.setText(lichSuDungLe.getStatus());
        holder.mtvTimeStartHisDL.setText(lichSuDungLe.getTimeStart());
        holder.mtvTimeEndHisDL.setText(lichSuDungLe.getTimeEnd());
        holder.mtvDateHisDL.setText(lichSuDungLe.getDate());
        holder.mtvAddressHisDL.setText(lichSuDungLe.getAddress());
        holder.mtvDetailsAddressHisDL.setText(lichSuDungLe.getDetailsAddress());
        holder.mtvTotalHisDL.setText(lichSuDungLe.getTotalMoney());

        switch (lichSuDungLe.getStatus()){
            case "Đã hủy":
                holder.mtvStatusHisDL.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.custom_statuscancel));
                holder.mtvStatusHisDL.setTextColor(ContextCompat.getColor(context,R.color.white));
                break;
            case "Đặt thành công":
                holder.mtvStatusHisDL.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.custom_statussucces));
                holder.mtvStatusHisDL.setTextColor(ContextCompat.getColor(context,R.color.white));
                break;
            default:
                holder.mtvStatusHisDL.setBackgroundDrawable(ContextCompat.getDrawable(context,R.drawable.custom_statuscancel));
                holder.mtvStatusHisDL.setTextColor(ContextCompat.getColor(context,R.color.white));
        }

    }

    @Override
    public int getItemCount() {
        return ListLSDL.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView mtvIdHisDL, mtvStatusHisDL, mtvTimeStartHisDL, mtvTimeEndHisDL,
            mtvDateHisDL,mtvAddressHisDL, mtvDetailsAddressHisDL, mtvTotalHisDL;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mtvIdHisDL = itemView.findViewById(R.id.tvIdHisDL);
            mtvStatusHisDL = itemView.findViewById(R.id.tvStatusHisDL);
            mtvTimeStartHisDL = itemView.findViewById(R.id.tvTimeStartHisDL);
            mtvTimeEndHisDL = itemView.findViewById(R.id.tvTimeEndHisDL);
            mtvDateHisDL = itemView.findViewById(R.id.tvDateHisDL);
            mtvAddressHisDL = itemView.findViewById(R.id.tvAddressHisDL);
            mtvDetailsAddressHisDL = itemView.findViewById(R.id.tvDetailsAddressHisDL);
            mtvTotalHisDL = itemView.findViewById(R.id.tvTotalHisDL);

        }
    }

}
