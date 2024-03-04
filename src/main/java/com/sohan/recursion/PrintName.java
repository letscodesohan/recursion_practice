package com.sohan.recursion;

import java.util.Scanner;


/*
 *program to print name N times
 */


public class PrintName {

    private static int n ;

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        printNTimes();
    }

    public static void printNTimes(){
        if(n<=0)
            return;
        System.out.println("Sohan");
        n--;
        printNTimes();
    }

}
