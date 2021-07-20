package com.company;

public class java_05_ch_23_vi_02_main {
    public static void main(String[] args) {
        for (int a = 1;a<20; a++){
            if (a%2 == 0){
                continue;
            }
            else {
                System.out.println(a);
            }
        }
    }
}
