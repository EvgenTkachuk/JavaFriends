package com.hillel.homework.lesson11;

public class Cat {
    String name;
    String breed;
    int age;
    int weight;

    public Cat() {
        System.out.println(
                "The cat has been created (By default) with name: " + name + " , breed: " + breed + " , age: " + age + " , weight: " + weight
        );
    }

    public Cat(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        System.out.println(
                "The cat has been created (Overriding 4 parameters) with name: " + name + " , breed: " + breed + " , age: " + age+ " , weight: " + weight
        );
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("The cat has been created (Overriding 2 parameters) with name: " + name + " , breed: " + breed + " , age: " + age+ " , weight: " + weight
        );
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat){//перевіряє чи є obj екземпляром класу Cat
            Cat cat = (Cat) obj;
            return cat.weight == this.weight && cat.age == this.age;// перевіряє на еквівалентність 2 параметри та повертає true
        }
        return false;
    }
}
