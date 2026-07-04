/*
Question: Q72
Program: Sort Array in Descending Order
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q72_SortArrayDescending {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] < arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array (Descending): ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}