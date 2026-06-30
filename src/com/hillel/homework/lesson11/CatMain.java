package com.hillel.homework.lesson11;

public class CatMain {
    public static void main(String[] args) {
        new Cat();
        System.out.println(" ");
        Cat cat1 = new Cat("Marry", "Belgian", 5, 3);
        System.out.println( cat1);
        System.out.println(" ");
        Cat cat2 = new Cat("Berry", "Bengal", 5, 3);
        System.out.println( cat1);
        System.out.println(" ");
        Cat cat3 = new Cat("Agata", 5);
        System.out.println(cat2);
        System.out.println(" ");
        Cat cat4 = new Cat("Bretta", 5);
        System.out.println(cat3);
        System.out.println(" ");
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));
        System.out.println(cat1.equals(cat4));
        System.out.println(" ");
        System.out.println(cat3.equals(cat4));
        System.out.println(cat3.equals(cat2));
    }
}
