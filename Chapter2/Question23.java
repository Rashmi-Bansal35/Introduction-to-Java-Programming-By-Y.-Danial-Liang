/*
Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon, and the price 
per gallon, and displays the cost of the trip.
*/

package Chapter2;
import java.util.Scanner;

public class Question23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the driving distance
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        // Prompt the user to enter the fuel efficiency in miles per gallon
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        // Prompt the user to enter price per gallon
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        // Calculate the cost of driving
        double cost = (distance / milesPerGallon) * pricePerGallon;

        // Display the cost
        System.out.println("The cost of driving is: $" +cost);

        // Close the Scanner
        input.close();
    }
}
