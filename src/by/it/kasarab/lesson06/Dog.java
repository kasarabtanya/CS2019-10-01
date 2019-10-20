package by.it.kasarab.lesson06;

public class Dog {
    private String name = " ";
    private int age = 0;
    private int weight; //вес собаки
    private double power; //сила укуса собаки


    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return ("Кличка: " + getName() + ". Возраст: " + getAge());

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public boolean win(Dog otherDog) {

        return (this.age * 0.2 + this.weight * 0.3 + this.power * 0.5 >
                otherDog.age * 0.2 + otherDog.weight * 0.3 + otherDog.power * 0.5);
    }


}

