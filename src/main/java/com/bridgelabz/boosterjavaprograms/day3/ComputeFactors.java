package com.bridgelabz.boosterjavaprograms.day3;

import com.bridgelabz.boosterjavaprograms.day3.utility.Utility;

import java.util.Scanner;

public class ComputeFactors {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println("The factors are: ");
        Utility.primeFactors(number);
    }
}
