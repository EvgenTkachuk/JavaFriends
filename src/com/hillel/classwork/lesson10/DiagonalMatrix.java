package com.hillel.classwork.lesson10;

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        System.out.println("Введіть розмір сторони масиву: ");
        Scanner size = new Scanner(System.in);
        int s = size.nextInt();
        int[][] mat = new int[s][s];

        matrixDiagonal(mat);

    }

    private static void matrixDiagonal(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.println();
            for (int j = 0; j < mat.length; j++) {
                if(i == j) {
                    mat[i][j] = 1;
                }
                else mat[i][j] = 0;
                System.out.print(mat[i][j]);
            }
        }
    }
}
