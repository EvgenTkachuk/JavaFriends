package com.hillel.homework.lesson9;

import java.util.Arrays;
public class Null {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 3, 0, 5, 9, 0, 0};
        System.out.println("Початковий масив:\n" + Arrays.toString(array));
        int tmp;
        int zeroPosition = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                tmp = array[zeroPosition];
                array[zeroPosition] = array[i];
                array[i] = tmp;
                zeroPosition++;
            }
        }
        System.out.println("Відсортований масив:\n" + Arrays.toString(array));
    }
}
