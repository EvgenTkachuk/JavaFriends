package com.hillel.homework.lesson13;

public class Person {
    private String name;
    private String surname;
    private int age;
    private double height;
    private double weight;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public Person(String name, String surname, int age, double weight, double height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String toString() {
        return String.format("%-10s %-12s | Вік: %-3d років | Зріст: %-5.1f см | Вага: %-5.1f кг", name, surname, age, height, weight);
    }

}

