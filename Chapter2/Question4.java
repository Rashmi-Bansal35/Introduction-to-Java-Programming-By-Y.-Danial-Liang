/*
Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it to kilograms,
and displays the result. One pound is 0.454 kilograms. 
*/

package Chapter2;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nmber in pounds: ");
        double pounds = input.nextDouble();
        double onePound = 0.454;
        double poundsInKg = pounds * onePound;
        System.out.println(pounds+ " pounds is " +poundsInKg+ " kilograms.");
        input.close();
    }
}
