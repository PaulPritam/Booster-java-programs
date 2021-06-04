//Program to compute square root of a non negative number c in the given input Newtons method

package com.bridgelabz.boosterjavaprograms.day2;

import com.bridgelabz.boosterjavaprograms.day2.utility.Utility;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        double c = scan.nextInt();

        Utility.sqrt(c);

    }
}
