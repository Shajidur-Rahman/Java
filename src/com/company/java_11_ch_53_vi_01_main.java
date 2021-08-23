package com.company;
import java.util.Scanner;

abstract class base2{
    base2(){
        System.out.println("I am the constructor of base 2");
    }
    public void sayHello(){
        System.out.println("Hello !!");
    }
    abstract public void greet();
}

class child extends base2{
    public void greet(){
        System.out.println("Good morning");
    }
}

public class java_11_ch_53_vi_01_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    }
}
