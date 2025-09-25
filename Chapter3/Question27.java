/*
Suppose a right triangle is placed in a plane as shown below. The right-angle point is placed at (0, 0), and the other two points are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter a point with x- and y-coordinates and determines whether the point is inside the triangle.
*/

package Chapter3;
import java.util.Scanner;

public class Question27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter coordinates of a point
        System.out.print("Enter a point's x- and y- coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Given points
        double x1 = 0, y1 = 0;
        double x2 = 200, y2 = 0;
        double x3 = 0, y3 = 100;

        // Barycentric coordinate method
        double denominator = ((y2 - y3)*(x1 - x3) + (x3 - x2)*(y1 - y3));
        double a = ((y2 - y3)*(x - x3) + (x3 - x2)*(y - y3)) / denominator;
        double b = ((y3 - y1)*(x - x3) + (x1 - x3)*(y - y3)) / denominator;
        double c = 1 - a - b;

        // Check if point is in triangle or not
        if (a >= 0 && b >= 0 && c >= 0 && a <= 1 && b <= 1 && c <= 1) {
            System.out.println("The point is in triangle.");
        }
        else{
            System.out.println("The point is not in the triangle.");
        }

        // Close the Scanner
        input.close();
    }
}
