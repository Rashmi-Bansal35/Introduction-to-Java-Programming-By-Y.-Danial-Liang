/*
Programming Exercise 3.32 shows how to test whether a point is on an unbounded line. Revise Programming Exercise 3.32 to test whether a point is on a line segment. Write a program that prompts the user to enter the three points for p0, p1, and p2 and displays whether p2 is on the line segment from p0 to p1.

To check line segment use the equation:
    (x1 - x0) * (y2 - y0) == (x2 - x0) * (y1 - y0) 
if it's true then p2 is on line segment else p2 is not on the line segment.
*/ 

package Chapter3;
import java.util.Scanner;

public class Question34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the three points
        System.out.print("Enter the three points for p0, p1, and p2: ");
        double x0 = input.nextDouble(), y0 = input.nextDouble();
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();

        // Calculate the equation
        double leftSide = (x1 - x0) * (y2 - y0);
        double rightSide = (x2 - x0) * (y1 - y0);

        // Check the point 2 is on line segment or not
        if(leftSide == rightSide){
            boolean xInRange = (x2 >= x0 && x2 <= x1);
            boolean yInRange = (y2 >= y0 && y2 <= y1);
            if(xInRange && yInRange){
                System.out.println("("+x2+ ", "+y2+ ") is on the line segment from (" +x0+ ", " +y0+ ") to (" +x1+ ", " +y1+ ")");
            }
            else{
                System.out.println("("+x2+ ", "+y2+ ") is not on the line segment from (" +x0+ ", " +y0+ ") to (" +x1+ ", " +y1+ ")");
            }
        }
        else{
            System.out.println("("+x2+ ", "+y2+ ") is not on the line segment from (" +x0+ ", " +y0+ ") to (" +x1+ ", " +y1+ ")");
        }

        // Close the Scanner
        input.close();
    }
}
