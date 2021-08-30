package com.company;

class Mynewt1 extends Thread{
    public void run(){
        while (true){
            System.out.println("Thank you ");
        }
    }
}
class Mynewt2 extends Thread{
    public void run(){
        while (true){
            System.out.println("Thank you ");
        }
    }
}

public class java_13_ch_75_vi_01_main {
    public static void main(String[] args) {
        Mynewt1 t1 = new Mynewt1();
        Mynewt2 t2 = new Mynewt2();
    }
}
