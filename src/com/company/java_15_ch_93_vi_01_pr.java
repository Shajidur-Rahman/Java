package com.company;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class java_15_ch_93_vi_01_pr {
    public static void main(String[] args) {
        ArrayDeque<Integer> li = new ArrayDeque<>();
        li.add(3);
        li.add(67);
        System.out.println(li);
        System.out.println(li.contains(4-1));
        System.out.println(li.size());
        li.offerFirst(2);
        System.out.println(li);
    }
}
