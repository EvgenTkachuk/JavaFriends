package com.hillel.homework.lesson13;

public class HumanMain {
    public static void main(String[] args) {
        //Перше покоління
        Human dad = new Human("Тарас", "Шевченко", "Написав <<Кобзар>>", 32);
        Human mom = new Human("Леся", "Українка", " Написала <<Contra Spem Spero>>", 23);
        //Друге покоління
        Children child = new Children("Василь","Стус","Написав <<Терпи, терпи — терпець тебе шліфує>>",18,dad,mom);

        System.out.println("---  Перше покоління  ---");
        System.out.println(dad);
        System.out.println(mom);
        System.out.println("---  Друге покоління  ---");
        System.out.println(child);
    }
}