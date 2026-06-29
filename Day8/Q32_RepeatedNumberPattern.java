/*
Question: Q32
Program: Repeated Number Pattern
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q32_RepeatedNumberPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}