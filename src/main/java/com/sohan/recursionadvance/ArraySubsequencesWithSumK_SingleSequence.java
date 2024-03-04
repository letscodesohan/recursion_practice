package com.sohan.recursionadvance;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * print any subsequence of the array whose sum is K
 */

public class ArraySubsequencesWithSumK_SingleSequence {
    public static int n;
    public static int sum =0;
    public static int givenSum;

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
        ArrayList<Integer> path = new ArrayList<>();
        if(printSubsequences(array,0,path,sum) == false)
            System.out.println("No Subsequences found with sum = "+ givenSum);
    }

    public static  boolean printSubsequences(int[] array, int index, ArrayList<Integer> path, int sum){
        if(index == array.length){
            if(path.size()>=0 && sum== givenSum) {
                System.out.println(path);
                //returning true means that the single subsequence is found, and we don't need to go further
                return true;
            }
            else
                return false;
        }
        else{
           if(printSubsequences(array, index+1, path, sum) == true)
               //returning true means that the single subsequence is found, and we don't need to go further
               return  true;
           path.add(array[index]);
           sum += array[index];
           if(printSubsequences(array, index+1, path, sum) == true)
               //returning true means that the single subsequence is found, and we don't need to go further
               return true;
           path.remove(path.size()-1);
           sum -= array[index];
           //returning false means that no subsequences has been found
           return false;
        }
    }
}
