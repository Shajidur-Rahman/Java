package com.company;

interface Bicycle{
    int a = 223;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

class ayron implements Bicycle{
    public void applyBreak(int decrement){
        System.out.println("Applying break");
    }
    public void speedUp(int increment){
        System.out.println("applying speed up");
    }
}

public class java_11_ch_54_vi_01_main {
    public static void main(String[] args) {
        ayron cycle = new ayron();
        cycle.applyBreak(2);
        System.out.println(cycle.a);
    }
}
