package com.bridgelabz.boosterjavaprograms.day1;

import java.util.Random;
import java.util.Scanner;

public class Utility {
    Scanner scan = new Scanner(System.in);

    public static int add(int fno, int sno) {
        return fno + sno;
    }

    public static int reverse(int number) {
        int remainder = 0, reverse = 0;
        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }

    public static String stringReverse(Scanner scan) {
        String[] names = new String[3];
        String[] result = new String[names.length];
        System.out.println("Enter three names ");

        for (int i = 0; i < names.length; i++) {
            names[i] = scan.next();
        }
        for (int i = 0; i < names.length; i++) {
            result[i] = names[names.length - i - 1];
            System.out.println("hello " +result[i]);
        }
        return " ";
    }

    public void checkLeapYear()
    {
        System.out.println("Enter a year to check if it is a leap year or not ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println(year+" Is a leap Year");
        else
            System.out.println(year + " Is Not a Leap Year");
    }

    public static void calculation()
    {
        System.out.println("Enter three numbers for calculation ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = scan.nextInt();
        System.out.println("Enter second number ");
        int b = scan.nextInt();
        System.out.println("Enter third number ");
        int c = scan.nextInt();

        int sum = a + b + c;
        int multiply = a * b * c ;
        int divide = c + a / b;
        int mod = a % b + c;

        System.out.println("the sum of the given numbers: " +sum);
        System.out.println("the product of the given numbers: " +multiply);
        System.out.println("the division calculation of the given numbers: " +divide);
        System.out.println("the mod calculation of the given numbers: " +mod);
    }

    public static void doubleCalculation()
    {
        System.out.println("Enter three numbers for calculation ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number ");
        double a = scan.nextInt();
        System.out.println("Enter second number ");
        double b = scan.nextInt();
        System.out.println("Enter third number ");
        double c = scan.nextInt();

        double sum = a + b + c;
        double multiply = a * b * c ;
        double divide = c + a / b;
        double mod = a % b + c;

        System.out.println("the sum of the given numbers: " +sum);
        System.out.println("the product of the given numbers: " +multiply);
        System.out.println("the division calculation of the given numbers: " +divide);
        System.out.println("the mod calculation of the given numbers: " +mod);
    }

    public static void checkSpringSeason(int month, int day)
    {
        if((month == 3 && day >= 20) || (month == 4 && day >= 1) ||
                (month == 5 && day >= 1) ||
                (month <= 6 && day < 20))
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }

    public static void findQuadratic (int a , int b, int c)
    {
        int delta = (b * b - 4 * a * c);
        double root1 = (-b + Math.sqrt(delta) / (2 * a ));
        double root2 = (-b - Math.sqrt(delta) / (2 * a ));
        System.out.println("the first root value " +root1);
        System.out.println("the second root value " +root2);
    }

    public static double distance(int x, int y)
    {
        double distance = Math.sqrt(x * x + y * y);
        return distance;
    }

    public static int SumofTwoDice (int dice1, int dice2)
    {
        int sum = dice1 + dice2;
        return sum;
    }
}
