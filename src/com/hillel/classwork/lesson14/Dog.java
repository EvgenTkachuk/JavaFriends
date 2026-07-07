package com.hillel.classwork.lesson14;

public class Dog extends Animal {
    public Dog(String color){
        super (color);
    }
    @Override
    public void speak() {
        super.speak();
        System.out.println("I'm a dog");
    }
}
