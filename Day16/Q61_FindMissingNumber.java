/*
Question: Q61
Program: Find Missing Number in Array
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q61_FindMissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int i = 0; i < n - 1; i++) {
            arraySum += arr[i];
        }

        System.out.println("Missing Number = " + (totalSum - arraySum));
    }
}