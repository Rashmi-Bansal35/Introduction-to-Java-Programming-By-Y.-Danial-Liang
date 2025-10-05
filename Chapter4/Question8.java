/*
Write a program that receives an ASCII code (an integer between 0 and 127) and displays its character.
*/

package Chapter4;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter ASCII code
        System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();

        char value = 'a';

        // Type cast the input in character
        if(code > 0 && code < 127){
            value = (char)code;
        }
        else{
            System.out.println("Wrong input");
        }

        // Display the result
        System.out.printf("The character for ASCII code %d is %c\n", code, value);

        // Close the Scanner
        input.close();
    }
}
