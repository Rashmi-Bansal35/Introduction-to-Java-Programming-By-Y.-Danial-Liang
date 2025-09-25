/*
Write a program that prompts the user to enter an integer and determines whether it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both. 
*/

package Chapter3;
import java.util.Scanner;

public class Question26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Divide input by 5
        int divisibleBy5 = number % 5;

        // Divide input by 6
        int divisibleBy6 = number % 6;

        // Find result in boolean 
        boolean andResult = divisibleBy5 == 0 && divisibleBy6 == 0;
        boolean orResult = divisibleBy5 == 0 || divisibleBy6 == 0;
        boolean exclusiveOrResult = divisibleBy5 == 0 ^ divisibleBy6 == 0;

        // Dispaly the result 
        System.out.println("Is " +number+ " divisible by 5 and 6? " + andResult);
        System.out.println("Is " +number+ " divisible by 5 or 6? " + orResult);
        System.out.println("Is " +number+ " divisible by 5 or 6, but not both? " + exclusiveOrResult);

        // Close the Scanner
        input.close();
    }
}
