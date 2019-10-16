package by.it.kasarab.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {

    private static void printList(List<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> original = new ArrayList<Integer>();
        int i;
        for (i = 0; i < 20; i++) {
            int x = sc.nextInt();
            original.add(x);
        }
        ArrayList<Integer> three = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();

        for (int x = 0; x < 20; x++) {
            Integer a = original.get(x);
            if (a % 3 == 0) three.add(a);
            if (a % 2 == 0) two.add(a);
            if (a % 3 != 0 & a % 2 != 0) other.add(a);
        }

        for (Integer aList : three) System.out.println(aList);
        for (Integer aList : two) System.out.println(aList);
        for (Integer aList : other) System.out.println(aList);
    }
}

      
