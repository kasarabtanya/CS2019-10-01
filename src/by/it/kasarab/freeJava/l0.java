package by.it.kasarab.freeJava;

import java.util.Scanner;


class l0 {

    private static int cube(int x) {
        return x * x * x;
    }

    public static void main(String[] args) {
        int x = 5;
        int z = l0.cube(15) / l0.cube(3) + l0.cube(x + 2);

        System.out.print(z);


    }

}
