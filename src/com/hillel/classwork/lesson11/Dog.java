package com.hillel.classwork.lesson11;


public class Dog {
    String breed;
    String size;
    String color;
    int age;

    public Dog(){
        System.out.println("Dog has been created!");
    }
    public Dog(String breed, String size, String color, int age){
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    public void Run() {
        System.out.println("The dog is running...");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dog) {
            Dog dog = (Dog) obj;
/*            if (this.size.equals(dog.size) && this.age == dog.age) {
                return true;
            }*/
            return this.size.equals(dog.size) && this.age == dog.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
