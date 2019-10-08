package by.it.kasarab.lesson02;
import java.util.Scanner;
/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51
*/

class TaskC3 {

    public static double getWeight(int weight){
        double marsw = weight / 9.81 * 3.86;
        marsw = Math.round(marsw * 100.0) / 100.0;
        return marsw;
    }

    public static void main(String[] args) {
       System.out.print("Insert weight on Earth");
        Scanner s = new Scanner(System.in);
        int weight = s.nextInt();
        System.out.println(TaskC3.getWeight(weight));
    }


}
