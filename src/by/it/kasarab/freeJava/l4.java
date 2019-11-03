package by.it.kasarab.freeJava;

import java.util.Scanner;
// написать программу, которая определит, закроет ли круг прямоугольник с
// заданныеми сторонами

class l4 {
    public static void main(String[] args) {

        int a = 4;   // сторона прямоугольника
        int b = 4;   // сторона прямоугольника
        int r = 3;    // радиус круга

        double gip = Math.pow(((a * a) + (b * b)), (0.5));

        if ((int) gip <= (r * 2)) {
            System.out.println("Закроет");
        } else {
            System.out.println(" Не закроет");
        }
    }
}
