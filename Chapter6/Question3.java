/*
Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)

// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
*/
package Chapter6;
import java.util.Scanner;

public class Question3 {
    // Return the reversal of an integer
    public static int reverse(int number){
        int reverse = 0;
        while (number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return reverse;
    }

    // Return the true if number is a palindrome
    public static boolean isPalindrome(int number){
        if (number == reverse(number)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if its palindrome: ");
        int number = input.nextInt();

        if (isPalindrome(number) == true){
            System.out.println("The " + number + " is palindrome.");
        }
        else{
            System.out.println("The " + number + " is not palindrome.");
        }

        input.close();
    }
}
