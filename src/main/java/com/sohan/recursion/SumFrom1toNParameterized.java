package com.sohan.recursion;
import java.util.Scanner;

/*
 * print sum of 1 to N
 */

public class SumFrom1toNParameterized {
    private static int n;
    private static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        printSumTillN(n,sum);
    }

    public static void printSumTillN(int i, int sum){
        if(i<1){
            System.out.println("Sum from 1 till " + n + " is : " + sum);
            return;
        }
        printSumTillN(i-1,sum+i);
    }
}
