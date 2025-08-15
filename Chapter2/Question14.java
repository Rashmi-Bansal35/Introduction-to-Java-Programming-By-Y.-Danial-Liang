/*
Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing 
by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height in inches and 
displays the BMI. Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
*/

package Chapter2;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        // Conversion factors: 1 pound = 0.45359237 kilograms, 1 inch = 0.0254 meters
        double one_pound = 0.45359237;
        double one_inch = 0.0254;

        // Convert weight from pounds to kilograms
        double weight_in_kg = weight * one_pound;

        // Convert height from inches to meters
        double height_in_meters = height * one_inch;

        // Calculate BMI using formula: weight(kg) / (height(m)^2)
        double BMI = weight_in_kg / Math.pow(height_in_meters, 2);

        // Display the calculated BMI
        System.out.println("BMI is " +BMI);

        // Close the Scanner
        input.close();
    }
}
