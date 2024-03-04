package com.sohan.recursion;

import java.util.Scanner;

/*
 * print from N to 1 suing backtracking
 */
public class PrintNto1Backtracking {

    private static  int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        printTill1Backtracking(1);
    }

    private static void printTill1Backtracking(int i) {
        if(i>n)
            return;
        printTill1Backtracking(i+1);
        //Backtracking as we are printing after the recursive call.
        System.out.println(i);
    }
}
