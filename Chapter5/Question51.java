/*
Write a program that prompts the user to enter two strings and displays the largest common prefix of the two strings.
*/

package Chapter5;
import java.util.Scanner;

public class Question51 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        String common_prefix = "";

        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                common_prefix += str1.charAt(i);
            } else {
                break;
            }
        }

        if (common_prefix.length() > 0){
            System.out.println("The common prefix is " + common_prefix);
        }
        else {
            System.out.println(str1 + " and " + str2 + " have no common prefix");
        }
        
        input.close();
    }
}
