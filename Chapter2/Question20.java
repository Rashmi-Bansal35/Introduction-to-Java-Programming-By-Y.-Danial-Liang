/*
If you know the balance and the annual percentage interest rate, you can compute the interest on the next monthly payment using the 
following formula:
    interest = balance * (annualInterestRate/1200)
Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month. 
*/

package Chapter2;
import java.util.Scanner;

public class Question20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter account balance
        System.out.print("Enter balance: ");
        double balance = input.nextDouble();

        // Prompt the user to enter interest rate
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        // Calculate next month interest
        double interest = balance * (annualInterestRate / 1200);

        // Display the interest
        System.out.println("The interest rate is " +interest);

        // Close the Scanner
        input.close();
    }
}
