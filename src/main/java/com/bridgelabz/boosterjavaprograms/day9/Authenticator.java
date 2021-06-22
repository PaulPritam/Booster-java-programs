package com.bridgelabz.boosterjavaprograms.day9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authenticator {
    public static void main(String[] args) {
        System.out.println("Enter first name: ");
        Scanner scan = new Scanner(System.in);
        String fname = scan.next();
//        System.out.println("Enter ");
//        String lname = scan.next();
//        System.out.println("Enter phone number: ");
//        int phno = scan.nextInt();

        String fnameRegex = "[A-Z]{1}[a-z]{2,}";
        Pattern p = Pattern.compile(fnameRegex);
        Matcher m = p.matcher(fname);
        boolean result = m.matches();

        if (result)
        {
            System.out.println("valid");
        }
        else
            System.out.println("Invalid");
    }
}
