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
        //   Scanner sc = new Scanner(System.in);
       /*      int[] an = new int[20];
        // ввод с клавиатуры
        for (int i = 0; i < 20; i++) {
            an[i] = sc.nextInt();
        }   */
        //  int x = 0;
        int[] an = {3, 9, 1, 4, 666, -2, 665, -1, 0, 9, 8, 3, 8, 4, 5, 1, 0, 7, 5, 7};

        System.out.print("is ");
        for (int i = 0; i < an.length; i++)
            System.out.print(an[i] + " ");
        System.out.println();

        // for (int a = 1; a < an.length; a++)
        for (int b = 0; b < an.length; b++) {
            if (an[b] < an[b + 1]) {
                int t = an[b + 1];
                an[b + 1] = an[b];
                an[b] = t;
            }

             /*   for (int x = 0; x < an.length;x++) {
                    if (an[x] > an[x + 1]) {
                        int t = an[x + 1];
                        an[x + 1] = an[x];
                        an[x] = t;

                    }
                // }  */

            for (int i = 0; i < 20; i++) {
                System.out.print(an[i] + " ");
            }
            System.out.println();
        }

    }
}



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







  /*     for (int i = 0; i < 20; i++)
            System.out.print(an[i] + " ");
        System.out.println();
             for (int i = an.length - 1; i >= 0; i--)
            System.out.println(an[i]+" ");  */





