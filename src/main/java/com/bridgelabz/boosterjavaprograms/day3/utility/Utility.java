package com.bridgelabz.boosterjavaprograms.day3.utility;

public class Utility {

    //Method for Prime number calculation
    public static void primeNumber(int low, int high)
    {
        while (low < high) {
            boolean flag = true;

            for (int i = 2; i <= low / 2; ++i) {
                if (low % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag == true)
                System.out.print(low + " ");

            low++;
        }
    }
}
