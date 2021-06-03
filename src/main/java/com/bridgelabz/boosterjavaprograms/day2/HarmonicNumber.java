package com.bridgelabz.boosterjavaprograms.day2;

import com.bridgelabz.boosterjavaprograms.day2.utility.Utility;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter the n th term : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number <= 0 )
        {
            System.out.println("Provide a number greater then zero");
        }
        else
        {
            System.out.println("The result of the harmonic progression is " + Utility.harmonicNumber(number));
        }
    }
}