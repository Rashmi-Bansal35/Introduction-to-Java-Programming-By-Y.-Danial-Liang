/*
Assume letters A, E, I, O, and U as the vowels. Write a program that prompts the user to enter a string and displays the number of vowels and consonants in the string.
*/

package Chapter5;
import java.util.Scanner;

public class Question49 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        str = str.toLowerCase();

        int noOfVowels = 0, noOfConsonant = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    noOfVowels++;
                }
                else {
                    noOfConsonant++;
                }
            }
        }

        System.out.println("The number of vowels is " + noOfVowels);
        System.out.println("The number of consonants is " + noOfConsonant);

        input.close();
    }
}
