package com.bridgelabz.boosterjavaprograms.day9;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 9, 1};
        int temp = 0;

        System.out.println("The normal array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("The second largest number in the " +
                "array is: " + arr[1] + " " + arr[arr.length - 2]);

    }
}
