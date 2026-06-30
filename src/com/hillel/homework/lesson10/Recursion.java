package com.hillel.homework.lesson10;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число для обчислення факторіалу: ");
        int num = sc.nextInt();
        System.out.println("Результат: ");
        System.out.println(recursion(num));
    }

    public static int recursion(int num) {
        if (num <= 1) {
            return 1;
        }
        num *= recursion(num - 1);
        return num;
    }
}
