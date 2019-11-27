package by.it.kasarab.freeJava;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        System.out.println("Введите 3 целых числа от 1 до 1000");
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if ((a < 1 || a > 1000) || (b < 1 || b > 1000) || (c < 1 || c > 1000)) {
            System.out.println("Стороны треугольника должны быть целыми числами от 1 до 1000");
        } else if ((b + c <= a) || ((a + c) <= b) || ((a + b) <= c)) {
            System.out.println("Одна из сторон слишком велика для построения треугольника");
        } else if ((a == b && a != c) || (a != c && b == c) || (a == c && b != c))
            System.out.println("Треугольник равнобедренный");
        else if (a == b && a == c)
            System.out.println("Треугольник равносторонний");
        else if (a != c && b != c)
            System.out.println("Треугольник обычный");

    }
}


