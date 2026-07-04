/*
Question: Q80
Program: Find Column-wise Sum
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q80_ColumnWiseSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < col; j++) {

            int sum = 0;

            for (int i = 0; i < row; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Sum of Column " + (j + 1) + " = " + sum);
        }
    }
}