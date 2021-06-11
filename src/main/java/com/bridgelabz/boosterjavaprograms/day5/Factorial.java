//Program to print factorial of a number

package com.bridgelabz.boosterjavaprograms.day5;

import com.bridgelabz.boosterjavaprograms.day5.Utility.MathFunction;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int factorial = MathFunction.factorial(number);
        System.out.println("The factorial of the number is: " + factorial);
    }
}
