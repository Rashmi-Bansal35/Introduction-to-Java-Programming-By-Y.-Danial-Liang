package Chapter4;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter input
        System.out.print("Enter a letter: ");
        String str = input.next().toLowerCase();
        char value = str.charAt(0);

        // Check if input is consonant or vowel
        if(value == 'a'|| value == 'e'|| value == 'i'||  value == 'o'|| value == 'u'){
            System.out.println("Input value is vowel");
        }
        else{
            System.out.println("Input value is consonent");
        }

        // Close the Scanner
        input.close();
    }
}
