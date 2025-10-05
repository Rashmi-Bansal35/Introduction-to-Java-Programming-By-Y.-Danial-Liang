/*
Write a program that prompts the user to enter an integer between 0 and 15 and displays its corresponding hex number.
*/

package Chapter4;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter a decimal value (0 - 15): ");
        int number = input.nextInt();

        String hexadecimal = "";
        // Convert in hexdecimal number
        if(number >= 0 && number <= 15){
            if(number >= 0 && number <= 9){
                hexadecimal = number + "";
            }
            else if(number >= 10 && number <= 15){
                switch(number){
                    case 10:
                        hexadecimal = "A";
                        break;
                    case 11:
                        hexadecimal = "B";
                        break;
                    case 12:
                        hexadecimal = "C";
                        break;
                    case 13:
                        hexadecimal = "D";
                        break;
                    case 14:
                        hexadecimal = "E";
                        break;
                    case 15:
                        hexadecimal = "F";
                        break;
                }
            }
            // Display the result
            System.out.println("The hex decimal is " +hexadecimal);
        }
        else {
            System.out.println(number + " is invalid input");
        }

        // Close the Scanner
        input.close();
    }
}
