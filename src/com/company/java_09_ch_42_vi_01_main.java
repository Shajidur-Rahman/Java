package com.company;

class myemployee2{
    private String name;
    private int id;

    public myemployee2(int myid,String myname){
     id = myid;
     name = myname;
    }
    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setId(int i) { id = i; }
    public int getId() { return id; }
}

public class java_09_ch_42_vi_01_main {
    public static void main(String[] args) {

        myemployee2 shajidur = new myemployee2(1223, "Shajidur Rahman");;
        System.out.println(shajidur.getName());
        System.out.println(shajidur.getId());
    }
}
