package com.example.jupviecpj.Class;

import java.util.ArrayList;

public class ThongBao {
    private String TitleNotice;
    private String ContentNotice;
    private String TimeUpload;

    public ThongBao(String titleNotice, String contentNotice, String timeUpload) {
        TitleNotice = titleNotice;
        ContentNotice = contentNotice;
        TimeUpload = timeUpload;
    }

    public ThongBao() {
    }

    public String getTitleNotice() {
        return TitleNotice;
    }

    public void setTitleNotice(String titleNotice) {
        TitleNotice = titleNotice;
    }

    public String getContentNotice() {
        return ContentNotice;
    }

    public void setContentNotice(String contentNotice) {
        ContentNotice = contentNotice;
    }

    public String getTimeUpload() {
        return TimeUpload;
    }

    public void setTimeUpload(String timeUpload) {
        TimeUpload = timeUpload;
    }

    public static ArrayList<ThongBao> init(){
        String[] titles = {"JupViec", "JupViec", "JupViec","Dón nhận tin hiệu vụ trụ đầu tuần"};

        String[] Contents = {"Tổ ấm gọn gàng mà bạn vẫn rảnh tay? Chọn ngay gói Định kỳ với quà tặng lên đến 400k cực hot!",
        "Sofa bẩn là nguyên nhân chính gây mẩn ngứa khó chịu. Đặt dịch vụ Vệ sinh Sofa ngay!",
        "Có một căn nhà sạch sẽ. gọn gàng là một hình thức chăm sóc bản thân. Bạn xứng đáng mà, đặt giúp việc nhé!",
        "Hy vọng bạn có thể yêu thương bản thân hơn, việc gì không muốn làm cứ để JupViec làm thay ạ!"};
        
        String[] Times = {"1 phút trước","1 phút trước","1 phút trước","1 phút trước"};
        ArrayList<ThongBao> ListThongBao = new ArrayList<>();
        for (int i = 0; i < titles.length;i++){
            ThongBao thongBao = new ThongBao(titles[i],Contents[i],Times[i]);
            ListThongBao.add(thongBao);
        }
        return ListThongBao;
    }
}
