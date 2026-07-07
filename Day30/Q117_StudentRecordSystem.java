/*
Question: Q117
Program: Student Record System Using Arrays and Strings
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q117_StudentRecordSystem {

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

        System.out.println("\n----- Student Records -----");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " : " + marks[i]);
        }
    }
}