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

        // Check the length of input
        if (hexadecimal.length() != 1){
            System.out.println("Invalid Input!! Please enter one only one character.");
        }
        else {
            // Convert to uppercase
            char ch = Character.toUpperCase(hexadecimal.charAt(0));
            String binary = "";

            // Check if character is valid and assign the value according to it
            if ((ch >= 'A' && ch <= 'F') || (ch >= '0' && ch <= '9')){
                switch (ch){
                    case '0':
                        binary = "0000";
                        break;
                    case '1':
                        binary = "0001";
                        break;
                    case '2':
                        binary = "0010";
                        break;
                    case '3':
                        binary = "0011";
                        break;
                    case '4':
                        binary = "0100";
                        break;
                    case '5':
                        binary = "0101";
                        break;
                    case '6':
                        binary = "0110";
                        break;
                    case '7':
                        binary = "0111";
                        break;
                    case '8':
                        binary = "1000";
                        break;
                    case '9':
                        binary = "1001";
                        break;
                    case 'A':
                        binary = "1010";
                        break;
                    case 'B':
                        binary = "1011";
                        break;
                    case 'C':
                        binary = "1100";
                        break;
                    case 'D':
                        binary = "1101";
                        break;
                    case 'E':
                        binary = "1110";
                        break;
                    case 'F':
                        binary = "1111";
                        break;
                }
                // Display the result
                System.out.println("The binary number is " + binary);
            }
            else {
                // Display if input is invalid
                System.out.println(ch + " is an invlaid input.");
            }
        }

        // Close the Scanner
        input.close();
    }
}
