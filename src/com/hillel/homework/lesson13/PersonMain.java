package com.hillel.homework.lesson13;

import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        String[] name = {"Олександр", "Сергій", "Андрій", "Володимир", "Дмитро", "Ігор", "Олег", "Артем", "Максим", "Богдан",
                "Анастасія", "Катерина", "Марина", "Дар'я", "Вікторія", "Христина", "Аліна", "Вероніка", "Софія", "Яна"};

        String[] surname = {"Шевченко", "Коваленко", "Бондаренко", "Ткаченко", "Кравченко", "Ковальчук", "Коваль", "Олійник", "Поліщук", "Ткачук",
                "Захаренко", "Лук'яненко", "Тарасенко", "Гриценко", "Юрченко", "Яценко", "Клименко", "Корнієнко", "Слободян", "Романова"};

        Person[] persons = new Person[100];

        String randomName;
        String randomSurname;


        for (int i = 0; i < persons.length; i++) {
            int age = 1+(int) (Math.random() * 79);//виключення нуля зі списку ймовірних значень віку
            randomName = name[(int) (Math.random() * name.length)];
            randomSurname = surname[(int) (Math.random() * surname.length)];
            double height;
            double weight;
            double bmi;
            // ІМТ розраховується за формулою: I=m/h^2
            //  де m — маса тіла в кілограмах, а h — зріст у метрах
            if (age <= 3) {
                //для малюків за виключенням новонароджених
                height = 70 + (age * 10) + (Math.random() * 10);// Від 80 до 110 см
                weight = 8 * (age * 2) + (Math.random() * 3);// Від 10 до 17 кг
            }
            else if ( age <= 15) {
                height = 100 + ((age - 3) * 5) + (Math.random() * 15);
                bmi = 15 + (Math.random() * 5);//середній дитячий ІМТ в діапазоні +-5
                weight = bmi * (Math.pow(height / 100.0, 2));
            }
            else {
                height = 155 + (Math.random() * 40);
                bmi = 18.5 + (Math.random() * 6.5);//середній дорослий ІМТ в діапазоні +-17
                weight = bmi * (Math.pow(height / 100.0, 2));
            }
            persons[i] = new Person(randomName, randomSurname, age, weight, height);
            System.out.println(persons[i].toString());
        }
    }
}
