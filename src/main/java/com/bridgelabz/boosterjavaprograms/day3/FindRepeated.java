//Program to check duplicate number in an array

package com.bridgelabz.boosterjavaprograms.day3;

import com.bridgelabz.boosterjavaprograms.day3.utility.Utility;

import java.util.Scanner;

public class FindRepeated {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        Utility.checkDuplicate(arr,size);
    }
}
