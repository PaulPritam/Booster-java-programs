//Contains Methods for other classes

package com.bridgelabz.boosterjavaprograms.day10.Utility;

import java.util.Scanner;

public class Utility {

    public static Scanner scan = new Scanner(System.in);

    public static void twoDimensionalArrays(int row, int col)
    {
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the values of index: "+ i + " " +j);
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("The array output: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
