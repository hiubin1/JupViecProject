package com.example.jupviecpj.Class;

import com.example.jupviecpj.R;

import java.util.ArrayList;

public class KhuyenMai {

    private int pic;

    public KhuyenMai(int pic) {
        this.pic = pic;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public static ArrayList<KhuyenMai> init(){
        int [] pics = {
                R.drawable.slider1,
                R.drawable.slider2,
                R.drawable.slider3,
                R.drawable.slider4,
                R.drawable.slider5,
                R.drawable.slider6};
        ArrayList<KhuyenMai> ListKhuyenMai = new ArrayList<>();
        for (int i = 0; i < pics.length;i++){
            KhuyenMai khuyenMai = new KhuyenMai(pics[i]);
            ListKhuyenMai.add(khuyenMai);
        }
        return ListKhuyenMai;
    }
}
