/*
Write a program that prompts the user to enter the center x-, y-coordinates, width, and height of two rectangles and determines whether the second rectangle is inside the first or overlaps with the first.
*/

package Chapter3;
import java.util.Scanner;

public class Question28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the data of rectangle 1
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double r1X = input.nextDouble();
        double r1Y = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();

        // Prompt the user to enter the data of rectangle 2
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2X = input.nextDouble();
        double r2Y = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();

        // Calculate edge of rectangle 1
        double r1Left = r1X - r1Width / 2;
        double r1Right = r1X + r1Width / 2;
        double r1Top = r1Y + r1Height / 2;
        double r1Bottom = r1Y - r1Height / 2;

        // Calculate edge of rectangle 2
        double r2Left = r2X - r2Width / 2;
        double r2Right = r2X + r2Width / 2;
        double r2Top = r2Y + r2Height / 2;
        double r2Bottom = r2Y - r2Height / 2;

        // Check if rectangle 2 is inside rectangle 1
        if(r2Left >= r1Left && r2Right <= r1Right && r2Top <= r1Top && r2Bottom >= r1Bottom){
            System.out.println("r2 is inside r1.");
        }
        else if(r1Right >= r2Left && r1Left <= r2Right && r1Top >= r2Bottom && r1Bottom <= r2Top){
            System.out.println("r2 overlap r1.");
        }
        else{
            System.out.println("r2 does not overlap r1.");
        }

        // Close the Scanner
        input.close();
    }
}
