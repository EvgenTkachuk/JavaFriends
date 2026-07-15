package com.hillel.homework.lesson15;

import java.util.Scanner;

public class ConverterMain {
    public static void main(String[] args) {
        double celsius;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Введіть градуси по Цельсію: ");
            try {
                celsius = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введено не число.Спробуйте ще раз!");
            }
        }
        System.out.println("Якщо бажаєте конвертувати у градуси по Кельвіну натисніть 1, якщо у градуси по Фаренгейту натисніть 2");
        while (true) {
            try {
                int choice = Integer.parseInt(input.nextLine());
                Converter converter = createConverter(choice);

                if (converter != null) {
                    System.out.println("Ваш результат:" + converter.convert(celsius));
                    break;
                } else {
                    System.out.println("Введіть коректне значення.\nЯкщо бажаєте конвертувати у градуси по Кельвіну натисніть 1, якщо у градуси по Фаренгейту натисніть 2");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введено не число.Спробуйте ще раз!");
            }
        }

    }

    static Converter createConverter(int choice) {
        switch (choice) {
            case 1:
                return new KelvinConverter();
            case 2:
                return new FahrenheitConverter();
            default:
                return null;
        }
    }
}
