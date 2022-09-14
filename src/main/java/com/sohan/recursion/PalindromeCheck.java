package com.sohan.recursion;


import java.util.Scanner;

//program to check if the given string is palindrome or not
public class PalindromeCheck {
    private static String input;
    private static boolean result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        input = sc.nextLine();
        char[] inputArray = input.toCharArray();
        result = palindromeCheck(0,inputArray);
        if(result == true)
            System.out.println("Entered String " + input + " is a palindrome");
        else
            System.out.println("Entered String " + input + " is not a palindrome");
    }

    public static boolean palindromeCheck(int i ,char[] inputArray){

        if(i >= inputArray.length /2 )
            return true;
        if(inputArray[i] != inputArray[inputArray.length - i -1])
            return false;
        return palindromeCheck(i+1, inputArray);
    }
}
