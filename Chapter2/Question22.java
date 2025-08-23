/*
Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy when converting a double value to an int value. 
Enter the input as an integer whose last two digits represent the cents. For example, the input 1156 represents 11 dollars and 56 cents.
*/
package Chapter2;
import java.util.Scanner;

public class Question22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the amount
        System.out.print("Enter the amount: ");
        int amount = input.nextInt();

        // Calculate cents
        int cents = amount % 100;

        // Calculate dollars
        int dollars = amount / 100;

        // Dispaly the amount of cents and dollars
        System.out.println("The " +amount+ " consist of " +dollars+ " dollars and " +cents+ " cents.");

        // Close the Scanner
        input.close();
    }
}
