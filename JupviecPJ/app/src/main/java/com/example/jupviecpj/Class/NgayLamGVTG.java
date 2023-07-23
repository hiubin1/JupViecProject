package com.example.jupviecpj.Class;

import java.util.ArrayList;

public class NgayLamGVTG {
    int percent;
    String DayOfWeek,Day;

    public NgayLamGVTG(int percent, String dayOfWeek, String day) {
        this.percent = percent;
        DayOfWeek = dayOfWeek;
        Day = day;
    }

    public NgayLamGVTG() {
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getDayOfWeek() {
        return DayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        DayOfWeek = dayOfWeek;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public static ArrayList<NgayLamGVTG> init (){
        int[] percent = {13,9,13,13,13,0,0};

        String[] DaysOfWeek = {"T5","T6","T7","CN","T2","T3","T4"};
        String[] Days = {"H.nay","N.mai","22/07","23/07","24/07","25/07","26/07"};

        ArrayList<NgayLamGVTG> listNgay = new ArrayList<>();
        for(int i = 0; i < Days.length;i++){
            NgayLamGVTG ngayLamGVTG = new NgayLamGVTG(percent[i], DaysOfWeek[i],Days[i]);
            listNgay.add(ngayLamGVTG);
        }
        return listNgay;
    }
}
