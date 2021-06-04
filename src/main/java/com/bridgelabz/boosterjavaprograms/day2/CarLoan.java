//Program for Car loan simulator which calculates car loan for a given time period

package com.bridgelabz.boosterjavaprograms.day2;

import com.bridgelabz.boosterjavaprograms.day2.utility.Utility;

import java.util.Scanner;

public class CarLoan {
    public static void main(String[] args) {
        System.out.println("Enter the value of Principal loan: ");
        Scanner scan = new Scanner(System.in);
        int pLoan = scan.nextInt();
        System.out.println("Enter the number of years: ");
        int year = scan.nextInt();
        System.out.println("Enter the rate of interest: ");
        int rate = scan.nextInt();

        Utility.carLoan(pLoan,year,rate);
    }
}
