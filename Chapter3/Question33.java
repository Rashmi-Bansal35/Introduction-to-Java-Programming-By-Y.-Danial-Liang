/*
Suppose you shop for rice in two different packages. You would like to write a program to compare the cost. The program prompts the user to enter the weight and price of the each package and displays the one with the better price.
*/

package Chapter3;
import java.util.Scanner;

public class Question33 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the weight and price of both packages
        System.out.print("Enter the weight and price of package 1: ");
        double package1Weight = input.nextDouble(), package1Price = input.nextDouble();
        System.out.print("Enter the weight and price of package 2: ");
        double package2Weight = input.nextDouble(), package2Price = input.nextDouble();

        // Find the unit price
        double unitPrice1 = package1Price / package1Weight;
        double unitPrice2 = package2Price / package2Weight;

        // Check which one is better
        if (unitPrice1 < unitPrice2){
            System.out.println("Package 1 has better price.");
        }
        else if(unitPrice2 < unitPrice1){
            System.out.println("Package 2 has better price.");
        }
        else{
            System.out.println("Two Packages have same price.");
        }

        // Close the Scanner
        input.close();
    }
}
