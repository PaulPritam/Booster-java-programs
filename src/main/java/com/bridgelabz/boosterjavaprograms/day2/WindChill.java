package com.bridgelabz.boosterjavaprograms.day2;

import com.bridgelabz.boosterjavaprograms.day2.utility.Utility;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        System.out.println("Enter the temperature");
        Scanner scan = new Scanner(System.in);
        double t = scan.nextInt();
        System.out.println("Enter the wind speed ");
        double v = scan.nextInt();

        System.out.println("The temperature is " +Utility.windChill(t,v) + "F");
    }
}
