/*
The great circle distance is the distance between two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points. The great circle distance between the two points can be computed using the following formula:

d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1- y2))

Write a program that prompts the user to enter the latitude and longitude of two points on the earth in degrees and displays its great circle distance. The average earth radius is 6,371.01 km. Note that you need to convert the degrees into radians using the Math.toRadians method since the Java trigonometric methods use radians. The latitude and longitude degrees in the formula are for north and west. Use negative to indicate south and east degrees.
*/

package Chapter4;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two points
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble();

        // Average Earth Radius
        final double RADIUS = 6371.01;

        double initial = Math.sin(Math.toRadians(x1)) *  Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2));

        // Calculate great circle distance
        double d = RADIUS * Math.acos(initial);

        // Display the distance
        System.out.println("The distance between the two points is " +d+ " km");

        // Close the Scanner
        input.close();
    }
}
