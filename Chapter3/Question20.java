/*
Programming Exercise 2.17 gives a formula to compute the wind-chill temperature. The formula is valid for temperatures in the range between +58ºF and 41ºF and wind speed greater than or equal to 2. Write a program that prompts the user to enter a temperature and a wind speed. The program displays the wind-chill temperature if the input is valid; otherwise, it displays a message indicating whether the temperature and/or wind speed is invalid.
*/

package Chapter3;
import java.util.Scanner;

public class Question20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the wind speed
        System.out.print("Enter the wind speed: ");
        double speed = input.nextDouble();

        // Prompt the user to enter the temperature
        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();

        
    }
}
