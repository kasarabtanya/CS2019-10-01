package by.it.kasarab.freeJava;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a < 1 || a > 1000) {
            System.out.println("Сторона А не соответсвует условиям");
        } else if ((b + c) <= a) {
            System.out.println("Сторона A слишком велика для построения треугольника");
        } else if (b < 1 || b > 1000) {
            System.out.println("Сторона B не соответсвует условиям");
        } else if ((a + c) <= b) {
            System.out.println("Сторона B слишком велика для построения треугольника");
        } else if (c < 1 || c > 1000) {
            System.out.println("Сторона C не соответсвует условиям");
        } else if ((a + b) <= c) {
            System.out.println("Сторона C слишком велика для построения треугольника");
        } else if (a == b && a != c)
            System.out.println("Треугольник равнобедренный");
        else if (a == b && a == c)
            System.out.println("Треугольник равносторонний");
        else if (a != c && b == c)
            System.out.println("Треугольник равнобедренный");
        else if (a != c && b != c)
            System.out.println("Треугольник обычный");
        else if (a == c && b != c)
            System.out.println("Треугольник равнобедренный");
    }
}


