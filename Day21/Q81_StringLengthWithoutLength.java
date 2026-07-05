/*
Question: Q81
Program: Find String Length Without length()
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q81_StringLengthWithoutLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        for (char ch : str.toCharArray()) {
            count++;
        }

        System.out.println("Length = " + count);
    }
}