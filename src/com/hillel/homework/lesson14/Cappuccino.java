package com.hillel.homework.lesson14;

public class Cappuccino extends Drink {
    public Cappuccino() {
        super(32.5);
    }

    @Override
    public String prepare() {
        return  "Готуємо Капучіно\nСмачної Вам кави!\n";
    }

    @Override
    public String toString() {
        return "Капучіно";
    }
}
