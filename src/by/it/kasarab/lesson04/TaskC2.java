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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число и месяц 2018 года цифрами через пробел");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int result=0;

        if (month ==1 & day >=1 & day <=31) {
            result = day;}
        if (month ==2 & day >=1 & day <=28) {
            result = day+31;}
        if (month ==3 & day >=1 & day <=31) {
            result = day+31+28;}
        if (month ==4 & day >=1 & day <=30) {
            result = day+31+28+31;}
        if (month ==5 & day >=1 & day <=31) {
            result = day+31+28+31+30;}
        if (month ==6 & day >=1 & day <=30) {
            result = day+31+28+31+30+31;}
        if (month ==7 & day >=1 & day <=31) {
            result = day+31+28+31+30+31+30;}
        if (month ==8 & day >=1 & day <=31) {
            result = day+31+28+31+30+31+30+31;}
        if (month ==9 & day >=1 & day <=30) {
            result = day+31+28+31+30+31+30+31+31;}
        if (month ==10 & day >=1 & day <=31) {
            result = day+31+28+31+30+31+30+31+31+30;}
        if (month ==11 & day >=1 & day <=30) {
            result = day+31+28+31+30+31+30+31+31+30+31;}
        if (month ==12 & day >=1 & day <=31) {
            result = day+31+28+31+30+31+30+31+31+30+31+30;}
        System.out.println(result);
        }
    }