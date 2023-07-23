package com.example.jupviecpj.Class;

import com.example.jupviecpj.R;

import java.util.ArrayList;

public class Active {
    private String title, noti, datetime;
    private int pic;

    public Active() {
    }

    public Active(String title, String noti, String datetime, int pic) {
        this.title = title;
        this.noti = noti;
        this.datetime = datetime;
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNoti() {
        return noti;
    }

    public void setNoti(String noti) {
        this.noti = noti;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public static ArrayList<Active> init(){
        String[] titles = {"Thông báo", "Thông báo"};
        String[] noties = {"Chúc mừng bạn! Nhân viên Nguyễn Thị Cẩm Phi, sinh năm 1979 đã nhận lịch và sẽ làm tại nhà bạn vào ngày 15/06 ca 08:00 - 11:00."
                , "Đặt dịch vụ thành công! JupViec đang tìm nhân viên phù hợp. Theo dõi tình trạng hợp đồng trên app hoặc LH 19006082. Chân thành cảm ơn."};
        String[] datetimes = {"Thứ tư, 14/06/2023 - 14:10", "Thứ tư, 14/06/2023 - 14:09"};
        int[] pics = {R.drawable.activebell, R.drawable.activebell};

        ArrayList<Active> arrayList = new ArrayList<>();
        for(int i = 0; i < titles.length; i++){
            Active active = new Active(titles[i], noties[i], datetimes[i], pics[i]);
            arrayList.add(active);
        }
        return arrayList;
    }
}
