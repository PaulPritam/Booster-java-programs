package com.bridgelabz.boosterjavaprograms.day9;

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {

        int[] arr = {1, 6, 5, 2, 8, 9};
        int[] arr2 = new int[arr.length - 1];

        int index = 3;            int j = 0;


        for (int i = 0; i < arr.length; i++) {
            if (index == i)
            {
                continue;
            }
            arr2[j++] = arr[i];
        }

        Arrays.sort(arr2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
