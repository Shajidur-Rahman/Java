package com.company;

class Base2{
    Base2(){
        System.out.println("It is base class");
    }Base2(int a){
        System.out.println("It is base class but overloaded");
    }
}

class derive2 extends Base2{
    derive2(){
        super(232);
        System.out.println("It is derive");
    }
}

public class java_10_ch_46_vi_01_main {
    public static void main(String[] args) {
        derive2 d = new derive2();
    }
}
