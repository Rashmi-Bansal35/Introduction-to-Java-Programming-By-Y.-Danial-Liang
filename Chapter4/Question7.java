/*
Suppose a pentagon is centered at (0, 0) with one point at the 0 o’clock position, as shown in Figure 4.7c. Write a program that prompts the user to enter the radius of the bounding circle of a pentagon and displays the coordinates of the five corner points on the pentagon.
*/

package Chapter4;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius of circle
        System.out.print("Enter the radius of boundary circle: ");
        double radius = input.nextDouble();

        // Calculate angles
        double angle1 = Math.PI / 2 + 0 * 2 * Math.PI / 5;
        double angle2 = Math.PI / 2 + 1 * 2 * Math.PI / 5;
        double angle3 = Math.PI / 2 + 2 * 2 * Math.PI / 5;
        double angle4 = Math.PI / 2 + 3 * 2 * Math.PI / 5;
        double angle5 = Math.PI / 2 + 4 * 2 * Math.PI / 5;

        // Find the coordinates
        double x1 = radius * Math.cos(angle1), y1 = radius * Math.sin(angle1);
        double x2 = radius * Math.cos(angle2), y2 = radius * Math.sin(angle2);
        double x3 = radius * Math.cos(angle3), y3 = radius * Math.sin(angle3);
        double x4 = radius * Math.cos(angle4), y4 = radius * Math.sin(angle4);
        double x5 = radius * Math.cos(angle5), y5 = radius * Math.sin(angle5);

        // Display the coordinates
        System.out.println("The coordinates of five points on the pentagon are:\n(" +x1+", " +y1+ ")\n(" +x2+", " +y2+ ")\n(" +x3+", " +y3+ ")\n(" +x4+", " +y4+ ")\n(" +x5+", " +y5+ ")");

        // Close the Scanner
        input.close();
    }
}
