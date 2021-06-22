package com.bridgelabz.boosterjavaprograms.day7;

public class Try2 {

    public static void main(String[] args) {

        int i, j;
        int[] arr = {3, 4, 5, 6, 7, 8, 9, 13};


        for (i = 0; i < arr.length; i++) {

            j = 2;
            int counter = 0;

            while (j < arr[i]) {
                if (arr[i] % j == 0) {
                    counter++;
                }
                j++;
            }
            if (counter == 0) {
                System.out.print(" " + arr[i]);
            }
        }

    }
}

