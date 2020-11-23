/*
 Program Prologue
 Steven Crosby
 CIT260-07
 Week 3 Dot 2

 1. Tells the user what the program does.
 2. Prompts the user to enter a year.
 3. Gets the user's input and saves it.
 4. Prompts the user to enter a value for the month(1 = Jan, 2 = Feb, etc).
 5. Gets the user's input and saves it. If the value is is not between 1 and 12 inclusive, tell the user and terminate the program.
 6. Calculates the number of days in that month. Your program should correctly handle leap years (see listing 3.7 in the textbook).
 7. Displays the number of days in that month.
 8. Outputs a goodbye message.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month: ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case 1:
                System.out.println("January " + year + " has 31 days");
                break;
            case 2:
                System.out.println("February " + year + " has" + ((isLeapYear) ? " 29 days" : " 28 days"));
                break;
            case 3:
                System.out.println("March " + year + " has 31 days");
                break;
            case 4:
                System.out.println("April " + year + " has 30 days");
                break;
            case 5:
                System.out.println("May " + year + " has 31 days ");
                break;
            case 6:
                System.out.println("June " + year + " has 30 days ");
                break;
            case 7:
                System.out.println("July " + year + " has 31 days ");
                break;
            case 8:
                System.out.println("August " + year + " has 31 days ");
                break;
            case 9:
                System.out.println("September " + year + " has 30 days ");
                break;
            case 10:
                System.out.println("October " + year + " has 31 days ");
                break;
            case 11:
                System.out.println("November " + year + " has 30 days ");
                break;
            case 12:
                System.out.println("December " + year + " has 31 days ");
                break;
        }
    }
}
