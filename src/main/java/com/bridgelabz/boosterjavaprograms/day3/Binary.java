//Program to convert decimal to binary of the given number

package com.bridgelabz.boosterjavaprograms.day3;

import com.bridgelabz.boosterjavaprograms.day3.utility.Utility;
import jdk.jshell.execution.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int number = scan.nextInt();

        Utility.binary(number);
    }
}
