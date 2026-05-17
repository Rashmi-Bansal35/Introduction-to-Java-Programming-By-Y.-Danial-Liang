/*
Write a method that computes future investment value at a given interest rate for a specified number of years. The future investment is determined using the formula in Programming Exercise 2.21.
Use the following method header:
public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
Write a test program that prompts the user to enter the investment amount (e.g.,1000) and the interest rate (e.g., 9%) and prints a table that displays future value for the years from 1 to 30.
formula: futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
*/
package Chapter6;
import java.util.Scanner;

public class Question7 {
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
        return futureInvestmentValue;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investement amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println(String.format("%-12s  %-12s", "Years", "Future Value"));
        for (int i = 1; i <= 30; i++){
            int years = i;
            System.out.println(String.format("%-12d  %-12.2f", years, futureInvestmentValue(investmentAmount, monthlyInterestRate, years)));
        }

        input.close();
    }
}
