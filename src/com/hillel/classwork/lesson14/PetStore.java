package com.hillel.classwork.lesson14;

import java.util.ArrayList;
import java.util.List;

import static com.hillel.classwork.lesson14.Animal.DEFAULT_COLOR;

public class PetStore{
    public static void main(String[] args) {
        Animal cat = new Cat(DEFAULT_COLOR,"Persian");
        Animal dog = new Dog("Black");
        Animal rat = new Rat("grey","field");
        //Animal[] animal1 = new Animal[2];
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(new Rat("white","animal cage"));
        for (Animal animal : animals){
            animal.speak();
        }
    }
}
