package com.hillel.classwork.lesson14;

public class Cat extends Animal {
    String breed;
    public Cat(String color, String breed) {
        super(color);
        this.breed = "Default";
    }
    @Override
    public void speak() {
        System.out.println("I'm a cat");
    }
}
