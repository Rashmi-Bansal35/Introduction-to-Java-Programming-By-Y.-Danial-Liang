/*
Write a program that lets the user guess whether the flip of a coin results in heads or tails. The program randomly generates an integer 0 or 1, which represents head or tail. The program prompts the user to enter a guess and reports whether the guess is correct or incorrect.
*/

package Chapter3;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Generate a random guess
        int result = (int) (Math.random() * 2);

        // Prompt the user to enter the guess
        System.out.println("Guess whether the flip of a coin is heads or tails: ");
        System.out.print("Enter 0 for heads and 1 for tails: ");
        int userGuess = input.nextInt();

        // Check if guess is correct or not
        if(result == userGuess){
            System.out.println("Your guess is correct.");
        }
        else{
            System.out.println("Your guess is incorrect.");
        }

        // Close the Scanner
        input.close();
    }
}
