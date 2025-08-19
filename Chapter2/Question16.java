/*
Write a program that prompts the user to enter the side of a hexagon and displays its area. The formula for computing the area of a
hexagon is
                   Area = 3√3 * (s^2)/2
where s is the length of a side.
*/

package Chapter2;
import java.util.*;

public class Question16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side of hexagon
        System.out.print("Enter the side of hexagon: ");
        double side = input.nextDouble();

        // Calculate the area of hexagon using formula
        double area = 3 * Math.pow(3, 0.5) * Math.pow(side , 2) / 2;

        // Display the area of hexagon
        System.out.println("The area of hexagon of side" +side+ " is " +area+ ".");

        // Close the Scanner
        input.close();
    }
}
