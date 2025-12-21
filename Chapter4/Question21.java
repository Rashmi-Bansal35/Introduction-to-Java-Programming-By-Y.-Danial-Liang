/*
Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD, where D is a digit. Your program should check whether the input is valid. 
*/

package Chapter4;
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a social security number
        System.out.print("Enter a SSN: ");
        String ssn = input.next();

        // Check the length of input
        if (ssn.length() != 11){
            System.out.println(ssn + " is an invalid social security number.");
        }
        else {
            // Check the place of dashes
            boolean dash1 = (ssn.charAt(3) == '-');
            boolean dash2 = (ssn.charAt(6) == '-');

            // Check all other characters are digit
            boolean firstPart = Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(1)) && Character.isDigit(ssn.charAt(2));
            boolean middlePart = Character.isDigit(ssn.charAt(4)) && Character.isDigit(ssn.charAt(5));
            boolean lastPart = Character.isDigit(ssn.charAt(7)) && Character.isDigit(ssn.charAt(8)) && Character.isDigit(ssn.charAt(9)) &&  Character.isDigit(ssn.charAt(10));

            // Check if input is valid or not and display output according to that
            if (dash1 && dash2 && firstPart && middlePart && lastPart){
                System.out.println(ssn + " is a valid social security number");
            }
            else {
                System.out.println(ssn + " is an invalid social security number");
            }
        }

        // Close the Scanner
        input.close();
    }
}
