package com.hillel.homework.lesson14;

public class Americano extends Drink {
    public Americano() {
        super(25.5);
    }

    @Override
    public String prepare() {
        return  "Готуємо Американо\nСмачної Вам кави!\n";
    }
    @Override
    public String toString() {
        return "Американо";
    }
}
