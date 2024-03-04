package com.sohan.recursion;


import java.util.Scanner;

/*
 * print sum 1 to N
 */
public class SumFrom1toNFunctional {
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        System.out.println("Sum from 1 till " + n + " using functional approach x`is : " + printSumTillN(n));
    }

    public static int printSumTillN(int i){
      if(i == 1)
          return 1;
      return i + printSumTillN(i-1);
    }
}
