/*
Question: Q35
Program: Repeated Character Pattern
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q35_RepeatedCharacterPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            char ch = (char) ('A' + i - 1);

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}