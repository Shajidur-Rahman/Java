package com.company;

import java.util.*;

public class java_15_ch_90_vi_01_pr {
    public static void main(String[] args) {
        ArrayList<Integer> li1 = new ArrayList<>();
        ArrayList<Integer> li2 = new ArrayList<>(6);
        li2.add(234);
        li2.add(284);

        li1.add(2);
        li1.add(3);
        li1.add(3);
        li1.add(23);

        li1.addAll(0, li2);
//        li1.clear();
        System.out.println(li1);
        System.out.println(li1.isEmpty());
        
        for (int element:li1
             ) {
            System.out.println(element);
        }

    }
}
