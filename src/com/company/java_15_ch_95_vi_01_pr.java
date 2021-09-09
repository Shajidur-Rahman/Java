package com.company;

import java.util.HashSet;

public class java_15_ch_95_vi_01_pr {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(5);
        myHashSet.add(2);
        myHashSet.add(12);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);
        System.out.println(myHashSet.size());

    }
}
