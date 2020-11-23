/* Program Prologue
Steven Crosby
CIT260 - Bro deBry
Week 07 Dot 1

1. Tells the user what the program does.
2. Prompts the user to enter 5 double values.
3. Stores these values in an array.
4. Calls the average method you wrote to calculate and return the average value of the numbers in the array.
5. Displays the average value, with two digits after the decimal point.
6. Displays a goodbye message.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // SCAN FOR USER INPUT
        Scanner input=new Scanner(System.in);

        // DISPLAY PROGRAM INSTRUCTIONS
        System.out.println("This program calculates the average of five numbers.");

        // CREATE ARRAY
        double array[]= new double[5];

        // FOR LOOP ADDING USER INPUT TO ARRAY
        for (int i=0; i < array.length; i++) {
            System.out.print("Please type a number and press enter: ");
            array[i] = input.nextDouble();
        }

        // DISPLAY THE AVERAGE
        System.out.println("The average is: "+ theAverage(array));
        System.out.println("The program is complete, goodbye.");
    }
    // ARRAY AVERAGE METHOD
    public static double theAverage(double[] array) {
        double sum= 0;
       for (double i : array)
           sum += i;
       return sum/array.length;
    }
}
