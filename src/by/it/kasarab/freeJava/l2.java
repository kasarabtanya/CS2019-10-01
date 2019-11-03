package by.it.kasarab.freeJava;

import java.util.Scanner;
//написать программу, которая определит, какая цифра двуъзначного числа больше

public class l2 {
    public static void main(String[] args) {
        int x = 128;
        int digit2 = x % 10;
        int digit1 = (x / 10) % 10;
        if (digit1 > digit2)
            System.out.println("first digit is larger");
        else
            System.out.println("second digit is equal or larger");


    }

}

