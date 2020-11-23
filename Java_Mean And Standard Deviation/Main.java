/* Program Prologue
Steven Crosby
CIT260 - Bro deBry
Week 07 Dot 2

1. Tells the user what the program does.
2. Prompts the user to enter 5 double values.
3. Stores these values in an array.
4. Uses the methods above to compute the mean and the standard deviation for the numbers in the array.
5. Displays the mean and the standard deviation with 2 digits after the decimal point.
6. Displays a goodbye message.
*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // SCAN FOR USER INPUT
        Scanner input=new Scanner(System.in);

        // DISPLAY PROGRAM INSTRUCTIONS
        System.out.println("This program calculates the average of five numbers.");
        System.out.println(" ");

        // CREATE ARRAY
        double array[]= new double[5];

        // FOR LOOP ADDING USER INPUT TO ARRAY
        for (int i=0; i < array.length; i++) {
            System.out.print("Please type a number and press enter: ");
            array[i] = input.nextDouble();
        }
        // DISPLAY THE MEAN AND DEVIATION
        System.out.println(" ");
        System.out.println("The mean is: " + theMean(array));
        System.out.println("The standard deviation is: " + theDeviation(array));
        System.out.println("The program is complete, goodbye.");
    }
    // ARRAY AVERAGE METHOD
    public static double theMean(double[] array) {
        double sum= 0;
        for (double i : array)
            sum += i;
        return sum/array.length;
    }
    // DEVIATION METHOD
    public static double theDeviation(double[] x){
        double deviation = 0;
        int length = x.length - 1;
        double m = theMean(x);
        for (double i:x){
            deviation += Math.pow(i - m, 2);
        }
        return Math.sqrt(deviation / length);
    }
}
