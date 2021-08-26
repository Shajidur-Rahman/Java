package com.company;

interface simpleClass{
    void math1();
    void math2();
}

interface chileClass extends simpleClass{
    void math3();
    void math4();
}

class mySimpleClass implements chileClass{
    public void math1(){
        System.out.println("Math1");
    }
    public void math2(){
        System.out.println("Math2");
    }
    public void math3(){
        System.out.println("Math3");
    }
    public void math4(){
        System.out.println("MAth4");
    }
}

public class java_11_ch_58_vi_01_main {
    public static void main(String[] args) {

    }
}
