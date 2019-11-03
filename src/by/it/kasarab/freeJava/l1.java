package by.it.kasarab.freeJava;

import java.util.Scanner;
// программа определяет время из секунд

class l1 {
    public static void main(String[] args) {

        int s = 11784;
        int sec = s % 60;
        int m = s / 60;
        int min = m % 60;
        int h = m / 60;
        System.out.println(h + " hours " + min + " minutes " + sec + " seconds");
    }


}
