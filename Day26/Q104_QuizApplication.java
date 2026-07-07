/*
Question: Q104
Program: Quiz Application
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q104_QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. Java is a?");
        System.out.println("1. Programming Language");
        System.out.println("2. Database");
        System.out.println("3. Operating System");
        System.out.println("4. Browser");

        int ans = sc.nextInt();

        if (ans == 1)
            score++;

        System.out.println("Your Score = " + score + "/1");
    }
}