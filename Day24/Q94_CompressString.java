/*
Question: Q94
Program: Compress a String
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q94_CompressString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String result = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result += str.charAt(i);
                result += count;
                count = 1;
            }
        }

        System.out.println(result);
    }
}