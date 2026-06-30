/*
Question: Q46
Program: Function for Armstrong
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q46_FunctionArmstrong {

    static boolean isArmstrong(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isArmstrong(n))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}