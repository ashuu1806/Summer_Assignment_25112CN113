/*
Question: Q77
Program: Multiply Matrices
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q77_MultiplyMatrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

        if (col1 != row2) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int a[][] = new int[row1][col1];
        int b[][] = new int[row2][col2];
        int result[][] = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Result Matrix:");

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {

                for (int k = 0; k < col1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }

                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}