package by.it.kasarab.lesson04;

/*
Выведите на экран в цикле 10 раз фразу
Я изучаю программирование.

при  выводе сделайте такое разветвление в теле цикла,
чтобы вместо 3-й и 9-й по счету фраз выводилась фраза
Меня интересует высокая зарплата!

Должнен получиться следующий вывод строк:

Я изучаю программирование.
Я изучаю программирование.
Меня интересует высокая зарплата!
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Меня интересует высокая зарплата!
Я изучаю программирование.



 */
public class TaskA1 {
    public static void main(String[] args) {
        int a;
        for (a = 1; a <= 10; a++) {
            if (a != 3 & a != 9)
                System.out.println("Я изучаю программирование.");
            else System.out.println("Меня интересует высокая зарплата!");
        }
    }

}



