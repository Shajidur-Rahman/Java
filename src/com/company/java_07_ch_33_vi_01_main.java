package com.company;

public class java_07_ch_33_vi_01_main {
    static void sum(int ...arr){
        int suma = 0;
        for (int element: arr){
            suma = element + suma;
        }
        System.out.println(suma);
    }
    public static void main(String[] args) {
        System.out.println("Hi i am shajidur");
        sum(2,3,34,4,44,55,4,56,5,7,67,6,8,7);
    }
}
