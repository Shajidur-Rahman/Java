package com.company;

// problem 1

/*
class greet extends Thread{
    public void run(){
        while (true){
        System.out.println("Good morning");
        }
    }
}

class greet2 extends Thread{
    public void run(){
        while (true){
            System.out.println("Welcome");
        }
    }
}
*/

// problem 2

class greet3 extends Thread{
    public void run(){
        while (true){
            System.out.println("Good morning");
        }
    }
}

class greet4 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Welcome");
        }
    }
}

public class java_13_ch_76_vi_01_pr {
    public static void main(String[] args) {
        // problem 1
        /*
        greet g1 = new greet();
        greet2 g2 = new greet2();
        g1.start();
        g2.start();
        */

        // problem 2
         /*
        greet3 g3 = new greet3();
        greet4 g4 = new greet4();
        g3.start();
        g4.start();
         */

        // problem 3
        // problem 4

    }
}
