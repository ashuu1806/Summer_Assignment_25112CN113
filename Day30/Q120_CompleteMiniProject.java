/*
Question: Q120
Program: Complete Mini Project Using Arrays, Strings and Functions
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q120_CompleteMiniProject {

    static void display(String[] names, int[] marks) {

        System.out.println("\n----- Student Records -----");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " : " + marks[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String names[] = new String[n];
        int marks[] = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        display(names, marks);
    }
}