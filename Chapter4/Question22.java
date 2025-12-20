/*
Write a program that prompts the user to enter two strings and reports whether the second string is a substring of the first string.
*/

package Chapter4;
import java.util.Scanner;

public class Question22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two strings
        System.out.print("Enter string 1: ");
        String str = input.nextLine();
        System.out.print("Enter string 2: ");
        String subStr = input.nextLine();

        // Store value if string 2 is substring of string 1
        boolean isSubString = str.contains(subStr);

        // Display the result
        if (isSubString == true){
            System.out.println(subStr + " is a substring of " + str);
        }
        else {
            System.out.println(subStr + " is not a substring of " + str);
        }

        // Close the Scanner
         input.close();
    }
}
