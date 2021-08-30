package com.company;

class Myth1 extends Thread{
    public Myth1(String name){
        super(name);
    }
    public void run(){
        while (true){
            System.out.println("Thank you " + this.getName());
        }
    }
}

public class java_13_ch_74_vi_01_main {
    public static void main(String[] args) {
        Myth1 t1 = new Myth1("Shajidur1");
        Myth1 t2 = new Myth1("Shajidur2");
        Myth1 t3 = new Myth1("Shajidur3");
        Myth1 t4 = new Myth1("Shajidur4");
        Myth1 t5 = new Myth1("Shajidur5 and it is most important");
        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
