package com.company;

class myClass{
    int a;
    public int getA(){
        return a;
    }
    myClass(){
        System.out.println("It is not super");
    }
    myClass(int x){
        a = x;
        System.out.println("It is super");
    }

    public int returnOne(){
        return 1;
    }
}

class MyClass extends myClass{
    MyClass(){
        super(2);
        System.out.println("It is my class");
    }
}
public class java_10_ch_47_vi_01_main {
    public static void main(String[] args) {
//        myClass me = new myClass();
//        System.out.println(me.getA());
        MyClass it = new MyClass();

    }
}
