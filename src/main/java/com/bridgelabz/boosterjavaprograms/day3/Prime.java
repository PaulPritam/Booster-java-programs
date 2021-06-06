// Program to print prime numbers of the given range

package com.bridgelabz.boosterjavaprograms.day3;

import com.bridgelabz.boosterjavaprograms.day3.utility.Utility;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        System.out.println("Enter lower limit ");
        Scanner scan = new Scanner(System.in);
        int low = scan.nextInt();
        System.out.println("Enter the upper limit ");
        int high = scan.nextInt();

        Utility.primeNumber(low,high);
    }
}

