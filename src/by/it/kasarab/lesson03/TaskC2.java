package by.it.kasarab.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {

    static int sumDigitsInNumber(int number) {
        int a, b, c, d;
        //   System.out.print("Insert  4-digit number");
        //   Scanner sc = new Scanner(System.in);
        //  number = sc.nextInt();

        a = number / 1000;
        b = (number - (a * 1000)) / 100;
        c = (number - (a * 1000) - (b * 100)) / 10;
        d = number - (a * 1000) - (b * 100) - (c * 10);
        number = 5467;
        return a + b + c + d;

        //      if (0 >=a && a>=10) System.out.println ("false number");
    }
    public static void main(String[] args) {     }

}
