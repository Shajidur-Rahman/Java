package com.company;

class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("Hi");
    }
}

class derive extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class java_10_ch_45_vi_01_main {
    public static void main(String[] args) {

    }
}
