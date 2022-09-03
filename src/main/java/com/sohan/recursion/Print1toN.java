package com.sohan.recursion;


// program to print 1 to N Linearly without backtracking

import java.util.Scanner;

public class Print1toN {

    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        printTillN(1);
    }

    public static void printTillN(int i){
        if(i>n)
            return;
        System.out.println(i);
        i++;
        printTillN(i);
    }
}
