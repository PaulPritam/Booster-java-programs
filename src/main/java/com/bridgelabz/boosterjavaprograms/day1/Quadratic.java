package com.bridgelabz.boosterjavaprograms.day1;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of 'a'");
        int a = scan.nextInt();
        System.out.println("enter the value of 'b' ");
        int b = scan.nextInt();
        System.out.println("Enter the value of constant c ");
        int c = scan.nextInt();

        Utility.findQuadratic(a,b,c);
    }
}
