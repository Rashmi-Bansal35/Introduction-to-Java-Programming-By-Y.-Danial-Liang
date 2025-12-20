/*
Write a program that prompts the user to enter two characters and displays the major and status represented in the characters. The first character indicates the major and the second is number character 1, 2, 3, 4, which indicates whether a student is a freshman, sophomore, junior, or senior. Suppose the following chracters are used to denote the majors:
M: Mathematics
C: Computer Science
I: Information Technology
*/

package Chapter4;
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter two characters
        System.out.print("Enter two characters: ");
        String str = sc.next();
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);

        String major = null;
        String status = null;

        // Assign major 
        switch (firstChar){
            case 'M':
                major = "Mathematics";
                break;
            case 'C':
                major = "Computer Science";
                break;
            case 'I':
                major = "Information Technology";
        }

        // Assign status on basis of number character
        switch (secondChar){
            case '1':
                status = "Freshman";
                break;
            case '2':
                status = "Sophomore";
                break;
            case '3':
                status = "Junior";
                break;
            case '4':
                status = "Senior";
                break;
        }

        // Display the result
        if (major == null || status == null){
            System.out.println("Invalid Input");
        }
        else {
            System.out.println(major + " " + status);
        }

        // Close the Scanner
        sc.close();
    }
}
