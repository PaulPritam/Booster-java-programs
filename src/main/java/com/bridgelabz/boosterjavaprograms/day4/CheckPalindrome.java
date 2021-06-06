//Program to check if the given Strings are palindrome or not

package com.bridgelabz.boosterjavaprograms.day4;

import com.bridgelabz.boosterjavaprograms.day4.Utility.Utility;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        Utility.checkPalindrome(str);

    }
}
