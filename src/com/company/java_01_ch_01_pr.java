package com.company;
import java.util.Scanner;

public class java_01_ch_01_pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        float a = sc.nextFloat();
        System.out.print("Second number: ");
        float b = sc.nextFloat();
        System.out.print("Third number: ");
        float c = sc.nextFloat();
        System.out.println("The sum: "+ (a+b+c));
    }
}
