package com.company;

class tommy{
    public void hittint(){
        System.out.println("Hitting ....");
    }
    public void fireing(){
        System.out.println("Fireing....");
    }
    public void running(){
        System.out.println("Running ...");
    }
}

public class java_08_ch_39_vi_05_pr {
    public static void main(String[] args) {
    tommy tommy = new tommy();
    tommy.fireing();
    tommy.hittint();
    tommy.running();
    }
}
