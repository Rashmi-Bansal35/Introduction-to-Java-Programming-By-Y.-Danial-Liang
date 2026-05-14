/*
Write a method that computes the sum of the digits in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 9(2 + 3 + 4). (Hint: Use the % operator to extract digits, and the / operator to remove the extracted digit. For instance, to extract 4 from 234, use 234 % 10(= 4). To remove 4 from 234, use 234%/%10 (= 23). Use a loop to repeatedly extract and remove the digit until all the digits are extracted. Write a test program that prompts the user to enter an integer and displays the sum of all its digits.
*/
package Chapter6;
import java.util.Scanner;

public class Question2 {
    public static int sumDigits(long n){
        int sum = 0;
        long remainder = 0;
        while(n != 0){
            remainder = n % 10;
            sum += remainder;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        System.out.println("The sum of " + number + " is " + sumDigits(number));
        input.close();
    }
}
