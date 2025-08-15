/*
Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance between them.
The formula for computing the distance is √((x2- x1)^2 + (y2- y1)^2). Note that you can use Math.pow(a, 0.5) to compute √a.
*/

package Chapter2;
import java.util.Scanner;

public class Question15 {
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

        // Calculate difference of x and y coordinates
        double difference_of_x = x2 - x1; 
        double difference_of_y = y2 - y1; 

        // Calculates the square of differences
        double x = Math.pow(difference_of_x, 2); 
        double y = Math.pow(difference_of_y, 2); 

        // Add the sqaured differences
        double a = x + y; 

        // Calculates the square root of sum (distance formula)
        double distance = Math.pow(a, 0.5); 

        // Display the distance between two points
        System.out.println("The distance between two points are: " +distance);

        // Close the Scanner
        input.close(); 
    }
}
