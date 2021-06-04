//Program to repeat the die roll n times and tell which side got the most

package com.bridgelabz.boosterjavaprograms.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RollDie {
    public static void main(String[] args) {
        System.out.println("Enter the number of time you want to roll the die ");
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();

        Random random = new Random();
        int count1=0,count2=0,count3 = 0 , count4=0,count5=0,count6 = 0;
        for (int i = 0; i <range ; i++) {
            int dice = random.nextInt(6)+1;
            if (dice == 1)
            {
                count1++;
            }
           else if (dice == 2)
            {
                count2++;
            }
            else if (dice == 3)
            {
                count3++;
            }
            else if (dice == 4)
            {
                count4++;
            }
            else if (dice == 5)
            {
                count5++;
            }
            else if (dice == 6)
            {
                count6++;
            }
        }



    }
}
