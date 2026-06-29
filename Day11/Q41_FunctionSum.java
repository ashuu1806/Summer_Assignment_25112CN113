/*
Question: Q41
Program: Function to Find Sum of Two Numbers
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q41_FunctionSum {

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum = " + sum(a, b));
    }
}