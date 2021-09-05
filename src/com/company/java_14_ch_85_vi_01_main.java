package com.company;

public class java_14_ch_85_vi_01_main {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of the programme");
        }
        System.out.println("End");
    }
}
