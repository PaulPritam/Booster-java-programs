package com.bridgelabz.boosterjavaprograms.day2;

import com.bridgelabz.boosterjavaprograms.day2.utility.Utility;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println("Enter the power value ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (input == 0)
        {
            System.out.println("The answer is " + 1);
        }
        else {
            System.out.println("Answer " + Utility.PowerOf2(input));

        }
    }

}
