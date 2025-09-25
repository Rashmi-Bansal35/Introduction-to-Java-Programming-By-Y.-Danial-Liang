/*
Write a program that prompts the user to enter the center coordinates and radii of two circles and determines whether the second circle is inside the first or overlaps with the first. (Hint: circle2 is inside circle1 if the distance between the two centers <= |r1 - r2| and circle2 overlaps circle1 if the distance between the two centers <= r1 + r2. )
*/

package Chapter3;
import java.util.Scanner;

public class Question29 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter input of circle 1
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double c1X = input.nextDouble();
        double c1Y = input.nextDouble();
        double c1Radius = input.nextDouble();

        // Prompt the user to enter input of circle 2
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double c2X = input.nextDouble();
        double c2Y = input.nextDouble();
        double c2Radius = input.nextDouble();

        // Calculate Distance between (x1, y1) and (x2, y2) 
        // Distance = √((x1 - x2)^2 + (y1 - y2)^2)
        double x = c1X - c2X, y = c1Y - c2Y;
        double xSquare = Math.pow(x, 2), ySquare = Math.pow(y, 2);
        double distance = Math.pow(xSquare+ySquare, 0.5);

        // Check if circle 2 is inside the first or overlap with first
        if(distance <= c1Radius - c2Radius){
            System.out.println("Circle2 is inside Circle1.");
        }
        
        else if(distance <= c1Radius+c2Radius){
            System.out.println("Circle2 overlaps Circle1.");
        }
        else{
            System.out.println("Circle2 does not overlap Circle1.");
        }

        // Close the Scanner
        input.close();
    }
}
