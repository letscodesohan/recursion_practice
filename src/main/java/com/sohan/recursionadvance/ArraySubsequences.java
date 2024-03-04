package com.sohan.recursionadvance;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * print the subsequences of the given array
 */
public class ArraySubsequences {
    public static int n;
    public static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the Array");
        for(int i = 0; i < n ; i++)
            array[i] = sc.nextInt();
        ArrayList path = new ArrayList();
        printSubsequences(array,0,path);
        System.out.println("Total subsequences for given String is: "+  count);
    }

    public static void printSubsequences(int[] array, int index, ArrayList path){
        // Print the subsequence when reach the leaf of recursion tree
        if(index == array.length){
            //Print the  subsequences
            if(path.size()>=0)
            System.out.println(path);
            count++;
        }
        else{
            // Subsequence without including the element at current index
            printSubsequences(array, index+1, path);
            path.add(array[index]);
            // Subsequence including the element at current index
            printSubsequences(array, index+1, path);
            // Backtrack to remove the recently inserted element
            path.remove(path.size()-1);
        }
    }
}
