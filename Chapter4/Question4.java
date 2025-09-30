/*
The area of a hexagon can be computed using the following formula (s is the length of a side):
                    Area = (6 * s^2) / (4 * tan(PI/6))
Write a program that prompts the user to enter the side of a hexagon and displays its area.
*/

package Chapter4;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side of hexagon
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculate the area of hexagon
        double area = (6 * Math.pow(side,2)) / (4 * Math.tan(Math.PI/6));

        // Display the area of hexagon
        System.out.printf("The area of hexagon is %.2f\n", area);

        // Close the Scanner
        input.close();
    }
}
