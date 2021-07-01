package com.company;
import java.util.Scanner;

public class java_06_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MArks input==>");
        System.out.print("First subject: ");
        float a = sc.nextFloat();
        System.out.print("Second subject: ");
        float b = sc.nextFloat();
        System.out.print("Third subject: ");
        float c = sc.nextFloat();
        System.out.print("Forth subject: ");
        float d = sc.nextFloat();
        System.out.print("Fifth subject: ");
        float e = sc.nextFloat();

        float result = ((a+b+c+d+e)*100)/500;
        System.out.println("The student got : "+result+" of marks");
//        System.out.println(result);
    }
}
