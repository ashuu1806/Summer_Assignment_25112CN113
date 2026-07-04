/*
Question: Q76
Program: Find Diagonal Sum
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q76_DiagonalSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Diagonal Sum = " + sum);
    }
}