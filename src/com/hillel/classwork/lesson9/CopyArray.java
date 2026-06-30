package com.hillel.classwork.lesson9;

import java.util.Arrays;

public class CopyArray {
    private static Object intsrange;

    public static void main(String[] args) {

        int[]numbers = new int [10];

        fill(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] ints = Arrays.copyOf(numbers, 20);
        System.out.println(Arrays.toString(ints));

        int[] intsrange = Arrays.copyOfRange(numbers,3,13);
        System.out.println(Arrays.toString(intsrange));
    }

    public static void fill(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
    }
}
