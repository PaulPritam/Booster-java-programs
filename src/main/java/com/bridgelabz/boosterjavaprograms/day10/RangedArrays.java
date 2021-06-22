package com.bridgelabz.boosterjavaprograms.day10;

public class RangedArrays {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];

        for (int i = 2; i <= 30 ; i++) {
            int counter = 0;
            int j = 2;

            while (j < i)
            {
                if (i % j == 0 )
                {
                    counter++;
                    break;
                }
                j++;
            }
            if (counter == 0 )
                System.out.print(" " + i);
        }

    }
}
