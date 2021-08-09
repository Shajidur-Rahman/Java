package com.company;

class myemployee{
    private String name;
    private int id;

    public void setName(String n) {
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}

public class java_09_ch_40_vi_01_main {
    public static void main(String[] args) {
    myemployee shajidur = new myemployee();
    shajidur.setName("Shajidur Rahman");
    shajidur.setId(13);
        System.out.println(shajidur.getName());
    }
}
