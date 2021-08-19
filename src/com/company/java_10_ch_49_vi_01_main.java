package com.company;

class Phone{
    public void greeting(){
        System.out.println("Good Morning ");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}

class SmartPhone extends Phone{
    public void greet(){
        System.out.println("Good night");
    }
    public void on(){
        System.out.println("Turning on Smart Phone ");
    }
}

public class java_10_ch_49_vi_01_main {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.on();
    }
}
