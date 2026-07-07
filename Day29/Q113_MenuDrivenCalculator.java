/*
Question: Q113
Program: Menu-Driven Calculator
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q113_MenuDrivenCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter First Number: ");
        double a = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double b = sc.nextDouble();

        switch (choice) {

            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by Zero Not Possible");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}