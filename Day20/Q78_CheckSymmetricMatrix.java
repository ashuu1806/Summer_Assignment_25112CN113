/*
Question: Q78
Program: Check Symmetric Matrix
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q78_CheckSymmetricMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean symmetric = true;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not Symmetric Matrix");
    }
}