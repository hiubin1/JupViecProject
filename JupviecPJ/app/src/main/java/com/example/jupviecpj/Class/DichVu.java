package com.example.jupviecpj.Class;

import com.example.jupviecpj.R;

import java.util.ArrayList;

public class DichVu {
    private String name;
    private int pic;

    public DichVu(String name, int pic) {
        this.name = name;
        this.pic = pic;
    }

    public DichVu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public static ArrayList<DichVu> init(){
        String[] names = {"Giúp việc theo giờ", "Giúp việc định kỳ", "Tổng vệ sinh", "Vệ sinh sofa, nệm, rèm, thàm",
                "Vệ sinh điều hòa, điện máy", " Phun khử khuẩn", "Giúp việc cả ngày / Tạp vụ "};

        int [] pics = {
                R.drawable.icongiupviectheogio,
                R.drawable.icongiupviecdinhky,
                R.drawable.icontongvesinh,
                R.drawable.iconvesinhsofa,
                R.drawable.iconvesinhdieuhoa,
                R.drawable.iconphunkhukhuan,
                R.drawable.icongiupvieccangay};

        ArrayList<DichVu> listDichVu = new ArrayList<>();
        for (int i = 0; i < names.length; i++){
            DichVu dichVu = new DichVu(names[i], pics[i]);
                listDichVu.add(dichVu);
        }
        return listDichVu;
    }
}
