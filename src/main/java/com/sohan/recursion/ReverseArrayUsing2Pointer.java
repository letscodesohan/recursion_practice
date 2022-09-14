package com.sohan.recursion;

import java.util.Scanner;

//program to reverse array using 2 pointers
public class ReverseArrayUsing2Pointer {
    public static int n;
    public static  int temp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        n = sc.nextInt();
        System.out.println("Enter the elements of the Array");
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        reverseArray(n,array,0,n-1);
    }

    public static void reverseArray(int size, int[] array, int left, int right){
        if(left >= right) {
            System.out.println("Reversed array");
            for (int i = 0; i<size; i++)
                System.out.print(array[i] + " ");
            return;
        }
        temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        reverseArray(size,array,left+1, right-1);
    }
}
