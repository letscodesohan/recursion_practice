package com.sohan.recursionadvance;

import java.util.Scanner;

/*
 * print the count of the subsequences whose sum is K
 */
public class ArraySubsequenceCountWithSumK {
    public static int n;
    public static int sum =0;
    public static int givenSum;
    public static int count =0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Length: ");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the Array Elements: ");
        for(int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        System.out.println("Enter the Required Sum :");
        givenSum = sc.nextInt();
        count  =  countSubsequences(array, 0, sum);
        System.out.println("Total Number(s) of subsequences whose sum is "+givenSum+ " = " + count);
    }

    public static int countSubsequences(int[] array, int index, int sum){
        if(index == array.length){
            if(sum == givenSum)
                return 1;
            else
                return 0;
        }
        int left = countSubsequences(array,  index+1, sum);
        sum += array[index];
        int right = countSubsequences(array, index+1, sum);
        sum -= array[index];
        return left + right;
    }
}
