package com.hillel.classwork.lesson14;

public class Rat extends Animal {
    String habitats;
    public Rat (String color, String habitats){
        super(color);
        this.habitats = habitats;
    }
    @Override
    public void speak() {
        super.speak();
    }
}
