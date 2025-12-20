/*
Rewrite Listing" 2.10, ComputeChange.java, to fix the possible loss of accuracy when converting a float value to an int value. Read the input as a string such as "11.56". Your program should extract the dollar amount before the decimal point and the cents after the decimal amount using the indexOf and substring methods.
*/

package Chapter4;
import java.util.Scanner;

public class Question26 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount : ");
        String amount = input.next();

        int index = amount.indexOf(".");
        int dollars, cents;

        // Check if there is no decimal point
        if (index == -1){
            dollars = Integer.parseInt(amount);
            cents = 0;
        }
        else{
            // Extract dollars
            String dollarPart = amount.substring(0, index);
            // Check if input is only in cents or not
            if (dollarPart.length() == 0){
                dollars = 0;
            }
            else {
                dollars = Integer.parseInt(dollarPart);
            }

            // Extract cents
            String centsPart = amount.substring(index+1);
            // Check we should have only 2 digits
            if (centsPart.length() == 1){
                centsPart = centsPart + "0";
            } 
            else if (centsPart.length() > 2){
                centsPart = centsPart.substring(0, 2);
            }
            cents = Integer.parseInt(centsPart);
        }

        // Calculate total pennies
        int remainingAmount = (dollars * 100) + cents;

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        
        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");

        // Close the Scanner
        input.close();
    }
}
