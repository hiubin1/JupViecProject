package com.example.jupviecpj.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jupviecpj.Class.Block;
import com.example.jupviecpj.R;

import java.util.ArrayList;

public class BlockAdapter extends RecyclerView.Adapter<BlockAdapter.ViewHolder> {
    Context context;
    int layout;
    ArrayList<Block> arrayList;

    public BlockAdapter(Context context, int layout, ArrayList<Block> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public BlockAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BlockAdapter.ViewHolder holder, int position){
        Block block = arrayList.get(position);
        holder.tvTenNVBlock.setText(String.valueOf(block.getTen()));
        holder.tvTuoiNVBlock.setText(String.valueOf(block.getTuoi()));
        holder.tvDanhGiaNVBlock.setText(String.valueOf(block.getLuotDanhGia()));
        holder.tvKinhNghiemNVBlock.setText(String.valueOf(block.getKinhNghiem()));
        holder.tvAvaNVBlock.setImageResource(block.getAvaNV());

        holder.mbtnNVBlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialogBlock(Gravity.CENTER);
            }
        });
    }

    private void OpenDialogBlock(int gravity){
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_custom_dialog_xacnhanchan);

        Window window = dialog.getWindow();
        if(window == null){
            return;
        }
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        WindowManager.LayoutParams windowAtrributes = window.getAttributes();
        windowAtrributes.gravity = gravity;
        window.setAttributes(windowAtrributes);

        if(Gravity.CENTER == gravity){
            dialog.setCancelable(true);
        } else {
            dialog.setCancelable(false);
        }

        EditText edtReasoNBlock = dialog.findViewById(R.id.edtReasonBlock);
        Button btnHuyDialog = dialog.findViewById(R.id.btnHuyDialogBlock);
        Button btnChanDialog = dialog.findViewById(R.id.btnChanDialogBlock);

        btnHuyDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });

        btnChanDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"OK BRO",Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTenNVBlock, tvTuoiNVBlock, tvDanhGiaNVBlock, tvKinhNghiemNVBlock;
        public ImageView tvAvaNVBlock;

        public Button mbtnNVBlock;
        public ViewHolder(@NonNull View v) {
            super(v);
            tvTenNVBlock = v.findViewById(R.id.TenNVBlock);
            tvTuoiNVBlock = v.findViewById(R.id.TuoiNVBlock);
            tvDanhGiaNVBlock = v.findViewById(R.id.DanhGiaNVBlock);
            tvKinhNghiemNVBlock = v.findViewById(R.id.KinhNghiemNVBlock);
            tvAvaNVBlock = v.findViewById(R.id.AvaNVBlock);
            mbtnNVBlock = v.findViewById(R.id.btnNVBlock);
        }
    }
}
