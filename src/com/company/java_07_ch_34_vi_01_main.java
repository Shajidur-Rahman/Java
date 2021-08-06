package com.company;

public class java_07_ch_34_vi_01_main {
    static void factorial(int a){
        int result = 1;
        for (int x = 1; x <= a; x++){
            result = x * result;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        factorial(3);
    }
}
