package com.company;

public class java_14_ch_80_VI_01_main {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a/b;
            System.out.println("The result is :" + c);
        }
        catch (Exception e){
            System.out.println("Failed to do that. The reason is \n:" + e);
        }
    }
}
