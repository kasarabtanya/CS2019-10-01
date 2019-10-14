package by.it.kasarab.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/


public class TaskC3 {
    int a = 1, b = 1;

    private static String getSimple(int a) {

        switch (a) {
            case 1:
                return "один";
            case 2:
                return "два";
            case 3:
                return "три";
            case 4:
                return "четыре";
            case 5:
                return "пять";
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            case 9:
                return "девять";

        }

        return getSimple(a);
    }


    private static String getTeens(int a) {

        switch (a) {
            case 10:
                return "десять";
            case 11:
                return "одиннадцать";
            case 12:
                return "двенадцать";
            case 13:
                return "тринадцать";
            case 14:
                return "четырнадцать";
            case 15:
                return "пятнадцать";
            case 16:
                return "шестнадцать";
            case 17:
                return "семнадцать";
            case 18:
                return "восемнадцать";
            case 19:
                return "девятнадцать";
        }


        return getTeens(a);
    }

    private static String getDouble(int a) {

        if (a >= 1 & a <= 9) {
            return getSimple(a);
        }
        if (a >= 10 & a <= 19) {
            return getTeens(a);
        }
        if (a >= 20 & a <= 100) {
            if (a % 10 == 0) {
                switch (a) {
                    case 20:
                        return "двадцать";
                    case 30:
                        return "тридцать";
                    case 40:
                        return "сорок";
                    case 50:
                        return "пятьдесят";
                    case 60:
                        return "шестьдесят";
                    case 70:
                        return "семьдесят";
                    case 80:
                        return "восемьдесят";
                    case 90:
                        return "девяносто";
                    case 100:
                        return "сто";
                }

            }

            if (a % 10 != 0) {
                return getDouble(a / 10 * 10) + " " + getSimple(a % 10);
            }
        }

        return getDouble(a);
    }

    public static void main(String[] args) {
        int c = 1, b = 1;
        while (c <= 10 && b <= 10) {

            for (b = 1; b <= 10; b++) {

                System.out.println(getDouble(c) + " умножить на " + getDouble(b) + " равно " + getDouble(c * b));
            }
            c++;
            b = 1;
        }

    }
}



   /*

        int a=1, b=1 ;

        while (a <= 10 & b<=10) {

            for (b = 1; b <= 10; b++) {
               System.out.println(a+ " умножить на "+ b + " равно "+a*b);}
        a++;
        b=1;
            } */




