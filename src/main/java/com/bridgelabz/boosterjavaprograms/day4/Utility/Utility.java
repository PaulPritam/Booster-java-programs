//Contains all methods for other classes

package com.bridgelabz.boosterjavaprograms.day4.Utility;

import java.util.Arrays;

public class Utility {
    //Method to check if two Strings are anagram of each other or not
    public static void checkAnagram(String s1, String s2)
    {
        boolean match = true;
        if (s1.length() != s2.length()) {
            match = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            match = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (match) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    //Method to check if the given Strings are palindrome or not
    public static void checkPalindrome(String str)
    {
        String rev = "";

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");}
}
