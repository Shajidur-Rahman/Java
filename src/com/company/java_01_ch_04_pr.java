package com.company;
import java.util.Scanner;

public class java_01_ch_04_pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Km: ");
        float km = sc.nextFloat();
        System.out.println(km+" km is "+ (km*0.621371192)+ " miles");
    }
}
