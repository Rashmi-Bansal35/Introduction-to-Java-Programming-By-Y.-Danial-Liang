/*
Write a program that prompts the user to enter a three-digit integer and determines whether it is a palindrome number. A number is palindrome if it reads the same from right to left and from left to right. 
*/

package Chapter3;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three digit number
        System.out.print("Enter a three digit integer: ");
        int number = input.nextInt();

        // Assign input value to another variable
        int duplicate = number;

        // Find 3rd digit of input number
        int thirdDigit = number % 10;
        number = number / 10;

        // Find 2nd digit of input number
        int secondDigit = number % 10;
        number = number / 10;

        // Find 1st digit of input number
        int firstDigit = number % 10;
        number = number / 10;

        // Form the reversed 3-digit number
        int reverse = (thirdDigit * 100) + (secondDigit * 10) + firstDigit;

        // Display the result
        if(reverse == duplicate) System.out.println(duplicate + " is a palindrome");
        else System.out.println(duplicate + " is not a palindrome");

        // Close the Scanner
        input.close();
    }
}
