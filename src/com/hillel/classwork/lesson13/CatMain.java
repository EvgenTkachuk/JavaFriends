package com.hillel.classwork.lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Frank", 2, 2.5, true);
        Cat cat2 = new Cat("Nancy", 5, 4, false);
        Cat cat3 = new Cat("Bill", 3, 3.2, true);
        Cat cat4 = new Cat("John", 7, 4, false);
        Cat cat5 = new Cat("Johny", 7, 4, true);

        List<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat5);
        System.out.println("\n----------------------------Перелік бійців--------------------------------<\n");
        for (Cat cat : catList) {
            System.out.println(cat);
        }
        System.out.println("\n----------------------------Перелік бійців--------------------------------<\n");

        Scanner sc = new Scanner(System.in);
        Cat myCat = selectCatByName(catList, sc);
        Cat opponentCat = selectCatByName(catList, sc);
        if (myCat != null && opponentCat != null) {
            Cat winner = myCat.fight(opponentCat);
            printResult(winner);
        }
    }


    public static Cat selectCatByName(List<Cat> cats, Scanner sc) {
        System.out.println("Введіть ім'я для змагання:");
        String nameToFind = sc.nextLine();
        for (Cat cat : cats) {
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
