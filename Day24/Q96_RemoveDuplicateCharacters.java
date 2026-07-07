/*
Question: Q96
Program: Remove Duplicate Characters
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q96_RemoveDuplicateCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}