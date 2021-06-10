//Program to calculate harmonic number

package com.bridgelabz.boosterjavaprograms.day5;

import com.bridgelabz.boosterjavaprograms.day5.Utility.MathFunction;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter the n th term : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number <= 0) {
            System.out.println("Provide a number greater then zero");
        } else {
            System.out.println("The result of the harmonic progression is " + MathFunction.harmonicNumber(number));
        }
    }
}
