//Program to print binary of a number

package com.bridgelabz.boosterjavaprograms.day5;

import com.bridgelabz.boosterjavaprograms.day5.Utility.MathFunction;

import java.io.IOException;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int number = scan.nextInt();

        MathFunction.binary(number);
    }
}
