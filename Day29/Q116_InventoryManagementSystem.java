/*
Question: Q116
Program: Inventory Management System
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q116_InventoryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String product = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        double total = quantity * price;

        System.out.println("\n----- Inventory Details -----");
        System.out.println("Product : " + product);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("Total Value : " + total);
    }
}