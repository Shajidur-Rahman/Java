package com.company;
import java.util.Scanner;

public class java_01_ch_05_pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The number: ");
        boolean number = sc.hasNextInt();
        System.out.println(number);
    }
}
