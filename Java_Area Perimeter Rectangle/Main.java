/*
Program Prologue
Steven Crosby
CIT260-07
Week 8 Dot 1

1. Two data fields named width and height, that specify the width and height of the rectangle.
The default values for both width and height should be 1.
2. A no-arg constructor that creates a default rectangle object.
3. A parameterized constructor that creates a rectangle object with the specified height and width.
Getter and setter methods for height and width.
4. A method named getArea( ) that computes and returns the area of the rectangle.
5. A method names getPerimeter( ) that computes and returns the perimeter of the rectangle.

In a separate file, write a short Java program that implements your Rectangle class, and a main() method
6. Creates two Rectangle objects, the first with a height of 4 and a width of 40,
the second with a height of 3.5 and a width of 5.
7. Call the methods in your Rectangle class to output the width, height, area, and perimeter of each rectangle,
with 2 digits after the decimal point.
*/


public class Main {

    public static void main(String[] args) {
        /* main method
        * calculates and output the width, height, area, and perimeter
        * of rectangle1 and rectangle2
        * */
        Rectangle rectangle1 = new Rectangle(40, 4);
        Rectangle rectangle2 = new Rectangle(5, 3.5);
        // Output
        System.out.println("===== Rectangle 1 =====");
        System.out.println("Height: " + rectangle1.setWidth());
        System.out.println("Width: " + rectangle1.setHeight());
        System.out.printf("Area: %.2f %n", rectangle1.getArea());
        System.out.printf("Perimeter: %.2f %n", rectangle1.getPerimeter());
        System.out.println("===== Rectangle 2 =====");
        System.out.println("Height: " + rectangle2.setWidth());
        System.out.println("Width: " + rectangle2.setHeight());
        System.out.printf("Area: %.2f %n", rectangle2.getArea());
        System.out.printf("Perimeter: %.2f %n", rectangle2.getPerimeter());
        System.out.println("Program complete, goodbye.");
    }
}
