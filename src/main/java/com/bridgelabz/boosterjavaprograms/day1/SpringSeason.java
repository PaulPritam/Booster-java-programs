package com.bridgelabz.boosterjavaprograms.day1;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        System.out.println("Enter month in numerical form ");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        System.out.println("Enter day in numerical form ");
        int day = scan.nextInt();
        Utility.checkSpringSeason(month,day);
    }
}
