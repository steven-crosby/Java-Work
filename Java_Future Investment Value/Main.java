/*
Program Prologue
Steven Crosby
CIT260-07
Week 6 Dot 1

1. Tells the user what the program does.
2. Prompts the user to an investment amount, for example, 1000.
3. Gets the user's input and saves it. The user's input must be a positive, non-zero value.
4. Prompts the user to enter an annual interest rate, for example, 9%.
5. Gets the user's input and saves it. The user's input must be positive and less than 100.
6. Using a method that you have written, calculate and display the future value of the investment
   for a period of 10 years. The formula for computing the future value of an investment is
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // CREATE SCANNER
        Scanner input = new Scanner(System.in);
        // NUMBER OF YEARS
        final int numberOfYears = 10;

        // PROMPT USER TO INPUT INVEST AMOUNT AND ANNUAL INTEREST RATE
        System.out.print("Given an investment dollar amount and a given interest rate, this program" +
                "will calculate the future value of the investment for a period of 10 years.");
        System.out.print("\nEnter the positive, non-zero value for the investment: ");
        double investAmount = input.nextDouble();
        System.out.print("Enter the annual interest rate between 0 to 100: ");
        double annualInterestRate = input.nextDouble();

        // CALCULATE MONTHLY INTEREST RATE
        double monthInterestRate = annualInterestRate / 1200;

        // DISPLAY TABLE WHICH SHOWS FUTURE INVESTMENT VALUE FROM 1 TO 30 YEARS
        System.out.print("Years     Future Value");
        for (int yearsIndex = 1; yearsIndex <= numberOfYears; yearsIndex++){
            System.out.format("%-10d", yearsIndex);
            System.out.format("$%11.2f\n",futureInvestmentValue(investAmount,monthInterestRate, yearsIndex));
        }
        System.out.print("Program is complete, goodbye.");
    }
    public static double futureInvestmentValue(double investAmount, double monthInterestRate, int numberOfYears){
        return investAmount*Math.pow(1+monthInterestRate, numberOfYears*12);
    }
}