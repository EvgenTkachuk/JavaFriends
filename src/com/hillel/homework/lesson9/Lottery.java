package com.hillel.homework.lesson9;
import com.hillel.classwork.lesson9.ArraySort;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Lottery {
    public static void main(String[] args) {
//   --     ІНІЦІАЛІЗАЦІЯ    --
        int size = 7;
        int[] first = new int[size];
        int [] second = new int[size];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

//   -- ЗАПОВНЕННЯ МАСИВІВ  --
        //--Заповнення масиву first[] випадковими числами
        for (int i = 0; i < size; i++) {
            first[i] = random.nextInt(10);// <- діапазон чисел від 0 до 9
        }
        //--Заповнення масиву second[] числами з консолі
        System.out.println("Введіть " + size +" чисел від 0 до 9 .");
        for (int i = 0; i < size; i++) {
            System.out.print("Введіть " + (i+1) + "-е число: ");
            int number;// змінна для збереження майбутнього числа
            while (true) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Помилка! Введено не число.\nБудь ласка, введіть цифру від 0 до 9: ");
                    scanner.next();
                    continue;
                }
                number = scanner.nextInt();//--Якщо це число, то зчитуємо його та продовжуємо валідацію
                if (number < 0 || number > 9) {
                    System.out.println("Помилка! Введене число знаходиться поза діапазоном.\nБудь ласка, введіть цифру від 0 до 9: ");
                }
                else  {
                    break;
                }
            }
            second[i] = number;
        }
        //--Порівняння масивів


//         -- СОРТУВАННЯ МАСИВІВ  --

        Arrays.sort(first);
        Arrays.sort(second);
        System.out.println("\nВідсортований масив лотереї: " + Arrays.toString(first));
        System.out.println("Відсортований масив гравця:  " + Arrays.toString(second));

//         -- ПОШУК ЗБІГІВ  --
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (first[i] == second[i]) {
                count++;
            }
        }
        System.out.println("Кількість співпадінь по індексам: " + count);

    }
}
