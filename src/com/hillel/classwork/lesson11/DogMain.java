package com.hillel.classwork.lesson11;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Run();

        System.out.println(dog.breed);
        System.out.println(dog.size);
        System.out.println(dog.age);
        System.out.println(dog.color);

        Dog dog2 = new Dog();
        dog.Run();
        dog2.breed = "Mastiff";
        dog2.color = "Black";
        dog2.size = "Large";
        dog2.age = 5;

        Dog dog3 = new Dog();
        dog3.Run();
        dog3.breed = "Maltese";
        dog3.color = "White";
        dog3.size = "Mediun";
        dog.age = 3;

        Dog dog4 = new Dog("Chow Chow", "Small","Grey", 4 );
        System.out.println(dog4);
    }
}
