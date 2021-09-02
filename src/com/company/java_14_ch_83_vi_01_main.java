package com.company;

import java.util.Scanner;

class Myexception extends Exception{
    @Override
    public String toString() {
        return "I am java";
    }

    @Override
    public String getMessage() {
        return "I am get msg";
    }
}

public class java_14_ch_83_vi_01_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 9){
            try {
                throw new Myexception();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
    }
}
