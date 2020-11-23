/*
Program Prologue
Steven Crosby
CIT260-07
Week 6 Dot 2

1. Tells the user what the program does.
2. Calls celsiusToFahrenheit method and fahrenheitToCelsius methods
3. Displays both conversion tables with a divider
6. Outputs a goodbye message.
*/

public class Main {

    public static void main(String[] args) {
        // TABLE 1 HEADER
        System.out.println("   Celsius   |   Fahrenheit   ");

        for (double celsius = 40.0; celsius >= 31.0; celsius--){

            // CALLS celsiusToFahrenheit AND DISPLAYS TABLE 1
            System.out.format("%8.1f", celsius);
            System.out.printf("%15.1f\n", celsiusToFahrenheit(celsius));

        }
        // DISPLAY TABLE 2
        System.out.println("================================");
        System.out.println(" ");
        System.out.println("   Fahrenheit   |   Celsius   ");

        for (double fahrenheit = 120.0; fahrenheit >= 30.0; fahrenheit-=10){
            // CALLS fahrenheitToCelsius AND DISPLAYS TABLE 2
            System.out.format("%8.1f", fahrenheit);
            System.out.format("%15.2f\n",fahrenheitToCelsius(fahrenheit));

        }
        System.out.println("The program is complete, goodbye.");
    }
    // CONVERT FROM CELSIUS TO FAHRENHEIT
    public static double celsiusToFahrenheit(double celsius){

        return (9.0 / 5) * celsius + 32;
    }

    // CONVERT FROM FAHRENHEIT TO CELSIUS
    public static double fahrenheitToCelsius(double fahrenheit){

        return (5.0 / 9) * (fahrenheit - 32);
    }
}