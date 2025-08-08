/*
Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
For example, if an integer is 932, the sum of all its digits is 14.
*/
package Chapter2;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int sum = 0;

        if (number > 0 && number < 1000){
            int digit1 = number % 10;
            int digit2 = (number / 10) % 10;
            int digit3 = (number / 100) % 10;
            sum = digit1 + digit2 + digit3;
            System.out.println("The sum of the digits is " +sum);
        }
        else{
            System.out.println("Out of Range. Please enter valid number.");
        }

        input.close();
    }
}
