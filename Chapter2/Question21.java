/*
Write a program that reads in investment amount, annual interest rate, and number of years, and displays the future investment value 
using the following formula:
futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98.
*/

package Chapter2;
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter investement amount
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        // Prompt the user to enter annual interest rate
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        // Prompt the user to enter number of years
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        // Calculate monthly interst rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Calculate future investment value
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears*12));

        // Display the future investment amount
        System.out.println("Accumulated value is $" +futureInvestmentValue);

        // Close the Scanner
        input.close();
    }
}
