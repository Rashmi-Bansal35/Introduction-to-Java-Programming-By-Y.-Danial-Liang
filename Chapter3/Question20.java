/*
Programming Exercise 2.17 gives a formula to compute the wind-chill temperature. The formula is valid for temperatures in the range between -58ºF and 41ºF and wind speed greater than or equal to 2. Write a program that prompts the user to enter a temperature and a wind speed. The program displays the wind-chill temperature if the input is valid; otherwise, it displays a message indicating whether the temperature and/or wind speed is invalid.
*/

package Chapter3;
import java.util.Scanner;

public class Question20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double twc = 0;

        // Prompt the user to enter the wind speed
        System.out.print("Enter the wind speed in miles per hour: ");
        double speed = input.nextDouble();

        // Prompt the user to enter the temperature
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        // Check if input is valid
        if(temperature < (-58) || temperature > 41 || speed < 2){
            System.out.println("Temperature / wind speed is invalid.");
        }
        else{
            // Calculate the wind-chill temperature using formula
            twc = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temperature * Math.pow(speed, 0.16));

            // Display the wind chill result
            System.out.println("The wind-chill index is " +twc);
        }

        // Close the Scanner
        input.close();
    }
}
