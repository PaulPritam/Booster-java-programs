//Program that takes input and prints 2D array

package com.bridgelabz.boosterjavaprograms.day10;

import com.bridgelabz.boosterjavaprograms.day10.Utility.Utility;

import java.util.Arrays;
import java.util.Scanner;

public class MainArrayFunctions {

    public static void main(String[] args) {

        System.out.println("Enter the number of rows: ");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = scan.nextInt();

        Utility.twoDimensionalArrays(row,col);
    }
}
