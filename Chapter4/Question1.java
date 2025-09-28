/*
Write a program that prompts the user to enter the length from the center of a pentagon to a vertex and computes the area of the pentagon.
The formula for computing the area of a pentagon is Area = (5 * s^2) / (4 * tan(pi/5), where s is the length of a side. The side can be computed using the formula s = 2r sin (pi/5) where r is the length from the center of a pentagon to a vertex. Round up two digits after the decimal point.
*/

package Chapter4;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter length of pentagon from center 
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        // Calculate the side of pentagon
        double s = 2 * r * Math.sin(Math.PI/5);

        // Calculate area of pentagon
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/5));

        // Display the area of pentagon
        System.out.printf("The area of pentagon is %.2f\n", area);

        // Close the Scanner
        input.close();
    }
}
