/*
Write a program that prompts the user to enter a string and displays its length and its first character.
*/

package Chapter4;
import java.util.Scanner;

public class Question20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Store length of string in variable
        int length = str.length();

        // Access the first character of string
        char firstCharOfString = str.charAt(0);

        // Display the length and first character of string
        System.out.println("The length of string: " + length);
        System.out.println("The first character of string: " + firstCharOfString);

        // Close the Scanner
        input.close();
    }
}
