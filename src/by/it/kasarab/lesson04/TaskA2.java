package by.it.kasarab.lesson04;

/*

День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7,
    то вывести уведомление что такого дня недели не существует.
5.  Нельзя использовать массивы или коллекции Java.

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

 */

import java.util.Scanner;

public class TaskA2 {

    private static String getWd(int a) {
        switch (a) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "такого дня недели не существует";
        }
    }

    public static void main(String[] args) {
        System.out.println("Type the number between 1 and 7");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(getWd(a));
    }
}


/*    switch (a){
          case 1 :
              if (a == 1) System.out.println("понедельник");
              break;
          case 2 :
            if(a==2)  System.out.println("вторник");
              break;
          case 3 :
             if (a==3) System.out.println("среда");
              break;
          case 4 :
             if (a==4) System.out.println("четверг");
              break;
          case 5 :
            if (a==5)  System.out.println("пятница");
              break;
          case 6 :
            if (a==6)   System.out.println("суббота");
             break;
          case 7:
            if (a==7)   System.out.println("воскресенье");
              break;
          default :
              System.out.println("такого дня недели не существует");
               } */
