/*
Write a program that prompts the user to enter a hex digit and displays its corresponding binary number.
*/
package Chapter4;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter hex digit
        System.out.print("Enter a hex digit: ");
        String hexadecimal = input.nextLine();

        // Close the Scanner
        input.close();
    }
}
