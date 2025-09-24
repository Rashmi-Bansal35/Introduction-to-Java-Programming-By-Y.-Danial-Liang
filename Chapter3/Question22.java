/*
Write a program that prompts the user to enter a point (x, y) and checks whether the point is within the circle centered at (0, 0) with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the circle, as shown in Figure 3.7a.
(Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10. The formula for computing the distance is √((x2- x1)^2 + (y2- y1)^2). Test your program to cover all cases.)
*/

package Chapter3;
import java.util.Scanner;

public class Question22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a point 
        System.out.print("Enter a point with two coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Initialize x1 and y1 with 0 as a center point
        int y1 = 0, x1 = 0;

        // Find Difference in two points
        double x = x2 - x1, y = y2 - y1;

        // Find square of x and y
        double xSquare = Math.pow(x, 2), ySquare = Math.pow(y, 2);

        // Compute distance
        double distance = Math.pow(xSquare + ySquare , 0.5);

        // Check if distance is more than 10 
        if(distance <= 10){
            System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle.");
        }
        else{
            System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle.");
        }

        // Close the Scanner
        input.close();

    }
}
