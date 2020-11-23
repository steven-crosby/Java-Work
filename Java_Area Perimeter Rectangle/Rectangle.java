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

public class Rectangle {
    double width = 1;
    double height = 1;

    // Creates empty constructor
    Rectangle(){

    }
    /* Constructor
    * Purpose: creates rectangle with width and height
    */
    Rectangle(double newWidth, double newHeight){

        width = newWidth;
        height = newHeight;
    }
    /* the "setter" setWidth method
    * Purpose is to set the defined width
    * Returns defined width
    */
    double setWidth(){
        return width;
    }

    /* the "setter" setHeight method
     * Purpose is to set the defined height
     * Returns defined height
     */
    double setHeight(){
        return height;
    }

    /* the "getter" getArea method
     * Purpose is get the area of the object
     * Returns width * height
     */
    double getArea(){

        return width * height;

    }
    /* the "getter" getPerimeter method
     * Purpose is get the perimeter of the object
     * Returns (width*2) + (height*2)
     */
    double getPerimeter(){

        return (width*2) + (height*2);
    }
}
