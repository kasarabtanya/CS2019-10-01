package by.it.kasarab.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC3 {
    //Напишите тут ваш код

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        } // ввод с клавиатуры

   /*     for (int a = 1; a < array.length; a++)
            for (int b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    int t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            } - пузырьковая сортировка, не нужна */

        // вывод на экран в обратном порядке:
        for (int i = array.length - 1; i >= 0; i--)
            System.out.println(array[i]);

    }

    // public static void sort(int[] array) {
    //Напишите тут ваш код
    //   }

}
