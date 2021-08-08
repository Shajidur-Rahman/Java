package com.company;
import java.util.Scanner;

class details{
    String name ;
    int age;
    String school;
    public void prontDetails(){
        System.out.println("My name is "+ name);
        System.out.println("My age is " + age);
        System.out.println("My School is " + school);
    }
}

public class java_08_ch_36_vi_01_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------- Welcome to the details family -------------------");
        details shajidur = new details();
        shajidur.name = "Shajidur";
        shajidur.age = 12;
        shajidur.school = "Dinajpur Zilla School";

        details mushfiq = new details();
        mushfiq.name = "Mushfiq";
        mushfiq.age = 12;
        mushfiq.school = "Girls School";

        System.out.print("Person name:  ");
        String ask = input.nextLine();
        if (ask == "shajidur"){
            shajidur.prontDetails();
        }
        else if (ask == "mushfiq"){
            mushfiq.prontDetails();
        }
        else {
            System.out.println("Not found");
        }

    }
}
