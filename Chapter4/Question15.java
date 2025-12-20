/*
The international standard letter/number mapping found on the telephone 
Write a program that prompts the user to enter a letter and displays its corresponding number.
*/

package Chapter4;
import java.util.Scanner;

public class Question15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the input
        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);
        char updatedLetter = Character.toLowerCase(letter);
        int number = 0;

        // Check corresponding number based on the user input
        if (updatedLetter == 'a' || updatedLetter == 'b' || updatedLetter == 'c'){
            number = 2;
        } else if (updatedLetter == 'd' || updatedLetter == 'e' || updatedLetter == 'f'){
            number = 3;
        } else if (updatedLetter == 'g' || updatedLetter == 'h' || updatedLetter == 'i') {
            number = 4;
        } else if (updatedLetter == 'j' || updatedLetter == 'k' || updatedLetter == 'l') {
            number = 5;
        } else if (updatedLetter == 'm' || updatedLetter == 'n' || updatedLetter == 'o') {
            number = 6;
        } else if (updatedLetter == 'p' || updatedLetter == 'q' || updatedLetter == 'r' || updatedLetter == 's') {
            number = 7;
        } else if (updatedLetter == 't' || updatedLetter == 'u' || updatedLetter == 'v' ) {
            number = 8;
        } else if (updatedLetter == 'w' || updatedLetter == 'x' || updatedLetter == 'y' || updatedLetter == 'z') {
            number = 9;
        } else {
            number = 1;
        }

        // Display the result
        if (number == 1){
            System.out.println(letter + " is an invalid input");
        } 
        else {
            System.out.println("The corresponding number is " + number );
        }

        // Close the Scanner
        sc.close();
    }
}
