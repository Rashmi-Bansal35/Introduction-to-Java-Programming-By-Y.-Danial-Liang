/*
Write a program that prompts the user to enter a letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2, 1, or 0.
*/

package Chapter4;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter input from the user
        System.out.print("Enter a letter grade: ");
        char value = input.next().charAt(0);
        char grade = Character.toUpperCase(value);
        int numericValue;

        // Assign numeric value based on grade input
        switch(grade){
            case 'A':
                numericValue = 4;
                break;
            case 'B':
                numericValue = 3;
                break;
            case 'C':
                numericValue = 2;
                break;
            case 'D':
                numericValue = 1;
                break;
            case 'E':
                numericValue = 0;
                break;
            default:
                numericValue = 10;
        }

        // Display the result based on the assigned numeric value 
        if (numericValue == 10){
            System.out.println(value + " is an invalid input");
        }
        else{
            System.out.println("The numeric value for Grade " + grade + " is " + numericValue);
        }

        // Close the Scanner
        input.close();
    }
}
