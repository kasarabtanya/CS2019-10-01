package by.it.kasarab.freeJava;
// создать программу, подсчитывающую количество знаков препинания в тексте

import java.util.Scanner;

class l9 {
    public static void main(String[] args) {

        System.out.print("type a string  ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int quan = 0;
        int n = 0;
        int p = 0;
        while (p != -1) {
            p = s.indexOf(',', p);
            if (p != -1) {
                p++;
                n++;
            }
        }
        quan = quan + n;
        p = 0;
        n = 0;
        while (p != -1) {
            p = s.indexOf('.', p);
            if (p != -1) {
                p++;
                n++;
            }
        }
        quan = quan + n;
        p = 0;
        n = 0;
        while (p != -1) {
            p = s.indexOf('?', p);
            if (p != -1) {
                p++;
                n++;
            }
        }
        quan = quan + n;
        p = 0;
        n = 0;
        while (p != -1) {
            p = s.indexOf(';', p);
            if (p != -1) {
                p++;
                n++;
            }
        }
        quan = quan + n;
        p = 0;
        n = 0;
        while (p != -1) {
            p = s.indexOf(':', p);
            if (p != -1) {
                p++;
                n++;
            }
        }
        quan = quan + n;
        p = 0;
        n = 0;
        while (p != -1) {
            p = s.indexOf('!', p);
            if (p != -1) {
                p++;
                n++;
            }
        }
        quan = quan + n;
        p = 0;
        n = 0;

        System.out.println(quan);

    }
}

