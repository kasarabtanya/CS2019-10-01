package by.it.kasarab.freeJava;

import java.util.Scanner;
// написать программу, которая будет добавлять слово "рубль" к числу.

class l3 {
    public static void main(String[] args) {
        System.out.println("Input a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ost = a % 10;
        switch (ost) {
            case 0:
                System.out.println(a + " рублей");
                break;
            case 1:
                System.out.println(a + " рубль");
                break;
            case 2:
                System.out.println(a + " рубля");
                break;
            case 3:
                System.out.println(a + " рубля");
                break;
            case 4:
                System.out.println(a + " рубля");
                break;
            default:
                System.out.println(a + " рублей");
        }
    }

}
