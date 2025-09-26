/*
Given a directed line from point p0(x0, y0) to p1(x1, y1), you can use the following condition to decide whether a point p2(x2, y2) is on the left of the line, on the right, or on the same line (see Figure 3.11):

                                        { > 0 p2 is on the left side of the line
(x1- x0)*(y2- y0)- (x2- x0)*(y1- y0)    { = 0 p2 is on the same line
                                        { < 0 p2 is on the right side of the line

Write a program that prompts the user to enter the three points for p0, p1, and p2 and displays whether p2 is on the left of the line from p0 to p1, on the right, or on the same line.
*/

package Chapter3;
import java.util.Scanner;

public class Question32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three points
        System.out.print("Enter three points coordinates for p0, p1, and p2: ");
        double x0 = input.nextDouble(), y0 = input.nextDouble();
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();

        // Calculate the result
        double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        // Check if the point 2 is on left, right, or on the same line
        if(result > 0){
            System.out.println("("+x2+ ", "+y2+ ") is on the left side of the line from (" +x0+ ", " +y0+ ") to (" +x1+ ", " +y1+ ")");
        }
        else if(result == 0){
            System.out.println("("+x2+ ", "+y2+ ") is on the line from (" +x0+ ", " +y0+ ") to (" +x1+ ", " +y1+ ")");
        }
        else if(result < 0){
            System.out.println("("+x2+ ", "+y2+ ") is on the right side of the line from (" +x0+ ", " +y0+ ") to (" +x1+ ", " +y1+ ")");
        }

        // Close the Scanner
        input.close();
    }
}
