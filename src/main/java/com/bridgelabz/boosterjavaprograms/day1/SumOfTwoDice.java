package com.bridgelabz.boosterjavaprograms.day1;

import java.util.Random;

public class SumOfTwoDice {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = random.nextInt(6)+1;
        System.out.println("dice one value " + dice1);
        int dice2 = random.nextInt(6)+1;
        System.out.println("dice two value " + dice2);
        System.out.println("the sum of the random numbers "+ Utility.SumofTwoDice(dice1,dice2));
    }
}
