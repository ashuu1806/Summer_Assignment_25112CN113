/*
Question: Q100
Program: Sort Words by Length
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q100_SortWordsByLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String words[] = sentence.split(" ");

        for (int i = 0; i < words.length - 1; i++) {

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].length() > words[j].length()) {

                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("Words Sorted by Length:");

        for (String word : words) {
            System.out.println(word);
        }
    }
}