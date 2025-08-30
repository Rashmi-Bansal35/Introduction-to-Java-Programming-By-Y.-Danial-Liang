/*
Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, and inches. For example, if a person is 5 feet and 
10 inches, you will enter 5 for feet and 10 for inches.
*/
package Chapter3;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the weight in pound
        System.out.print("Enter weight in pound: ");
        double weight_in_pound = input.nextDouble();

        // Prompt the user to enter height
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // Calculate total height in inches
        double height_in_inches = feet * 12 + inches;

        // Calculate BMI
        double weightInKilograms = weight_in_pound * KILOGRAMS_PER_POUND;
        double heightInMeters = height_in_inches * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " +bmi);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi < 25){
            System.out.println("Normal");
        }
        else if (bmi < 30){
           System.out.println("Overweight");  
        }
        else{
            System.out.println("Obese");
        }

        // Close the Scanner
        input.close();
    }
}
