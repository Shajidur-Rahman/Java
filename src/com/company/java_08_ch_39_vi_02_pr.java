package com.company;

class callPhone{
    public void ringing(){
        System.out.println("Ringing.....");
    }
    public void vibrating(){
        System.out.println("Vibrating.....");
    }
}

public class java_08_ch_39_vi_02_pr {
    public static void main(String[] args) {
    callPhone callPhone = new callPhone();
    callPhone.ringing();
    callPhone.vibrating();
    }
}
