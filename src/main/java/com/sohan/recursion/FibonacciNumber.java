package com.sohan.recursion;


import java.util.Scanner;

/*
 * program to print the Nth fibonacci number
 */
public class FibonacciNumber {
    private static  int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        System.out.println("Fibonacci number is "+ fibonacciNumber(n));
    }

    public static int fibonacciNumber(int n){
        if(n<=1)
            return n;
        int last = fibonacciNumber(n-1);
        int secondLast = fibonacciNumber(n-2);
        return last + secondLast;
    }
}
