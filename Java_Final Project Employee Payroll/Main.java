/*
Program Prologue
Steven Crosby, Jared Hatch
CIT260-07
Week 12 Final Project

*/


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {

        Scanner userInput = new Scanner(System.in);

        // Program Introduction
        System.out.println(
                "This program will prompt the user to input their first name, last name, define their own ID,and then recall the saved input, and display their corresponding paystub.");

        // Prompts to enter their first name and stores the value in the firstName
        // variable.
        System.out.print("Please Enter First Name: ");
        String firstName = userInput.next();

        // Prompts to enter their last name and stores the value in the lastName
        // variable.
        System.out.print("Please Enter Last Name: ");
        String lastName = userInput.next();

        // Prompt to enter their ID number and stores the value in the idNumber
        // variable.
        System.out.print("Please Enter ID Number: ");
        int idNumber = userInput.nextInt();


        // Switch statement to determine the type of employee, prompts the user to enter
        // 1, 2, or 3, depending on the type of employee and stores the value in choice.
        System.out.println("\n Please enter employee wage type. ");
        System.out.println("1: Hourly");
        System.out.println("2: Salary");
        System.out.println("3: Commission");
        System.out.print("Choice: ");

        // DO-TRY //
        int wageType = userInput.nextInt();
        // Employee Object that calls its variables firstName, lastName, idNumber, and
        // wageType
        var theEmployee = new Employee(firstName, lastName, wageType, idNumber);

        //Prompts the user to enter their date of birth and stores the value in the dob variable.
        int wage;
        boolean continueInput = true;
        // if the user enters the wrong format, try again
        do {
            System.out.print("Please Enter 1, 2, or 3: ");
            wage = userInput.nextInt();

            Integer wageInput = wage(1,2,3);
            try {
                // parse string
                Integer.parseInt(String.valueOf(wage));
                // exit if matches pattern
                continueInput = false;
            } // throws an exception
            catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again.");
            }
        } while (continueInput);

        switch (wageType) {
            case 1: // Since Hourly has 3 different attributes, I enter them here..
                // Prompts the user to enter the numbers of hours they worked and stores the
                // value in variable hoursWorked.
                System.out.print("Please Enter Number of Hours Worked: ");
                double hoursWorked = userInput.nextDouble();

                // Prompts the user to enter their wage and stores the value in the variable
                // hourlyWage.
                System.out.print("Please Enter Your Wage: ");
                double hourlyWage = userInput.nextDouble();

                // Polymorphism (Array of base class Employee, and HourlyEmployee reference.)
                // Points to an instance in the two derived classes.
                Employee[] hourly = {new Employee(firstName, lastName, idNumber, wageType),
                        new Employee(hoursWorked, hourlyWage)};

                // for loop to invoke the employeeCheck method within the Employee Class, and
                // HourlyEmployee Class.
                for (Employee employee : hourly) {
                    employee.employeePaycheck();
                }
                break;

            case 2:
                // Prompts the user to enter their salary and stores the value in variable
                // salaryAmount.
                System.out.print("Please Enter Your Salary: ");
                double salaryAmount = userInput.nextDouble();

                // Polymorphism (Array of base class Employee, and SalaryEmployee reference.)
                // Points to an instance in the two derived classes.
                Employee[] salary = {new Employee(firstName, lastName, wageType, idNumber), new Employee(salaryAmount)};

                // for loop to invoke the employeeCheck method within the Employee Class, and
                // SalaryEmployee Class.
                for (Employee value : salary) {
                    value.employeePaycheck();
                }
                break;

            case 3:

                // Get input for commission
                System.out.print("Please enter your total sales revenue, numbers only: ");
                double sales = userInput.nextDouble();
                System.out.print("Please enter your commission rate in decimal format: ");
                double percent = userInput.nextDouble();

                // Polymorphism (Array of base class Employee, and SalaryEmployee reference.)
                Employee[] commission = {new Employee(firstName, lastName, wageType, idNumber),
                        new Employee(sales, percent)};

                for (Employee employee : commission) {
                    employee.employeePaycheck();
                }
                break;

            case 4:
                System.exit(1);
                break;
            default:
                System.out.println("Error: Invalid Option Selected");
                System.exit(1);
        }
        // Creates a file name txt and checks if it already exist.
        File payFile = new File(theEmployee.getFirstName() + theEmployee.getLastName() + "Payroll.txt");
        // if file already exist, display message and exit.
        if (payFile.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        // else create a new file and get its name.
        else {
            System.out.println("File created: " + payFile.getName());
        }
        {
            // Writes to the file and print that it wrote successfully.
            PrintWriter output = new PrintWriter(payFile);

            // writes data to Payroll.txt
            output.println("First Name: " + theEmployee.getFirstName());
            output.println("Last Name: " + theEmployee.getLastName());
            output.println("Employee Wage Type: " + theEmployee.getWageType());
            output.println("Employee ID Number: " + theEmployee.getIdNumber());
            output.println("Employee Check Total: ");
            System.out.println("Successfully wrote to the file.");
            output.close();
            userInput.close();
        }

        System.out.println("\nDisplay content from Payroll.txt");

        // Read content from Payroll.txt and displays it
        File displayPaycheck = new File(theEmployee.getFirstName() + theEmployee.getLastName() +
                theEmployee.getWageType() + theEmployee.getIdNumber() + "Payroll.txt");
        Scanner inputDisplay = new Scanner(displayPaycheck);

        // display everything line by line until ends.
        while (inputDisplay.hasNextLine()) {
            String input = inputDisplay.nextLine();
            System.out.println(input);
        }
        inputDisplay.close(); // close display
    }

    private static Integer wage(int i, int i1, int i2) {
        return null;
    }

}
