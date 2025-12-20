/*
Write a program that reads the following information and prints a payroll statement:
    Employee’s name (e.g., Smith)
    Number of hours worked in a week (e.g., 10)
    Hourly pay rate (e.g., 9.75)
    Federal tax withholding rate (e.g., 20%)
    State tax withholding rate (e.g., 9%)
*/

package Chapter4;
import java.util.Scanner;

public class Question23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter information
        System.out.print("Enter Employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double numberOfHours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        // Calculate payroll statements
        double grossPay = payRate * numberOfHours;
        double federalWithholding = federalTaxRate * grossPay;
        double stateWithholding = grossPay * stateTaxRate;
        double total = federalWithholding + stateWithholding;
        double netPay = grossPay - total;

        // Display the payroll statements
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + numberOfHours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions: ");
        System.out.printf("    Federal Withholding (%.1f%%): $%.2f\n", (federalTaxRate * 100), federalWithholding);
        System.out.printf("    State Withholding (%.1f%%): $%.2f\n", stateTaxRate * 100, stateWithholding);
        System.out.printf("    Total Deduction: $%.2f\n", total);
        System.out.printf(" Net Pay: $%.2f\n", netPay);

        // Close the Scanner
        input.close();
    }
}
