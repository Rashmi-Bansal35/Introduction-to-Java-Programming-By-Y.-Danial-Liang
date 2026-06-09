/*
Programming Exercise 3.17 gives a program that plays the scissor-rock-paper game. Revise the program to let the user continuously play until either the user or the computer wins more than two times than its opponent.
*/

package Chapter5;
import java.util.Scanner;

public class Question34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int userWin = 0, computerWin = 0;

        while(userWin < 2 && computerWin < 2){
            System.out.print("Enter 0 for scissor, 1 for rock and 2 for paper: ");
            int userTurn = input.nextInt();

            int computerTurn = (int)(Math.random()* 3);

            switch (userTurn) {
                case 0:
                    if (userTurn == 0 && computerTurn == 2){
                        System.out.println("You are scissor. Computer is paper. You won.");
                        userWin++;
                    } 
                    else if (userTurn == 0 && computerTurn == 1){
                        System.out.println("You are scissor. Computer is rock. You lose.");
                        computerWin++;
                    } 
                    else if (userTurn == 0 && computerTurn == 0) 
                        System.out.println("You are scissor. Computer is scissor too. It is a draw.");
                    break;
                case 1:
                    if (userTurn == 1 && computerTurn == 2){
                        System.out.println("You are rock. Computer is paper. You won.");
                        userWin++;
                    } 
                    else if (userTurn == 1 && computerTurn == 0){
                        System.out.println("You are rock. Computer is scissor. You lose.");
                        computerWin++;
                    } 
                    else if (userTurn == 1 && computerTurn == 1) System.out.println("You are rock. Computer is rock too. It is a draw.");
                    break;
                case 2:
                    if (userTurn == 2 && computerTurn == 1){
                        System.out.println("You are paper. Computer is rock. You won.");
                        userWin++;
                    } 
                    else if (userTurn == 2 && computerTurn == 0){
                        System.out.println("You are paper. Computer is scissor. You lose.");
                        computerWin++;
                    } 
                    else if (userTurn == 2 && computerTurn == 2) System.out.println("You are paper. Computer is paper too. It is a draw.");
                    break;
                default:
                    System.out.println("Invalid Input!!");
                    break;
            }
            System.out.println("User win" + userWin);
            System.out.println("Computer win: " + computerWin);
        }

        if (userWin == 2){
            System.out.println("You Won!! Congratulations");
        }
        else{
            System.out.println("You Lose! Computer Win. Well Played");
        }
        
        input.close();
    }
}
