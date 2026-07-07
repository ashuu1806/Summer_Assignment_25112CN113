/*
Question: Q98
Program: Find Common Characters in Strings
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q98_CommonCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.print("Common Characters: ");

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            if (str2.indexOf(ch) != -1 && str1.indexOf(ch) == i) {
                System.out.print(ch + " ");
            }
        }
    }
}