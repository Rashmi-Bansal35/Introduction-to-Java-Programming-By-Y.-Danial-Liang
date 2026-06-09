/*
Suppose you put $10,000 into a CD with an annual percentage yield of 5.75%. After one month, the CD is worth
        10000 + 10000 * 5.75 / 1200 = 10047.92
After two months, the CD is worth   10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
After three months, the CD is worth 10096.06 + 10096.06 * 5.75 / 1200 = 10144.44    and so on.
Write a program that prompts the user to enter an amount (e.g., 10000), the annual percentage yield (e.g., 5.75), and the number of months (e.g., 18)
*/

package Chapter5;
import java.util.Scanner;

public class Question31 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double totalAmount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualPercentage = input.nextDouble() / 100;
        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();

        double monthlyRate = annualPercentage / 12;

        System.out.println(String.format("%-8s  %-8s", "Months", "CD Value"));
        for(int i = 1; i <= months; i++){
            totalAmount = totalAmount + (totalAmount * monthlyRate);
            System.out.println(String.format("%-8d  %-8.2f", i, totalAmount));
        }

        input.close();
    }
}
