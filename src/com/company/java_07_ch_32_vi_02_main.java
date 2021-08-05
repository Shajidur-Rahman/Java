package com.company;

public class java_07_ch_32_vi_02_main {
    static void name(){
        System.out.println("What is your name???");
    }

    static void name(String name){
        System.out.println("My name is "+name);
    }
    public static void main(String[] args) {
        name();
        name("Shajidur Rahman");
    }
}
