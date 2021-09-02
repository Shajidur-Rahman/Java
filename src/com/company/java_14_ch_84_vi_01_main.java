package com.company;

class NegativeAreaRedious extends Exception{
    @Override
    public String toString() {
        return "Redious cant be nehative";
    }

    @Override
    public String getMessage() { return "redious cant be neagtive"; }
}

public class java_14_ch_84_vi_01_main {

    public static double area(double r) throws NegativeAreaRedious{
        if (r<0){
            throw new NegativeAreaRedious();
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static int devide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        try{
            int c = devide(2,0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            double ar = area(2);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
