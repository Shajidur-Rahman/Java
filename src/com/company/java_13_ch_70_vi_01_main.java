package com.company;

class MyThread extends Thread{
//    @Override
    public void run(){
        int i = 0;
        while (i < 2000){
            System.out.println("Thread works...");
            System.out.println(i);
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int a = 0;
        while (a < 2000){
            System.out.println("_______________________");
            System.out.println("Thread2 works...");
            System.out.println(a);
            a++;
        }
    }
}

public class java_13_ch_70_vi_01_main {
    public static void main(String[] args) {
        System.out.println("Code worked");
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
