package by.it.kasarab.freeJava;

import java.util.Scanner;

class l10 {
    public static void main(String[] args) {
        System.out.print("type a string  ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int quan = 0;
        int n = 0;
        int p = 0;
        char r = ' ';
        for (int i = 0; i < s.length(); i++) {
            while (p < s.length()) {
                if (s.charAt(p) == r)
                    p = p + 1;
                else {
                    n = n + 1;
                    break;
                }
            }
            while (p < s.length()) {
                if (s.charAt(p) != r)
                    p = p + 1;
                else {
                    quan = quan + 1;
                    break;
                }
            }

        }
        System.out.println("There are " + n + " words in this text.");

    }
}

