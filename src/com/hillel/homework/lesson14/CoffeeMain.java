package com.hillel.homework.lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Drink> drinks = new ArrayList<>();
        System.out.println("Виберіть напій із запропонованого списку: ");
        System.out.println("-- 1. Чай --");
        System.out.println("-- 2. Americano --");
        System.out.println("-- 3. Cappuccino --");
        System.out.println("-- 4. Latte --");
        System.out.println("-- 0. Завершити замовлення --");
        double totalPrice = 0;
        boolean flag = true;
        int choice;
        while (flag) {
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    drinks.add(new Tea());
                    System.out.println("Чай додано до замовлення.");
                    break;
                case 2:
                    drinks.add(new Americano());
                    System.out.println("Американо додано до замовлення.");
                    break;
                case 3:
                    drinks.add(new Cappuccino());
                    System.out.println("Капучіно додано до замовлення.");
                    break;
                case 4:
                    drinks.add(new Latte());
                    System.out.println("Лате додано до замовлення.");
                    break;
                case 0:
                    System.out.println("Замовлення завершено.\nОчікуйте приготування...");
                    flag = false;
                    break;
            }
        }

        System.out.println("--- Ваше замовлення ---");
        for (Drink drink : drinks) {
            System.out.println(drink);
            totalPrice += drink.getPrice();
        }
        System.out.println("Загальна вартість: " + totalPrice + "грн");
        System.out.println("-----------------------");
        for (Drink drink : drinks) {
            System.out.println(drink.prepare());
        }
    }
}
