package com.hillel.classwork.lesson10;

public class MultiArray {
    public static void main(String[] args) {

        boolean arr[][][] = new boolean[3][3][3];
        int level;
        System.out.println("\nThree Dimensional Array:");
        threeDimensionalArray(arr);
        System.out.println("\nTwo Dimensional Array:\n");
        twoDimensionalArray();
    }

    private static void threeDimensionalArray(boolean[][][] arr) {
        int level;
        for (int i = 0; i < arr.length; i++) {
            level = i + 1;
            System.out.println("\nLevel " + level);
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println(" ");
            }
        }
    }

    private static void twoDimensionalArray() {
        int arr[][] = new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("i=" + (i) + "+" + "j=" + (j) + "  ");
            }
            System.out.println("\n");
        }
    }
}
