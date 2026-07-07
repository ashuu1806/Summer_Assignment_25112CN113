/*
Question: Q101
Program: Number Guessing Game
Author: Priyanshu Chaurasia
*/

import java.util.Random;
import java.util.Scanner;

public class Q101_NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number)
                System.out.println("Too High!");
            else if (guess < number)
                System.out.println("Too Low!");
            else
                System.out.println("Correct! You guessed the number.");

        } while (guess != number);
    }
}