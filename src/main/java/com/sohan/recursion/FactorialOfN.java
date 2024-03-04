package com.sohan.recursion;

import java.util.Scanner;

/*
 * print factorial of N using functional way
 */
public class FactorialOfN {

    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        System.out.println("Factorial of " + n + " is : " + factorialOfN(n));
    }

    private static int factorialOfN(int n) {
        if(n == 1)
            return 1;
        return n * factorialOfN(n-1);
    }
}
