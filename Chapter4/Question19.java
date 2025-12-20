/*
Rewrite the Programming Exercise" 3.9 by entering the ISBN number as a string.
*/

package Chapter4;
import java.util.Scanner;

public class Question19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter first 9 digits
        System.out.print("Enter the first 9 digits of an ISBN as string: ");
        String number = sc.nextLine();
        

        // Close the Scanner
        sc.close();
    }
}
