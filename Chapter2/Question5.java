/*
Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
  Gratuity = Subtotal (in $) * ( Gratuity Rate (%) / 100) 
  Total = Subtotal (in $) + Gratuity (in $)
*/

package Chapter2;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal (in $): ");
        double subtotal = input.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        System.out.println("The Gratuity is $" +gratuity+ " and $" +total);
        input.close();
    }
}
