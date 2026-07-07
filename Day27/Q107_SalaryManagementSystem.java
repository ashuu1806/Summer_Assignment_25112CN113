/*
Question: Q107
Program: Salary Management System
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q107_SalaryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double totalSalary = basic + hra + da;

        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Total Salary = " + totalSalary);
    }
}