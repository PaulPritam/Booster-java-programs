package com.bridgelabz.boosterjavaprograms.day4;

import com.bridgelabz.boosterjavaprograms.day4.Utility.Utility;

import java.util.Calendar;
import java.util.Scanner;

public class JavaPrintCalendarOfMonth {



        public static void main(String args[]) {
            Utility ob = new Utility();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the year : ");
            int y = sc.nextInt();
            System.out.print("Enter the month name in words : ");
            String monthName = sc.next();
            System.out.print("Enter the week day name of 1st day of " + monthName + " in words: ");
            String weekName = sc.next();

            int max = Utility.findMaxDay(monthName, y);
            int f = Utility.findDayNo(weekName);
            ob.fillCalendar(max, f, monthName, y);
        }
}

