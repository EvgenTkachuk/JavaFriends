package com.hillel.homework.lesson10;

import java.util.Scanner;

public class Transposition {
    public static void main(String[] args) {
        int[][] matrix = input();
        System.out.println("\nПочаткова матриця.");
        printMatrix(matrix);
        if (matrix[0].length == matrix.length) {
            System.out.println("\nТранспонована квадратична матриця.");
            printMatrix(transQuadroMatrix(matrix));
        } else {
            System.out.println("\nТранспонована прямокутна матриця.");
            printMatrix(transMatrix(matrix));
        }


    }

    private static int[][] input() {
        System.out.println("Введіть кількість елементів висоти масиву: ");
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        System.out.println("Введіть кількість елементів довжини масиву: ");
        int l = scanner.nextInt();

        int[][] mat = new int[w][l];

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("Введіть значення по індексу [" + i + "][" + j + "]: ");
                mat[i][j] = scanner.nextInt();
            }
        }
        return mat;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transQuadroMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        return matrix;
    }

    public static int[][] transMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] altMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                altMatrix[j][i] = matrix[i][j];
            }
        }
        return altMatrix;
    }
}
