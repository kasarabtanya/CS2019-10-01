package by.it.kasarab.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class TaskC3 {
    //Напишите тут ваш код

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //     int[] an = new int[20];
        //     for (int i = 0; i < an.length; i++) {
        //       an[i] = sc.nextInt();
        //     } // ввод с клавиатуры */
        //  int x = 0;
        int[] an = {11, 20, 41, 2, 6, 7, 99, 12, 15, 32, 3, 19, 5, 23, 24, 42, 90, 16, 4, 11, 1};

        System.out.print("original array is ");
        for (int i = 0; i < an.length; i++)
            System.out.print(an[i] + " ");
        System.out.println();
//
//int l=an[0];
//int r=an[an.length-1];
//int []b=new int[an.length/2];
//int[]c=new int[an.length-(an.length/2)];
////if (l!=r){
//      for (int i=0;i<=an.length/2;i++) {
//          b[i] = an[i];
//      }
//
//    for (int i = 0; i < b.length; i++) // проверка первой половины поделенного массива
//        System.out.print(b[i] + " ");
//    System.out.println();

//
//      for (int i=an.length-(an.length/2)+1;i<an.length;i++){
//          int x=0;
//           c [x] =an[i];
//      x++;}
//}
//
//
//       for (int i = 0; i < c.length; i++) // // проверка второй половины поделенного массива
//           System.out.print( c[i] + " ");
//       System.out.println();
//
//
//
//




  /*     for (int i = 0; i < 20; i++)
            System.out.print(an[i] + " ");
        System.out.println();
             for (int i = an.length - 1; i >= 0; i--)
            System.out.println(an[i]+" ");  */


    }

}
/*
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> orig = new ArrayList<Integer>();
        int i;
        for (i = 0; i < 20; i++) {
            int x = sc.nextInt();
            orig.add(x);
        }
        ArrayList<Integer> sec = new ArrayList<Integer>();
        ArrayList<Integer> third = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();

        for (int x = 0; x < 20; x++) {
            Integer a = orig.get(x);
            if (a % 3 == 0) third.add(a);

            if (a % 3 != 0 & a % 2 != 0) other.add(a);
        }

        for (Integer aList : orig) System.out.println(aList);
        for (Integer aList : sec) System.out.println(aList);

    } }
*/

