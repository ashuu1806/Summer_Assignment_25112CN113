/*
Question: Q112
Program: Contact Management System
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q112_ContactManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.println("\nContact Saved Successfully!");
        System.out.println("Name : " + name);
        System.out.println("Mobile : " + mobile);
    }
}