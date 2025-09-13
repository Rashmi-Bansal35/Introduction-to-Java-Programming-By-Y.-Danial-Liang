/*
Write a program that plays the popular scissor-rock-paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws.
*/

package Chapter3;
import java.util.Scanner;

public class Question17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter input
        System.out.print("Enter 0 for scissor, 1 for rock and 2 for paper: ");
        int userTurn = input.nextInt();

        // Generate random number 
        int computerTurn = (int)(Math.random()* 3);

        switch (userTurn) {
            case 0:
                if (userTurn == 0 && computerTurn == 2) System.out.println("You are scissor. Computer is paper. You won.");
                else if (userTurn == 0 && computerTurn == 1) System.out.println("You are scissor. Computer is rock. You lose.");
                else if (userTurn == 0 && computerTurn == 0) System.out.println("You are scissor. Computer is scissor too. It is a draw.");
                break;
            case 1:
                if (userTurn == 1 && computerTurn == 2) System.out.println("You are rock. Computer is paper. You won.");
                else if (userTurn == 1 && computerTurn == 0) System.out.println("You are rock. Computer is scissor. You lose.");
                else if (userTurn == 1 && computerTurn == 1) System.out.println("You are rock. Computer is rock too. It is a draw.");
                break;
            case 2:
                if (userTurn == 2 && computerTurn == 1) System.out.println("You are paper. Computer is rock. You won.");
                else if (userTurn == 2 && computerTurn == 0) System.out.println("You are paper. Computer is scissor. You lose.");
                else if (userTurn == 2 && computerTurn == 2) System.out.println("You are paper. Computer is paper too. It is a draw.");
                break;
            default:
                System.out.println("Invalid Input!!");
                break;
        }
    }
}
