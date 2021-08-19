package com.company;

class A{
    public int a;
    public int shajdur(){
        return 2;
    }
    public void math2(){
        System.out.println("It is a method of class a");
    }
}

class B extends A{
    @Override
    public void math2(){
        System.out.println("It is the 2 method of class B ");
    }
    public void math3(){
        System.out.println("It is the mathod 2 of class B");
    }
}

public class java_10_ch_48_vi_01_main {
    public static void main(String[] args) {
        A a = new A();
        a.math2();

        B b = new B();
        b.math2();
    }
}
