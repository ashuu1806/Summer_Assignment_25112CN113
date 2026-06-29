/*
Question: Q30
Program: Number Triangle
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q30_NumberTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}