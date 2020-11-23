/*
 Program Prologue
 Steven Crosby
 CIT260-07
 Week 3 Dot 1

 1. Tells the user what the program does.
 2. Prompts the user to enter a value for today's day of the week (0 for Sunday, 1, for Monday, etc. ).
 3. Gets the user's input and saves it. If the value is less than 0 or greater than 6, tell the user the input is invalid, and terminate the program.
 4. Prompts the user to enter some number of days in the future. This can be any positive value.
 5. Gets the user's input and saves it. If the value is negative, tell the user the input is invalid and terminate the program.
 6. Calculates the day of the week for the future day.
 7. Displays the day of the week for today and the day of the week for the future day.
 8. Outputs a goodbye message.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter any number of days from today, such as 5 or 12: ");
        int daysElapse = input.nextInt();
        int future = (today + daysElapse) % 7;
        System.out.print("Today is ");

        switch(today){
            case 0 : System.out.print("Sunday");
                break;
            case 1: System.out.print("Monday");
                break;
            case 2: System.out.print("Tuesday");
                break;
            case 3: System.out.print("Wednesday");
                break;
            case 4: System.out.print("Thursday");
                break;
            case 5: System.out.print("Friday");
                break;
            case 6: System.out.print("Saturday");
                break;
            default: System.out.print("Nope, try again");
                System.exit(1);
        }

        System.out.print(" and the future day is ");

        switch(future){
            case 0 : System.out.print("Sunday");
                break;
            case 1: System.out.print("Monday");
                break;
            case 2: System.out.print("Tuesday");
                break;
            case 3: System.out.print("Wednesday");
                break;
            case 4: System.out.print("Thursday");
                break;
            case 5: System.out.print("Friday");
                break;
            case 6: System.out.print("Saturday");
                break;
        }
    }
}
