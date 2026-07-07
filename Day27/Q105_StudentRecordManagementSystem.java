/*
Question: Q105
Program: Student Record Management System
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q105_StudentRecordManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        System.out.println("\n----- Student Record -----");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }
}