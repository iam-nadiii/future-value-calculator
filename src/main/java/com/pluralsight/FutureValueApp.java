package com.pluralsight;

import java.util.Scanner;

public class FutureValueApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Deposit: ");
        double deposit = input.nextDouble();

        System.out.println("Interest rate: ");
        double rate = input.nextDouble();

        System.out.println("Number of years: ");
        int years = input.nextInt();

        double totalInterestEarned = totalInterestEarned(deposit, futureValueCalculator(deposit, rate, years));

        double futureValue = futureValueCalculator(deposit, rate, years);

        System.out.printf("You will earn $%.2f interest in total.", totalInterestEarned);
        System.out.println();
        System.out.printf("Your future value will be $%.2f.", futureValue);

    }

    private static double  totalInterestEarned(double deposit, double v) {
        return  v - deposit;
    }

    private static double futureValueCalculator(double deposit, double rate, int years) {
        double totalInterest = deposit *(Math.pow( (1 +  (rate/365)), 365 * years));

        return totalInterest;
    }

}


