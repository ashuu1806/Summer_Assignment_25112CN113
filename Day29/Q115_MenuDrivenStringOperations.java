/*
Question: Q115
Program: Menu-Driven String Operations System
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q115_MenuDrivenStringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("\n1. Length");
        System.out.println("2. Uppercase");
        System.out.println("3. Lowercase");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Length = " + str.length());
                break;

            case 2:
                System.out.println(str.toUpperCase());
                break;

            case 3:
                System.out.println(str.toLowerCase());
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}