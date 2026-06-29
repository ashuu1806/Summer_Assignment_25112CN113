/*
Question: Q23
Program: Count Set Bits
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q23_CountSetBits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1)
                count++;

            n = n >> 1;
        }

        System.out.println(count);
    }
}