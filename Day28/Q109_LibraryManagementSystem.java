/*
Question: Q109
Program: Library Management System
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q109_LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.println("\nBook Issued Successfully!");
        System.out.println("Book : " + book);
        System.out.println("Author : " + author);
    }
}