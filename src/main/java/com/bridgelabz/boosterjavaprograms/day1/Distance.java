package com.bridgelabz.boosterjavaprograms.day1;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.println("Enter first number ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Enter the second number ");
        int y = scan.nextInt();

        System.out.println("The calculated value is " + Utility.distance(x,y));
    }
}
