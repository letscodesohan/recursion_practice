package com.sohan.recursion;


// print from 1 to N suing backtracking

import java.util.Scanner;

public class Print1toNBacktracking {

    public static int n ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        printTillNBacktracking(n);
    }

    public static void printTillNBacktracking(int i){
        if(i==0)
            return;
        printTillNBacktracking(i-1);
        //Backtracking as we are printing after the recursive call.
        System.out.println(i);
    }
}
