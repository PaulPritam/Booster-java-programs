//Program to repeat the die roll n times and tell which side got the most

package com.bridgelabz.boosterjavaprograms.day3;

import com.bridgelabz.boosterjavaprograms.day3.utility.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RollDie {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of times the dice rolls: ");
        int times = scan.nextInt();

        Utility.rollDie(times);
    }
}
