/*
Program Prologue
Steven Crosby
CIT260-07
Week 2 Dot 1

1. Tells the user what the program does.
2. Prompts the user to enter a temperature in degrees Celsius.
3. Gets the user's input and saves it in a variable declared as a double.
4. Converts the Celsius temperature to a temperature in degrees Fahrenheit, using the formula:  tempf = (9.0/5.0) x tempc+ 32
5. Outputs the Celsius temperature and the Fahrenheit temperature, with 2 digits after the decimal point.
6. Outputs a goodbye message.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program converts a temperature in degrees Celsius into a temperature in degrees Fahrenheit.\n");
        System.out.println("Enter a degree in Celsius: ");
        int celsius = input.nextInt();
        System.out.println("\n");
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.printf(celsius + " degrees Celsius is %.2f degrees Fahrenheit.", fahrenheit);
        System.out.println("\n");
        System.out.print("Goodbye.\n");
    }
}
