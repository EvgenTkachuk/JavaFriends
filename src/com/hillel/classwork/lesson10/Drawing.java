package com.hillel.classwork.lesson10;

public class Drawing {
    public static void main(String[] args) {
        char[][] array = new char[10][10];
        int size = 1;// #for grill
        System.out.println(" -- STARS --");
        stars(array);
        System.out.println(" -- GRILL --");
        grill(array, size);
    }

    private static void grill(char[][] array, int size) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = '#';
                System.out.print(array[i][j] + "  ");
            }
            size++;
            System.out.println();
        }
    }

    private static void stars(char[][] array) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = '*';
                System.out.print("  " + array[i][j]);
            }
            System.out.println("");
        }
    }
}
