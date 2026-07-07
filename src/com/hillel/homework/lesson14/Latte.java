package com.hillel.homework.lesson14;


public class Latte extends Drink {
    public Latte() {
        super(30.0);
    }

    @Override
    public String prepare() {
        return  "Готуємо Лате\nСмачної Вам кави!\n";
    }
    @Override
    public String toString() {
        return "Лате";
    }
}
