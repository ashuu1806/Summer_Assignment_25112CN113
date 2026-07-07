/*
Question: Q90
Program: Find First Repeating Character
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q90_FirstRepeatingCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("First Repeating Character = " + str.charAt(i));
                    found = true;
                    break;
                }
            }

            if (found)
                break;
        }

        if (!found)
            System.out.println("No Repeating Character");
    }
}