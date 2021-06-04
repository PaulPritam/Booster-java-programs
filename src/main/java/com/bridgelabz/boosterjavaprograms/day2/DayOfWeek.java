//Program to show Gregorian Calender

package com.bridgelabz.boosterjavaprograms.day2;

import com.bridgelabz.boosterjavaprograms.day2.utility.Utility;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println("Enter the month ");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        System.out.println("Enter the day ");
        int day = scan.nextInt();
        System.out.println("Enter year ");
        int year = scan.nextInt();

        Utility.dayOfWeek(month,day,year);
    }
}
