package com.company;
import java.util.Scanner;

public class java_07_ch_34_vi_01_main {
    static void factorial(int a){
        int result = 1;
        if (a==0 || a==1){
            System.out.println("The factorial of "+ a + " is " + 1);
        }
        else {
        for (int x = 1; x <= a; x++){
            result = x * result;
        }
        System.out.println("The factorial of "+ a + " is " + result);
    }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me the number : ");
        int num = input.nextInt();
        factorial(num);
    }
}
