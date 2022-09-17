package com.sohan.recursionadvance;


import java.util.ArrayList;
import java.util.Scanner;

//print the subsequences of the given array whose sum is K

public class ArraySubsequencesWithSumK {
    public static int n;
    public static int givenSum;
    public static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array element(s)");
        for(int i=0; i<n; i++)
            array[i] = sc.nextInt();
        System.out.println("Enter the Required Sum: ");
        givenSum = sc.nextInt();
        ArrayList<Integer> path = new ArrayList<>();
        printSubsequences(array, 0 , path , sum);
    }

    public static void printSubsequences(int[] array, int index, ArrayList<Integer> path, int sum){
        if(index == array.length){
            if(path.size()>=0 && sum == givenSum)
                System.out.println(path);
        }
        else{
            printSubsequences(array,index+1,path,sum);
            path.add(array[index]);
            sum += array[index];
            printSubsequences(array,index+1,path,sum);
            path.remove(path.size()-1);
            sum -= array[index];
        }
    }
}
