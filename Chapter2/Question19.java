/*
Write a program that prompts the user to enter three points (x1, y1), (x2, y2), (x3,y3) of a triangle and displays its area.
The formula for computing the area of a triangle is
               s = (side1 + side2 + side3)/2;
               area = √(s(s- side1)(s- side2)(s- side3))
*/
package Chapter2;
import java.util.Scanner;

public class Question19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the coordinates for the first point (x1, y1)
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        // Prompt the user to enter the coordinates for the second point (x2, y2)
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Prompt the user to enter the coordinates for the third point (x3, y3)
        System.out.print("Enter x3 and y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Calculate side using coordinates
        // formula = √((x2-x1)^2 + (y2-y1)^2)
        double side1 = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2), 0.5);

        // Calculate area using formula
        double s = (side1 + side2 + side3) / 2;
        double cal = s * (s - side1) * (s - side2) * (s - side3);
        double area = Math.pow(cal, 0.5);

        // Display area of triangle
        System.out.println("The area of triangle is : " +area);

        // Close the Scanner
        input.close();
    }
}
