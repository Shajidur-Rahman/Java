package com.company;

import javax.swing.plaf.metal.MetalButtonUI;

class square{
    public float side(float amount){
        float result = amount*4;
        return result;
    }
    public float area(float amount){
        float result = amount*amount;
        return result;
    }
}

public class java_08_ch_39_vi_03_pr {
    public static void main(String[] args) {
        square square = new square();
        System.out.println(square.area(5));
        System.out.println(square.side(5));
    }
}
