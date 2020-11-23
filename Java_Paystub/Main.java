/*
Program Prologue
Steven Crosby
CIT260-07
Week 4 Dot 2

This program will display the user given name, hours worked, and hourly wage, and calculate the gross pay, state withholding tax, federal withholding tax, net pay.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Tells the user what the program does. 
    System.out.println("Given your name, hours worked, and hourly wage...");
    System.out.println("");
    System.out.print("This program calculates your gross pay, state withholding tax, federal withholding tax, and your net pay.\n");

    // Prompts the user to enter their first and last name.
    System.out.print("\nPlease enter your name: ");

    // Gets the user's input and saves it as a String.
    String userName = input.nextLine();

    // Prompts the user to enter the number of hours they worked this week.
    System.out.print("Enter the number of hours in a week: ");

    // Gets the user's input and saves it.
    double hoursWorked = input.nextDouble();

    // Prompts the user to enter their hourly wage.
    System.out.print("Enter hourly pay rate: ");

    // Get's the user's input and saves it.
    double payRate = input.nextDouble();

    // Calculates your gross pay
    double grossPay = payRate * hoursWorked;

    // Calculates the state withholding tax (9%) and the federal withholding tax (20%)
    double stateTax = grossPay * .09;
    double fedTax = grossPay * .20;

    // Calculates the netPay
    double netPay = grossPay - (stateTax + fedTax); 
    
    /* Outputs a pay statement as shown in the example below.
    "Pay Stub for John Brown"
    Hours Worked: 
    Hourly Wage:
    Gross Pay:
    State Tax Withheld:
    Federal Tax Withheld:
    Net Pay:
    */
    
    System.out.println("====================================");
    System.out.println("Paystub For " + userName);
    
    System.out.format("Employee Name: " + userName +
    "\nHours Worked: " + hoursWorked +
    "\nPay Rate: $" + payRate +
    "\nGross Pay: $" + grossPay);
    System.out.println("");
    System.out.format("\nFederal Withholding (20.0%%): $" + String.format("%.2f",fedTax) +
    "\nState Withholding (9.0%%): $" + String.format("%.2f", stateTax) +
    "\nNet Pay: $" + String.format("%.2f", netPay));

    // Outputs a goodbye message.
    System.out.println("\n====================================");
    System.out.println("\nGoodbye.");


  }
}