package by.it.kasarab.freeJava;

import java.util.Scanner;
/*Определите сумму элементов массива, расположенных между минимальным и
максимальным значениями. (Сами максимальное и минимальное значения в
суммировании не участвуют.)
 */


class l7 {
    public static void main(String[] args) {
        int[] ran = new int[8];
        for (int i = 0; i < ran.length; i++) {
            ran[i] = (int) (Math.random() * 20 + 1);
        }
        //       int ran[]= {9,1,8,7,4,8,5,8};

        for (int i = 0; i < ran.length; i++) {
            System.out.print(ran[i] + " ");
        }
        System.out.println();
        int min = ran[0];
        int max = ran[0];
        int mi = 0;
        int ma = 0;
        int sum = 0;
        int i = 0;
        for (i = 0; i < ran.length; i++) {
            if (min > ran[i]) {
                min = ran[i];
                mi = i;
            }
            if (max < ran[i]) {
                max = ran[i];
                ma = i;
            }
        }
        System.out.println("mi is " + mi + " ma is " + ma);
        int first = 0, last = 0;
        if (mi > ma) {
            first = ma + 1;
            last = mi;
        } else {
            first = mi + 1;
            last = ma;
        }
        System.out.println("first is " + first + " last is " + last);

        for (i = first; i < last; i++) {
            sum = sum + ran[i];
        }

        System.out.println("sum is " + sum);
    }
}
