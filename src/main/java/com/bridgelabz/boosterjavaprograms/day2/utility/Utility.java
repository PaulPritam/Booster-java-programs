package com.bridgelabz.boosterjavaprograms.day2.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {

    public static void stat5() {
        double random1 = Math.random();
        double random2 = Math.random();
        double random3 = Math.random();
        double random4 = Math.random();
        double random5 = Math.random();
        System.out.println("Random number 1 : " + random1);
        System.out.println("Random number 2 : " + random2);
        System.out.println("Random number 3 : " + random3);
        System.out.println("Random number 4 : " + random4);
        System.out.println("Random number 4 : " + random5);

        System.out.println("The smallest number from the above random numbers ");
        System.out.println(Math.min(random5, Math.min(random4, Math.min(random3, (Math.min(random1, random2))))));

        System.out.println("The largest number from the above random numbers");
        System.out.println(Math.max(random5, Math.max(random4, Math.max(random3, (Math.max(random1, random2))))));
    }

    public static double windChill(double t, double v) {
        double w = 0;
        if ((t < 50) || v < 120)
        {
            w = (35.74 + 0.6215 * t + (0.4275 * t - 35.75)) * Math.pow(v, 0.16);
        }
        return w;
    }

    public static double temperatureConversionToF(double c)
    {
        double result = 0;
        result = (c * 9/5) + 32;

        return result;
    }

    public static double temperatureConversionToC(double f)
    {
        double result = 0;
        result = (f - 32) * 5/9;

        return result;
    }

    public static void trig(double number)
    {
        System.out.println("The Radian is " + Math.toRadians(number));
        System.out.println("The sin angle is " + Math.sin(number));
        System.out.println("The cos angle is " + Math.cos(number));
        System.out.println("The tan angle is" + Math.tan(number));
    }

    public static void FlipCoin()
    {
        Random r = new Random();
        int random = r.nextInt(2);
        if(random == 1)
        {
            System.out.println("Heads");
        }
        else
            System.out.println("Tails");
    }

    public static int PowerOf2(int input)
    {
        int result = 1;
        for (int i = 1; i <= input; i++) {
            result *= 2;
        }
        return (result);
    }

    public static double harmonicNumber(int number)
    {
        double result = 0;
        for (int i = 1; i <= number ; i++) {
            result += (float)1/i;
        }
        return result;
    }
}
