package com.hillel.homework.lesson13;

public class Human {
    private String name;
    private String surname;
    private String active;
    private int age;

    private Human father;
    private Human mother;

    public Human(String name, String surname, String active, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.active = active;
    }

    public Human(String name, String surname, String active, int age, Human father, Human mother) {
        this(name, surname, active, age);
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getActive() {
        return active;
    }

    public int getAge() {
        return age;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public String toString() {
        String info = String.format("Людина: %s %s | Діяльність:  %s | Вік: %d", name, surname, active, age);

        if (father != null && mother != null) {
            info += String.format("\n                    |_ Батько: %s %s | Діяльність:  %s | Вік: %d", father.name, father.surname,father.active,father.age);
            info += String.format("\n                    |_ Мати: %s %s   | Діяльність:  %s | Вік: %d", mother.name, mother.surname,mother.active,mother.age);
        }
        return info;
    }
}
