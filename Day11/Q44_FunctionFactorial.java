/*
Question: Q44
Program: Function to Find Factorial
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q44_FunctionFactorial {

    static long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Factorial = " + factorial(n));
    }
}