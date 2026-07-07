/*
Question: Q111
Program: Ticket Booking System
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q111_TicketBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        int fare = tickets * 500;

        System.out.println("\nBooking Successful!");
        System.out.println("Passenger : " + name);
        System.out.println("Tickets : " + tickets);
        System.out.println("Total Fare : " + fare);
    }
}