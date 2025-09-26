/*
Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
*/

package Chapter3;
import java.util.Scanner;

public class Question31 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter exchange rate
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();

        // Prompt the user to enter value for conversion
        System.out.print("Enter 0 to convert dollar to RMB and 1 vice versa: ");
        int check = input.nextInt();

        double RMB = 0, dollars = 0, amount = 0;

        switch(check){
            case 0:
                // Prompt the user to enter amount 
                System.out.print("Enter the dollar amount: ");
                amount = input.nextDouble();
                RMB = amount * exchangeRate;
                System.out.println("$" +amount+ " is " +RMB+ " yuan.");
                break;
            case 1:
                // Prompt the user to enter amount 
                System.out.print("Enter the RMB amount: ");
                amount = input.nextDouble();
                dollars = amount / exchangeRate;
                System.out.println(amount+ " yuan is $" +dollars);
                break;
            default:
                System.out.println("Invalid Input");
        }

        // Close the Scanner
        input.close();
    }
}
