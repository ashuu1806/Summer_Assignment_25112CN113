/*
Question: Q86
Program: Count Words in a Sentence
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q86_CountWordsInSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("Words = 0");
            return;
        }

        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                count++;
        }

        System.out.println("Words = " + count);
    }
}