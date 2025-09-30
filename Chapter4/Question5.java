/*
A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for computing the area of a regular polygon is
            Area = (n * s^2) / (4 * tan(PI/n))
Here, s is the length of a side. Write a program that prompts the user to enter the number of sides and their length of a regular polygon and displays its area.
*/

package Chapter4;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of sides of polygon
        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();

        // Prompt the user to enter the length 
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculate the area of polygon
        double area = (numberOfSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/numberOfSides));

        // Display the area of polygon
        System.out.println("The area of polygon is " +area);

        // Close the Scanner
        input.close();
    }
}
