package com.hillel.homework.lesson14;

public abstract class Drink {
    private double price;

    public Drink(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract String prepare();

    @Override
    public String toString() {
        return "Напій";
    }
}
