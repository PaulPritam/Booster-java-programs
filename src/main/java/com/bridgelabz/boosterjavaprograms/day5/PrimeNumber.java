package com.bridgelabz.boosterjavaprograms.day5;

import com.bridgelabz.boosterjavaprograms.day5.Utility.MathFunction;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if its prime or not: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        MathFunction.isPrime(number);
    }
}
