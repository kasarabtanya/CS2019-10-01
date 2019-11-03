package by.it.kasarab.freeJava;
// написать программу, определяющую, простое число или нет

import java.util.Scanner;

class l5 {
    public static void main(String[] args) {

        System.out.print("Insert  1 number  ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int i;
        int s = 0;

        for (i = 2; i < ch; i++) {
            if (ch % i == 0) {
                //             System.out.println(ch + " is  not simple, it can be devided on " + i);
                s = s + 1;
            }
            if (s >= 1)
                break;
        }
        if (s < 1) System.out.println(ch + " is simple, s= " + s);
        else System.out.println(ch + " is not simple, s= " + s);
    }
}




