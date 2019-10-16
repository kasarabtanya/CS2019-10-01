package by.it.kasarab.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Scanner;

public class TaskB3 {

    public static void main(String[] args) {
        int q, z, first = 0, last = 0;
        Scanner sc = new Scanner(System.in);

        int[] m = new int[10];

        for (int i = 0; i < m.length; i++)
            m[i] = sc.nextInt();
        q = m[0];
        z = m[m.length - 1];

        for (int a = 1; a < m.length; a++)
            for (int b = m.length - 1; b >= a; b--) {
                if (m[b - 1] > m[b]) {
                    int t = m[b - 1];
                    m[b - 1] = m[b];
                    m[b] = t;

                }

            }
      /*  for (int a = 0; a < m.length; a++) {

            System.out.print(m[a] + " ");
        }
        System.out.print("q= " + q + " z= " + z); */

        for (int a = 0; a < m.length; a++) {
            if (m[a] == q) {
                first = a;
            }
            if (m[a] == z) {
                last = a;
            }
        }

        System.out.println("Index of first element=" + first);
        System.out.println("Index of last element=" + last);
    }


}




