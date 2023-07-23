package com.example.jupviecpj.Class;

import com.example.jupviecpj.R;

import java.util.ArrayList;

public class Block {
    private String Ten, LuotDanhGia, KinhNghiem, Tuoi;
    private int AvaNV;

    public Block() {
    }

    public Block(String ten, String luotDanhGia, String kinhNghiem, String tuoi, int avaNV) {
        Ten = ten;
        LuotDanhGia = luotDanhGia;
        KinhNghiem = kinhNghiem;
        Tuoi = tuoi;
        AvaNV = avaNV;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getLuotDanhGia() {
        return LuotDanhGia;
    }

    public void setLuotDanhGia(String luotDanhGia) {
        LuotDanhGia = luotDanhGia;
    }

    public String getKinhNghiem() {
        return KinhNghiem;
    }

    public void setKinhNghiem(String kinhNghiem) {
        KinhNghiem = kinhNghiem;
    }

    public int getAvaNV() {
        return AvaNV;
    }

    public void setAvaNV(int avaNV) {
        AvaNV = avaNV;
    }

    public String getTuoi() {
        return Tuoi;
    }

    public void setTuoi(String tuoi) {
        Tuoi = tuoi;
    }

    public static ArrayList<Block> init(){
        String[] tenNV = {"Phạm Thị Hiền", "Nguyễn Mạnh Hiếu"};
        String[] tuoiNV = {"34 tuổi", "20 tuổi"};
        String[] danhgiaNV = {"4.9","1.0"};
        String[] expNV = {"402 giờ","100 giờ"};
        int[] avaNV = {R.drawable.avatar64, R.drawable.avatar64};

        ArrayList<Block> arrayList = new ArrayList<>();
        for(int i = 0; i < tenNV.length; i++){
            Block block = new Block(tenNV[i], danhgiaNV[i], expNV[i], tuoiNV[i], avaNV[i]);
            arrayList.add(block);
        }
        return arrayList;
    }
}
