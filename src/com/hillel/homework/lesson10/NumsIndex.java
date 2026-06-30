package com.hillel.homework.lesson10;

public class NumsIndex {
    public static void main(String[] args) {
        int[][] matrix = Transposition.input();
        System.out.println("Введена матриця:");
        Transposition.printMatrix(matrix);
        System.out.println("Від'ємні значення:");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] < 0){
                    System.out.println("Індекс [" + i + "][" + j + "] = " + matrix[i][j]);
                }
            }
        }
    }
}
