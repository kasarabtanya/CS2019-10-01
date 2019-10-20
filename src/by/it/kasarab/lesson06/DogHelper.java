package by.it.kasarab.lesson06;


import java.text.MessageFormat;

public class DogHelper {
    public static void printAllNames(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].getName() + " ");
        }
    }

    public static double averageAge(Dog[] dogs) {
        double sum = 0.0;
        for (int i = 0; i < dogs.length; i++) {
            sum += dogs[i].getAge();
        }
        return (double) sum / dogs.length;
    }
}


