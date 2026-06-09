/*
Suppose you save $100 each month into a savings account with the annual interest rate 5%. So, the monthly interest rate is
0.05 / 12 = 0.00417. After the first month, the value in the account becomes
    100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes    (100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes (100 + 201.252) * (1 + 0.00417) = 302.507   and so on.
Write a program that prompts the user to enter an amount (e.g., 100), the annual interest rate (e.g., 5), and the number of months (e.g., 6) and displays the amount in the savings account after the given month.
*/

package Chapter5;
import java.util.Scanner;

public class Question30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble() / 100;
        System.out.print("Number of months: ");
        int months = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 12;
        double totalAmount = 0;

        for(int i = 1; i <= months; i++){
            totalAmount = (amount + totalAmount) * (1 + monthlyInterestRate);
        }

        System.out.println(String.format("Total amount after %d months is %.3f", months, totalAmount));
        input.close();
    }
}
