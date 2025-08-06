/*
Write a program that reads a number in feet, converts it to meters, and displays the result. One foot is 0.305 meter.
*/

package Chapter2;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value in feet: ");
        double feet = input.nextDouble();
        double oneFootInMeter = 0.305;
        double footInMeter = feet * oneFootInMeter;
        System.out.println(feet + " feet is " +footInMeter+ " meters.");
        input.close();
    }
}
