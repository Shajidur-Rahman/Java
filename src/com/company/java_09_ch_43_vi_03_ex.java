package com.company;
import java.lang.Math;
import java.util.Scanner;

class Game{
    public int random_number(){
        int min = 1;
        int max = 20;
        int random_num = (int)(Math.random()*(max - min + 1) + min);
        System.out.println(random_num);
        return random_num;
    }
    public int take_user_input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please give me a number: ");
        int number = input.nextInt();
        return number;
    }
    public int isCorrect(){
        int condition = 0;
        if (random_number() == take_user_input()){
            condition = 1;
            System.out.println("You won the game");
        }
        else if (random_number() > take_user_input()){
            System.out.println("Please chose bigger one ");
        }
        else {
            System.out.println("Please chose smaller one ");
        }
        return condition;
    }
}

public class java_09_ch_43_vi_03_ex {
    public static void main(String[] args) {
        Game game = new Game();
        do {
            game.random_number();
            game.take_user_input();
        } while (game.isCorrect() != 1);
    }
}
