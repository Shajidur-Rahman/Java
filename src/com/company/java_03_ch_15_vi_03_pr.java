package com.company;
import java.util.Scanner;

public class java_03_ch_15_vi_03_pr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter);
        String name = input.nextLine();
        System.out.println(letter.replace("<|name|>", name));
    }
}
