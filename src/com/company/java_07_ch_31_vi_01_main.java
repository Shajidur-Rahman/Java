package com.company;

public class java_07_ch_31_vi_01_main {
     int logic(int x,int y){
        int z;
        if (x>y){
            z = x - y;
        }
        else {
            z = x + y;
        }
        return z;
    }
    public static void main(String[] args) {
         java_07_ch_31_vi_01_main object = new java_07_ch_31_vi_01_main();
        int c = object.logic(2,3);
        System.out.println(c);
    }
}
