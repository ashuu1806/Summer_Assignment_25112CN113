/*
Question: Q87
Program: Character Frequency
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q87_CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch)
                count++;
        }

        System.out.println("Frequency = " + count);
    }
}