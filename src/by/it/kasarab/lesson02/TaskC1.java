package by.it.kasarab.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/

import java.util.Scanner;

class TaskC1 {
    public static void main(String[] args) {
        System.out.print("Insert  2 numbers");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Sum = " + (a + b));

    }
}
