package com.sohan.recursion;

import java.util.Scanner;

/*
 * program to reverse an array using 1 pointer
 */
public class ReverseArray {
    public static int n;
    public static int temp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        System.out.println("Enter the elements of the Array");
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        reverseArray(n,array,0);
    }

    public static void reverseArray(int size, int[] array, int i){
        if(i >= size/2){
            System.out.println("Reversed array using single pointer");
            for (int j = 0; j<size; j++)
                System.out.print(array[j] + " ");
            return;
        }
        temp = array[i];
        array[i] = array[size - i - 1];
        array[size - i - 1] = temp;
        reverseArray(size,array,i+1);
    }
}
