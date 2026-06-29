/*
Question: Q42
Program: Function to Find Maximum
Author: Priyanshu Chaurasia
*/

import java.util.Scanner;

public class Q42_FunctionMaximum {

    static int maximum(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Maximum = " + maximum(a, b));
    }
}
