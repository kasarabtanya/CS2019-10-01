package by.it.kasarab.freeJava;

import java.util.Scanner;
/*Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно
создавать еще один массив).

Замечание: речь не идет о распечатке массива задом наперед.
Следует переставить элементы массива в нем самом.
Т.е. если изначально массив из 10 элементов и в нулевом лежало
значение 10 а в девятом 3, то после перестановки в нулевом должно
быть 3 а в девятом 10 и т.д.
 */

class l6 {
    public static void main(String[] args) {

        int[] ran = new int[20];
        for (int i = 0; i < ran.length; i++) {
            ran[i] = (int) (Math.random() * 100 + 1);
        }
        for (int i = 0; i < ran.length; i++) {
            System.out.print(ran[i] + " ");
        }
        System.out.println();
        int x = ran.length - 1;
        int i = 0;
        int t;

        for (; i < ran.length / 2; ) {

            t = ran[i];
            ran[i] = ran[x];
            ran[x] = t;
            x = x - 1;
            i = i + 1;
        }

        for (i = 0; i < ran.length; i++) {
            System.out.print(ran[i] + " ");
        }

    }
}
