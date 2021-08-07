package com.company;

public class java_07_ch_35_vi_01_pr {
    static void multiplication_table(int m){
        for (int a = 1; a <= 10; a ++){
            System.out.printf("%d * %d = %d\n", m, a, m*a);
        }
    }
    static void star(){
        for (int a = 1; a <=4; a++){
            System.out.println("*");
            for (int b = a; b <=4; b ++){
                System.out.print("*");
            }
        }
    }
    public static void main(String[] args) {
        // problem 1
//        multiplication_table(2);
        //problem 2
star();
    }
}
