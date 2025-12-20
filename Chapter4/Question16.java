/*
Write a program that displays a random uppercase letter using the Math.random() method.
*/
package Chapter4;

public class Question16 {
    public static void main(String[] args){
        // Generate random number
        int number = (int) (65 + Math.random() * (90 - 65 + 1));

        // Explicit typecasting int to character
        char randomLetter = (char) number;
        
        // Display the letter
        System.out.println(randomLetter);
    }
}
