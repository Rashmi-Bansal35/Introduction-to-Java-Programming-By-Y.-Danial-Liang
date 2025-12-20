/*
Write a program that prompts the user to enter three cities and displays them in ascending order.
*/

package Chapter4;
import java.util.Scanner;

public class Question24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter names of three cities
        System.out.print("Enter the first city: ");
        String cityA = input.nextLine();
        System.out.print("Enter the second city: ");
        String cityB = input.nextLine();
        System.out.print("Enter the third city: ");
        String cityC = input.nextLine();

        // Declare a temporary variable for swapping
        String temp;

        // Compare City A and City B
        int cityAB = cityA.compareTo(cityB);
        // Check if city A is bigger than city B then swap it
        if (cityAB > 0){
            temp = cityA;
            cityA = cityB;
            cityB = temp;
        }
        
        // Compare City B and City C
        int cityBC = cityB.compareTo(cityC);
        // Check if city B is bigger than city C then swap it
        if (cityBC > 0){
            temp = cityB;
            cityB = cityC;
            cityC = temp;
        }

        // Compare City A and City C
        int cityAC = cityA.compareTo(cityC);
        // Check if city A is bigger than city C then swap it
        if (cityAC > 0){
            temp = cityA;
            cityA = cityC;
            cityC = temp;
        }

        // Display the result
        System.out.println("The three cities in alphabetical order are " + cityA + " " + cityB + " " + cityC);

        // Close the Scanner
        input.close();
    }
}
