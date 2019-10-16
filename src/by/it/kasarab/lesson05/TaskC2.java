package by.it.kasarab.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/

import java.util.Scanner;

public class TaskC2 {
    int[] array = new int[20];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int a = 1; a < array.length; a++)
            for (int b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    int t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        for (int i = array.length - 1; i >= 0; i--)
            System.out.println(array[i]);

    }
}


