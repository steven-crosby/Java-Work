/*
Program Prologue
Steven Crosby
CIT260-07
Week 10 Dot 1

Design a class named Triangle that extends the GeometricObject class given in Listing 11.1 in the textbook.

Your Triangle class should contain the following:
1. Three data fields side1, side2, and side3 that represent sides of a triangle.
2. Getter and setter methods for side1, side2, and side3.
3. A no-arg constructor that creates a default triangle with each side equal to 1.
4. A parameterized constructor that creates a triangle with the specified values for side1, side2, and side3.
5. A member method named getArea( ) that calculates and returns the area of the triangle. The formula to compute
the area of a Triangle, given three sides is called Heron's formula. Heron's formula is described in problem 2.19
in the textbook. To function correctly, you must add a getArea() method to the GeometricObject class, and the
getArea( ) method in the Triangle class must override GeometricObject's  getArea() method.
6. A member method named toString( ) that generates a String representation of the triangle object. This toString( )
method must call GeometricObject's  toString() method to correctly display the String representation of the Triangle
object.
7. Create a UML diagram that documents your class design. Show both the GeometricObject class and the Triangle class
in your diagram.

In a separate file, write a main( ) method that does the following:
1. Tells the user what the program does.
2. Prompts the user to enter the values for the sides, color, and filled attribute for three different triangle objects.
3. Saves the users input.
4. Using the values entered by the user, creates three Triangle objects and stores them in an
ArrayList<GeometricObject>.
5. Displays the string representation of each Triangle object in the ArrayList, by calling its toString( ) method
and it getArea() method. See the output example below.
6. Displays a goodbye message.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This program gets input for three triangles from the user.\n" +
                "It then creates three Triangle objects and displays the\n" +
                "description of each.");

        /* Triangle 1 */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side one of the 1st triangle:");
        double side1 = input.nextDouble();

        System.out.print("Enter side two of the 1st triangle:");
        double side2 = input.nextDouble();

        System.out.print("Enter side three of the 1st triangle:");
        double side3 = input.nextDouble();

        Triangle triangle1 = new Triangle(side1, side2, side3);
        input.nextLine();

        System.out.print("Enter color of the 1st triangle:");
        String color = input.nextLine();
        triangle1.setColor(color);

        System.out.println("Is the 1st Triangle filled? Reply with 'true' or 'false':");
        boolean filled = input.nextBoolean();
        triangle1.setFilled(filled);
        System.out.println();

        System.out.println(triangle1);
        System.out.printf("Area is %.2f\n", triangle1.getArea());
        System.out.printf("Perimeter is %.2f\n", triangle1.getPerimeter());
        System.out.println();

        /* Triangle 2 */
        System.out.print("Enter side one of the 2nd triangle:");
        side1 = input.nextDouble();

        System.out.print("Enter side two of the 2nd triangle:");
        side2 = input.nextDouble();

        System.out.print("Enter side three of the 2nd triangle:");
        side3 = input.nextDouble();

        Triangle triangle2 = new Triangle(side1, side2, side3);
        input.nextLine();

        System.out.print("Enter color of the 2nd triangle:");
        color = input.nextLine();
        triangle2.setColor(color);

        System.out.println("Is the 2nd Triangle filled? Reply with 'true' or 'false':");
        filled = input.nextBoolean();
        triangle2.setFilled(filled);
        System.out.println();

        System.out.println(triangle2);
        System.out.printf("Area is %.2f\n", triangle2.getArea());
        System.out.printf("Perimeter is %.2f\n", triangle2.getPerimeter());
        System.out.println();

        /* Triangle 3 */
        System.out.print("Enter side one of the 3rd triangle:");
        side1 = input.nextDouble();

        System.out.print("Enter side two of the 3rd triangle:");
        side2 = input.nextDouble();

        System.out.print("Enter side three of the 3rd triangle:");
        side3 = input.nextDouble();

        Triangle triangle3 = new Triangle(side1, side2, side3);
        input.nextLine();

        System.out.print("Enter color of the 3rd triangle:");
        color = input.nextLine();
        triangle3.setColor(color);

        System.out.println("Is the 3rd Triangle filled? Reply with 'true' or 'false':");
        filled = input.nextBoolean();
        triangle3.setFilled(filled);
        input.close();
        System.out.println();

        System.out.println(triangle3);
        System.out.printf("Area is %.2f\n", triangle3.getArea());
        System.out.printf("Perimeter is %.2f\n", triangle3.getPerimeter());
        System.out.println();

        /* GeometricObject */
        GeometricObject geometricObject = new GeometricObject("green", true);
        System.out.println(geometricObject);
        System.out.println();

        ArrayList <GeometricObject> objectList = new ArrayList<>();
        objectList.add(triangle1);
        objectList.add(triangle2);
        objectList.add(triangle3);
        objectList.add(geometricObject);
        System.out.println();


        System.out.println(objectList);
        System.out.println();

        objectList.remove (geometricObject);
        System.out.println();

        objectList.clear();
        System.out.println(objectList);
        System.out.println("The program is complete, goodbye.");
    }

}