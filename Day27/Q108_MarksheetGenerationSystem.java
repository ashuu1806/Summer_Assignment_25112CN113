/*
Question: Q108
Program: Marksheet Generation System
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q108_MarksheetGenerationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks of 5 Subjects: ");

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            total += sc.nextInt();
        }

        double percentage = total / 5.0;

        System.out.println("\n----- Marksheet -----");
        System.out.println("Name : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percentage + "%");

        if (percentage >= 40)
            System.out.println("Result : Pass");
        else
            System.out.println("Result : Fail");
    }
}