/*
Question: Q102
Program: Voting Eligibility System
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q102_VotingEligibilitySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("Eligible to Vote");
        else
            System.out.println("Not Eligible to Vote");
    }
}