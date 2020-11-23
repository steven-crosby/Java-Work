/*
Program Prologue
Steven Crosby
CIT260-07
Week 2 Dot 2

1. Tells the user what the program does.
2. Prompts the user to enter a value for the cost of their meal.
3. Gets the user's input and saves it in a variable declared as a double.
4. Prompts the user to enter a percentage value for the tip.
5. Gets the user's input and saves it in a variable declared as a double.
6. Calculates the value of the tip, using the percentage entered by the user.
7. Calculates the tax on the meal. The tax rate is 3.2%.
8. Calculates the total bill = meal cost + tip + tax.
9. Outputs the tip, the tax, and the total value of the bill.
10. All values will be formatted to show a dollar sign and 2 digits after the decimal point.
11. Outputs a goodbye message.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Given the price of a meal and a percentage to use for the tip");
        System.out.println(" this program calculates the tip, tax, and the total amount of the bill.\n");
        System.out.println("Enter the subtotal: ");
        double subtotal = input.nextDouble();
        System.out.println("Now enter your gratuity rate, as a whole number without a percent sign: ");
        double gratuityRate = input.nextDouble();
        double theTip = subtotal*(gratuityRate/100);
        double theTax = subtotal*.032;
        double theTotal = subtotal + theTip + theTax;
        System.out.printf("The gratuity is $%.2f and the total is $%.2f", theTip, theTotal);
        System.out.println("\n");
        System.out.println("Goodbye\n");
    }
}
