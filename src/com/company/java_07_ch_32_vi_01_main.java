package com.company;
import java.util.Scanner;

public class java_07_ch_32_vi_01_main {
    static int sum(int x, int y){
        int suma = x + y;
        return suma;
    }
    static void greeting(){
        System.out.println("Good morning ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        System.out.println(sum(a,b));
        greeting();

    }
}
