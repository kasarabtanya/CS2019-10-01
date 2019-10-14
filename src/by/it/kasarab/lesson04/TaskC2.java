package by.it.kasarab.lesson04;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */

import java.util.Scanner;

public class TaskC2 {
    int day, month;

    public static int getDay(int month, int day) {
        switch (month) {
            case 1:
                return day;
            case 2:
                return day + 31;
            case 3:
                return day + 31 + 28;
            case 4:
                return day + 31 + 28 + 31;
            case 5:
                return day + 31 + 28 + 31 + 30;
            case 6:
                return day + 31 + 28 + 31 + 30 + 31;
            case 7:
                return day + 31 + 28 + 31 + 30 + 31 + 30;
            case 8:
                return day + 31 + 28 + 31 + 30 + 31 + 30 + 31;
            case 9:
                return day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
            case 10:
                return day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
            case 11:
                return day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
            case 12:
                return day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число и месяц 2018 года цифрами через пробел");
        int day = sc.nextInt();
        int month = sc.nextInt();
        System.out.println(getDay(month, day));

    }
}
