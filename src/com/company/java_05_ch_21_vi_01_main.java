package com.company;
import java.util.Scanner;

public class java_05_ch_21_vi_01_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int tem = 1;
        while (tem<num){
            System.out.println(tem);
            tem++;
        }
    }
}
