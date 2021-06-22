package com.bridgelabz.boosterjavaprograms.day10;

import java.util.Arrays;

public class ArrayFunctions {

    public static void main(String[] args) {

        int[][] arr = {{0,1,3,4},
                       {5,6,7,8}};
        int row = 2;
        int col = 2;
        int[][] arr1 = new int[row][col];

//        for (int[] x : arr)
//        {
//            for (int y : x)
//            {
//                System.out.print(y + " ");
//            }
//            System.out.println();
//        }

        System.out.println("------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

