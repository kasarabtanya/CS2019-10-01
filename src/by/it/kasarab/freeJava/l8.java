package by.it.kasarab.freeJava;
// вывести на печать все числа ( не отд. цифры) в строке

import java.util.Scanner;

class l8 {
    public static void main(String[] args) {


        String s = "x=1x2 y=1115 z=256z 28";
        String sn = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sn += s.charAt(i);
            } else {
                if (!sn.equals("")) {
                    System.out.println(sn);
                    sn = "";
                }
            }
        }
        if (!sn.equals(""))
            System.out.println(sn);


    }
}
