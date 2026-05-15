/*
Write a method with the following header to display an integer in reverse order:
public static void reverse(int number)
For example, reverse(3456) displays 6543. Write a test program that prompts the user to enter an integer and displays its reversal.
*/
package Chapter6;
import java.util.Scanner;

public class Question4 {
    public static void reverse(int number){
        int reverse = 0, duplicate = number;
        while(number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("The reverse of "+duplicate+ " is " + reverse);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        reverse(number);
        input.close();
    }
}
