/*
Question: Q118
Program: Mini Library System
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q118_MiniLibrarySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.println("\nBook Added Successfully!");
        System.out.println("Book : " + book);
        System.out.println("Author : " + author);
    }
}