/*
Write a method with the following header to display three numbers in increasing order:
public static void displaySortedNumbers (double num1, double num2, double num3)
Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order.
*/
package Chapter6;
import java.util.Scanner;
public class Question5 {
    public static void displaySortedNumbers(double num1, double num2, double num3){
        boolean swapped = true;
        while (swapped){
            swapped = false;
            if (num1 > num2){
                double temp = num2;
                num2 = num1;
                num1 = temp;
                swapped = true;
            }
            if (num2 > num3){
                double temp = num3;
                num3 = num2;
                num2 = temp;
                swapped = true;
            }
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);

        input.close();
    }
}
