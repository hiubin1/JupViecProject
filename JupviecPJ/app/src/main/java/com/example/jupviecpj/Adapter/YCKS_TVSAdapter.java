package com.example.jupviecpj.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jupviecpj.Activty.ChiTietCaLamActivity;
import com.example.jupviecpj.Activty.ChiTietKhuyenMaiActivity;
import com.example.jupviecpj.Class.KhuyenMai;
import com.example.jupviecpj.Class.YeuCauKhaoSat_TVS;
import com.example.jupviecpj.R;

import java.util.ArrayList;

public class YCKS_TVSAdapter extends RecyclerView.Adapter<YCKS_TVSAdapter.ViewHolder> {
    Context context;
    int layout;
    ArrayList<YeuCauKhaoSat_TVS> ListYeuCauKhaoSat_tvs;

    public YCKS_TVSAdapter(Context context, int layout, ArrayList<YeuCauKhaoSat_TVS> listYeuCauKhaoSat_tvs) {
        this.context = context;
        this.layout = layout;
        ListYeuCauKhaoSat_tvs = listYeuCauKhaoSat_tvs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        YeuCauKhaoSat_TVS yeuCauKhaoSat_tvs = ListYeuCauKhaoSat_tvs.get(position);
        holder.mtvIdYCKS_TVS.setText(String.valueOf(yeuCauKhaoSat_tvs.getId()));
        holder.mtvStatusYCKS_TVS.setText(yeuCauKhaoSat_tvs.getStatus());
        holder.mtvAddressYCKS_TVS.setText(yeuCauKhaoSat_tvs.getAddress());
        holder.mtvAddressDetailYCKS_TVS.setText(yeuCauKhaoSat_tvs.getDetailsAddress());
        holder.mtvDateYCKS_TVS.setText(yeuCauKhaoSat_tvs.getDate());

        holder.mLayout_YCKS_TVS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoToDetailsTimeWork(yeuCauKhaoSat_tvs);
            }
        });


    }

    private void onClickGoToDetailsTimeWork(YeuCauKhaoSat_TVS yeuCauKhaoSat_tvs){
        Intent i = new Intent(context, ChiTietCaLamActivity.class);
        context.startActivity(i);
    }



    @Override
    public int getItemCount() {
        return ListYeuCauKhaoSat_tvs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView mtvIdYCKS_TVS, mtvStatusYCKS_TVS, mtvAddressYCKS_TVS, mtvAddressDetailYCKS_TVS, mtvDateYCKS_TVS;

        LinearLayout mLayout_YCKS_TVS;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mLayout_YCKS_TVS = itemView.findViewById(R.id.Layout_YCKS_TVS);
            mtvIdYCKS_TVS = itemView.findViewById(R.id.tvIdYCKS_TVS);
            mtvStatusYCKS_TVS = itemView.findViewById(R.id.tvStatusYCKS_TVS);
            mtvAddressYCKS_TVS = itemView.findViewById(R.id.tvAddressYCKS_TVS);
            mtvAddressDetailYCKS_TVS = itemView.findViewById(R.id.tvAddressDetailYCKS_TVS);
            mtvDateYCKS_TVS = itemView.findViewById(R.id.tvDateYCKS_TVS);
        }
    }
}
