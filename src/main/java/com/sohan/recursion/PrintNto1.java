package com.sohan.recursion;

import java.util.Scanner;

//print from N to 1 linearly
public class PrintNto1 {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        printTill1(n);
    }

    private static void printTill1(int n) {
        if(n<1)
            return;
        System.out.println(n);
        n--;
        printTill1(n);
    }
}
