package com.sohan.recursionadvance;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySubsequences {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the Array");
        for(int i = 0; i < n ; i++)
            array[i] = sc.nextInt();
        ArrayList<Integer> path = new ArrayList<Integer>();
        printSubsequences(array,0,path);
    }

    public static void printSubsequences(int[] array, int index, ArrayList<Integer> path){
        // Print the subsequence when reach the leaf of recursion tree
        if(index == array.length){
            //Print the empty subsequence
            if(path.size() == 0)
                System.out.println("{ }");
            //Print the non-empty subsequence
            if(path.size()>0)
            System.out.println(path);
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
