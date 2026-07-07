/*
Question: Q114
Program: Menu-Driven Array Operations System
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q114_MenuDrivenArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\n1. Display");
        System.out.println("2. Sum");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Array: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;

            case 2:
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += arr[i];
                }
                System.out.println("Sum = " + sum);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}