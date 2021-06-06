//Program to check if two strings are anagrams or not

package com.bridgelabz.boosterjavaprograms.day4;

import com.bridgelabz.boosterjavaprograms.day4.Utility.Utility;

import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        System.out.println("Enter first String: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("Enter the second String: ");
        String str2 = scan.next();

        Utility.checkAnagram(str,str2);
    }
}
