package com.bridgelabz.boosterjavaprograms.day2;

import com.bridgelabz.boosterjavaprograms.day2.utility.Utility;

import java.util.Random;
import java.util.Scanner;

public class GamblingSimulator {
    public static void main(String[] args) {
        System.out.println("Enter the number of stake");
        Scanner scan = new Scanner(System.in);
        int stake = scan.nextInt();
        System.out.println("Enter your goal ");
        int goal = scan.nextInt();
        System.out.println("Enter the trail or the limit ");
        int trail = scan.nextInt();

        Utility.gamblingSimulator(stake,goal,trail);
    }
}
