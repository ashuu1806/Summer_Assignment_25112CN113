/*
Question: Q49
Program: Input and Display Array
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q49_InputDisplayArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}