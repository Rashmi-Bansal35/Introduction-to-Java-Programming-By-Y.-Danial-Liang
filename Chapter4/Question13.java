package Chapter4;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter input
        System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);
        char value = Character.toLowerCase(ch);

        // Check if input is consonant or vowel
        if (value >= 'a' && value <= 'z'){
            if(value == 'a'|| value == 'e'|| value == 'i'||  value == 'o'|| value == 'u'){
                System.out.println(ch + " is a vowel");
            }
            else{
                System.out.println(ch + " is a consonent");
            }
        }
        else{
            System.out.println(ch + " is an invalid input");
        }
        
        // Close the Scanner
        input.close();
    }
}
