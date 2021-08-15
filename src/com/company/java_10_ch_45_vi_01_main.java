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

class Animal{
    public void sound(String sound) {
        System.out.println(sound);
    }
    public void color(String color){
        System.out.println(color);
    }
    public void leg(int leg){
        System.out.println(leg);
    }
}

class Dog extends Animal{
    public void bark(boolean bark){
        System.out.println(bark);
    }
}

public class java_10_ch_45_vi_01_main {
    public static void main(String[] args) {
//        base b = new base();
//        b.setX(3);
//        System.out.println(b.getX());
//        derive d = new derive();
//        d.setX(5);
//        System.out.println(d.getX());
        Dog my_dog = new Dog();
        my_dog.sound("Ghao");
        my_dog.color("Black");
        my_dog.leg(4);
        my_dog.bark(true);
    }
}
