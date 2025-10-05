/*
Write a program that receives a character and displays its Unicode.
*/

package Chapter4;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the character
        System.out.print("Enter a character: ");
        String str = input.nextLine();
        char character = str.charAt(0);

        // Type cast the input from char to int
        int unicode = (int)character;

        // Display the unicode of input
        System.out.printf("The unicode for character %c is %d\n", character, unicode);

        // Close the Scanner
        input.close();
    }
}
