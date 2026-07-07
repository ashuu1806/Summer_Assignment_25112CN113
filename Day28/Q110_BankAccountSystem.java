/*
Question: Q110
Program: Bank Account System
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q110_BankAccountSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();

        balance += deposit;

        System.out.println("Current Balance = " + balance);
    }
}