package com.example.jupviecpj.Class;

import com.example.jupviecpj.R;

import java.util.ArrayList;

public class Top3Staff {
    private String name;
    private int age;

    private int pic;

    public Top3Staff(String name, int age, int pic) {
        this.name = name;
        this.age = age;
        this.pic = pic;
    }

    public Top3Staff() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public static ArrayList<Top3Staff> init(){
        String[] names = {"Hiếu", "Híu", "Bin"};
        int[] ages = {20,19,18};
        int[] pics = {
                R.drawable.avatar64,
                R.drawable.avatar64,
                R.drawable.avatar64
        };
        ArrayList<Top3Staff> top3Staffs = new ArrayList<>();
        for (int i = 0; i < names.length;i++){
            Top3Staff top3Staff = new Top3Staff(names[i], ages[i], pics[i]);
            top3Staffs.add(top3Staff);
        }
        return top3Staffs;
    }
}
