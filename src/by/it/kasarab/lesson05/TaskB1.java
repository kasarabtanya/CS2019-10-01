package by.it.kasarab.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/

import java.util.ArrayList;
import java.util.Scanner;


public class TaskB1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add(0, "un dos tres");
        list.add(1, "cuatro cinco");
        list.add(2, "seis, siete");
        list.add(3, "Ocho- nueve");
        list.add(4, "DIEZ");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));


        }
    }
}


