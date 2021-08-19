package com.company;
//import javax.swing.plaf.metal.MetalButtonUI;
import java.util.Random;
import java.util.Scanner;

class Gameme{
    public int number;
    public int noOfGuess;
    public int inputNumber;

    // getter of noOfguess
    public int getNoOfGuess() {return noOfGuess;}
    // setter of noOfGuess
    public void setNoOfGuess(int noOfGuess) {this.noOfGuess = noOfGuess;}


    Gameme(){
        Random rand = new Random();
        this.number = rand.nextInt(30);
    }
    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a number: ");
        this.inputNumber = sc.nextInt();
    }
    boolean isCorrect(){
        if (inputNumber == number){
            return true;
        }
        else if (inputNumber < number){
            System.out.println("Too less....");
        }
        else if (inputNumber > number){ // can create problem
            System.out.println("Too high....");
        }
        return false;
    }

}

public class java_ex_03 {
    public static void main(String[] args) {
        Gameme g = new Gameme();
        g.takeUserInput();
        boolean b = g.isCorrect();
        System.out.println(b);
    }
}
