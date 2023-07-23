package com.example.jupviecpj.Class;

import java.util.ArrayList;

public class YeuCauKhaoSat_TVS {
    private int id;
    private String Status, Address, DetailsAddress,Date;

    public YeuCauKhaoSat_TVS(int id, String status, String address, String detailsAddress, String date) {
        this.id = id;
        Status = status;
        Address = address;
        DetailsAddress = detailsAddress;
        Date = date;
    }

    public YeuCauKhaoSat_TVS() {
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

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public static ArrayList<YeuCauKhaoSat_TVS> init(){
        int[] ids = {1,2,3};
        String[] Statuss = {"Khảo sát", "Khảo sát","Khảo sát"};
        String[] AddresssS = {"Phường 6, Quận 10, Thành Phố Chí Minh, Việt Nam","Phường 8, Quận 10, Thành Phố Chí Minh, Việt Nam","Phường 14, Quận 10, Thành Phố Chí Minh, Việt Nam"};
        String[] AddressDetails = {"133/15","155/18","144/16"};
        String[] Dates = {"22/06/2023","23/06/2023","24/06/2023"};
        ArrayList<YeuCauKhaoSat_TVS> ListYeuCauKhaoSat_tvs = new ArrayList<>();
            for (int i = 0; i < Statuss.length; i++){
                YeuCauKhaoSat_TVS yeuCauKhaoSat_tvs = new YeuCauKhaoSat_TVS(ids[i],Statuss[i], AddresssS[i], AddressDetails[i],Dates[i]);
                ListYeuCauKhaoSat_tvs.add(yeuCauKhaoSat_tvs);
        }
            return ListYeuCauKhaoSat_tvs;
    }
}
