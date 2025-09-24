/*
Write a program that prompts the user to enter a point (x, y) and checks whether the point is within the rectangle centered at (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and (6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all cases.)
*/

package Chapter3;
import java.util.Scanner;

public class Question23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the width and height 
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // The actual distance of rectangle from center
        double actualXDistance = 10.0 / 2;
        double actualYDistance = 5.0 / 2;

        // Check if point is in rectangle or not
        if(x <= actualXDistance && y <= actualYDistance){
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle.");
        }
        else{
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle.");
        }

        // Close the Scanner
        input.close();
    }
}
