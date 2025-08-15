/*
Suppose you save $100 each month into a savings account with the annual interest rate 5%. Thus, the monthly interest rate 
is 0.05/12= 0.00417. 
After the first month, the value in the account becomes 100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes (100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes (100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month.
*/

package Chapter2;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enetr fixed monthly saving amount
        System.out.print("Enter the monthly saving amount: ");
        double monthlySavings = input.nextDouble();

        // Monthly interest rate when annual interest rate is 5%
        // (5% yearly -> 0.05 annually; divide by 12 to get monthly interest rate)
        double monthlyInterestRate = 0.00417;
        double value = (1 + monthlyInterestRate);

        // Calculate the account balance after each month
        double firstMonth = monthlySavings * value;
        double secondMonth = (monthlySavings + firstMonth) * value;
        double thirdMonth = (monthlySavings + secondMonth) * value;
        double fourthMonth = (monthlySavings + thirdMonth) * value;
        double fifthMonth = (monthlySavings + fourthMonth) * value;
        double sixthMonth = (monthlySavings + fifthMonth) * value;
        
        // Display the account balance after 6 months
        System.out.printf("After the sixth month, the account value is $%.3f", sixthMonth);
        
        // Close the Scanner
        input.close();
    }
}
