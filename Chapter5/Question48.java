/*
Write a program that prompts the user to enter a string and displays the characters at odd positions.
*/

package Chapter5;
import java.util.Scanner;

public class Question48 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String oddPlaceString = "";

        for(int i = 0; i < str.length(); i += 2){
            oddPlaceString = oddPlaceString + str.charAt(i);
        }

        System.out.println(oddPlaceString);

        input.close();
    }
}
