package com.example.jupviecpj.Class;

import java.util.ArrayList;

public class Video {
    String Link;

    String title;

    public Video(String link, String title) {
        Link = link;
        this.title = title;
    }

    public Video() {
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static ArrayList<Video> init(){
        String[] links = {"https://www.youtube.com/watch?v=wNNYJ3sckLA&t=8s","https://www.youtube.com/watch?v=S0dKzNMri7Y","https://www.youtube.com/watch?v=Bk-HnI2NQc8"};
        String[] title = {"VTV1 Chào Buổi Sáng | JupViec.vn cung cấp dịch vụ dọn dẹp nhà Tết đáng tin cậy","Trước & Sau khi sử dụng giúp việc tại JupViec.vn","Hướng dẫn đặt dịch vụ giúp việc gia đình qua ứng dụng JupViec"};
        ArrayList<Video> videos = new ArrayList<>();
        for (int i = 0; i < links.length;i++){
            Video video = new Video(links[i],title[i]);
            videos.add(video);
        }
        return videos;
    }
}
