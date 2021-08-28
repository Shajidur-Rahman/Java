package com.company;

class C1{
    public int a = 12;
    protected int b = 13;
    int c = 14;
    private int d = 15;
    public void maht1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class java_12_ch_66_vi_01_main {
    public static void main(String[] args) {
        C1 c = new C1();
        c.maht1();
    }
}
