package com.company;
import java.util.Scanner;

public class java_04_ch_18_vi_01_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your age please: ");
        int age = input.nextInt();
//        switch (age){
//            case 13:
//                System.out.println("You are going to become teen");
//                break;
//            case 18:
//                System.out.println("You are going to become Adult");
//                break;
//            case 24:
//                System.out.println("You need to get a job");
//                break;
//            case 40:
//                System.out.println("Heah");
//                break;
//            case 100:
//                System.out.println("You need to die");
//                break;
//        }
        switch (age){
            case 12 -> System.out.println("You are shajidur ");
            case 21 -> System.out.println("You are sifat ");
            case 30 -> System.out.println("You are jannat");
            default -> System.out.println("You are none");
        }
    }
}
