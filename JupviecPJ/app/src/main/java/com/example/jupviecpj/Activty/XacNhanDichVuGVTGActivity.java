package com.example.jupviecpj.Activty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jupviecpj.R;

public class XacNhanDichVuGVTGActivity extends AppCompatActivity {

    Toolbar toolbar;

    TextView tvTitleToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xac_nhan_dich_vu_gvtg);
        toolbar = findViewById(R.id.Toolbar_app);
        tvTitleToolbar = findViewById(R.id.toolbar_title);
        AppCompatActivity activity = (AppCompatActivity) this;
        activity.setSupportActionBar(toolbar);
        tvTitleToolbar.setText("Xác nhận dịch vụ");
        activity.getSupportActionBar().setDisplayShowTitleEnabled(false);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private void OpenDialogThanhToan(int gravity){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_custom_dialog_thanhtoan);

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

        CardView btnHinhThucThanhToan = dialog.findViewById(R.id.btnHinhThucThanhToan);
        Button btnHuyTTDialog = dialog.findViewById(R.id.btnHuyDialogTT);
        Button btnThanhToanDialog = dialog.findViewById(R.id.btnThanhToanDialogTT);

       btnHinhThucThanhToan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               OpenDialogHinhThucThanhToan(Gravity.CENTER);
           }
       });

        btnHuyTTDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });

        btnThanhToanDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialogThongBaoDKDV(Gravity.CENTER);
            }
        });
        dialog.show();
    }


    private void OpenDialogHinhThucThanhToan(int gravity){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_custom_dialog_hinhthucthanhtoan);

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

        Button btnHuyHTTTDialog = dialog.findViewById(R.id.btnHuyDialogHTTT);
        Button btnXacNhanDialog = dialog.findViewById(R.id.btnXacNhanDialogHTTT);


        btnHuyHTTTDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });

        btnXacNhanDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        dialog.show();
    }



    private void OpenDialogThongBaoDKDV(int gravity){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_custom_dialog_thongbao_dangky);

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

        Button btnOKThongBaoDialog = dialog.findViewById(R.id.btnHuyDialogHTTT);



        btnOKThongBaoDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),CustomerActivity.class);
                startActivity(i);
            }
        });
        dialog.show();
    }


    public void btnXacNhanDVGVTG_onclick(View view) {
        OpenDialogThanhToan(Gravity.CENTER);
    }


}