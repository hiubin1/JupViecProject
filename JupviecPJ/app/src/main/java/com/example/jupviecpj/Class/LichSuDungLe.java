package com.example.jupviecpj.Class;

import java.util.ArrayList;

public class LichSuDungLe {
    private int id;
    private String Status, TimeStart,TimeEnd, Date, Address, DetailsAddress,TotalMoney;

    public LichSuDungLe(int id, String status, String timeStart, String timeEnd, String date, String address, String detailsAddress, String totalMoney) {
        this.id = id;
        Status = status;
        TimeStart = timeStart;
        TimeEnd = timeEnd;
        Date = date;
        Address = address;
        DetailsAddress = detailsAddress;
        TotalMoney = totalMoney;
    }

    public LichSuDungLe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDetailsAddress() {
        return DetailsAddress;
    }

    public void setDetailsAddress(String detailsAddress) {
        DetailsAddress = detailsAddress;
    }

    public String getTotalMoney() {
        return TotalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        TotalMoney = totalMoney;
    }

    public String getTimeStart() {
        return TimeStart;
    }

    public void setTimeStart(String timeStart) {
        TimeStart = timeStart;
    }

    public String getTimeEnd() {
        return TimeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        TimeEnd = timeEnd;
    }

    public static ArrayList<LichSuDungLe> init(){
        int [] ids = {1,2,3};

        String[] Statuss = {"Đã hủy","Đặt thành công","Đặt thành công"};

        String[] TimesStart = {"08:00","09:00","10:00"};

        String[] TimesEnd = {"11:00","12:00","13:00"};

        String[] Dates = {"15/06/2023","16/07/2023","17/08/2023"};

        String[] AddressS = {"Phường 14, Quận 10, Thành phố Hồ Chí Minh, Việt Nam","Phường 12, Quận 10, Thành phố Hồ Chí Minh, Việt Nam","Phường 6, Quận 10, Thành phố Hồ Chí Minh, Việt Nam"};

        String[] DetailsAddress = {"135/16 Thành Thái","130/13 Thành Thái","139/13 Thành Thái"};

        String[] Total = {"219.000đ","300.000đ","450.000đ"};

        ArrayList<LichSuDungLe> listLichSuDungLe = new ArrayList<LichSuDungLe>();
        for(int i = 0; i < Statuss.length;i++){
            LichSuDungLe lichSuDungLe = new LichSuDungLe(ids[i],Statuss[i], TimesStart[i],TimesEnd[i], Dates[i], AddressS[i], DetailsAddress[i],Total[i] );
            listLichSuDungLe.add(lichSuDungLe);
        }
        return listLichSuDungLe;
    }

}
