package com.hillel.homework.lesson13;

import com.hillel.classwork.lesson13.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatMain {
    public static void main(String[] args) {
        com.hillel.classwork.lesson13.Cat cat1 = new com.hillel.classwork.lesson13.Cat("Frank", 2, 2.5, true);
        com.hillel.classwork.lesson13.Cat cat2 = new com.hillel.classwork.lesson13.Cat("Nancy", 5, 4, false);
        com.hillel.classwork.lesson13.Cat cat3 = new com.hillel.classwork.lesson13.Cat("Bill", 3, 3.2, true);
        com.hillel.classwork.lesson13.Cat cat4 = new com.hillel.classwork.lesson13.Cat("John", 7, 4, false);
        com.hillel.classwork.lesson13.Cat cat5 = new com.hillel.classwork.lesson13.Cat("Johny", 7, 4, true);

        List<com.hillel.classwork.lesson13.Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat5);
        System.out.println("\n----------------------------Перелік бійців--------------------------------<\n");
        for (com.hillel.classwork.lesson13.Cat cat : catList) {
            System.out.println(cat);
        }
        System.out.println("\n----------------------------Перелік бійців--------------------------------<\n");

        Scanner sc = new Scanner(System.in);
        com.hillel.classwork.lesson13.Cat myCat = selectCatByName(catList, sc);
        com.hillel.classwork.lesson13.Cat opponentCat = selectCatByName(catList, sc);
        if (myCat != null && opponentCat != null) {
            com.hillel.classwork.lesson13.Cat winner = myCat.fight(opponentCat);
            printResult(winner);
        }
    }


    public static com.hillel.classwork.lesson13.Cat selectCatByName(List<com.hillel.classwork.lesson13.Cat> cats, Scanner sc) {
        System.out.println("Введіть ім'я для змагання:");
        String nameToFind = sc.nextLine();
        for (com.hillel.classwork.lesson13.Cat cat : cats) {
            if (cat.getName().equalsIgnoreCase(nameToFind)) {
                System.out.println("Кота з іменем " + nameToFind + " знайдено.");
                return cat;
            }
        }
        System.out.println("Кота з іменем " + nameToFind + " не знайдено.");
        return selectCatByName(cats, sc);
    }

    public static void printResult(Cat winner) {
        if (winner != null) {
            System.out.println("Двобій розпочався...");
            System.out.println("ПЕРРЕМОЖЕЦЬ: Кіт '''" + winner.getName() + "'''");
        } else {
            System.out.println("Двобій розпочався...");
            System.out.println("Абсолютна нічия за всіма параметрами.");
        }
    }
}
