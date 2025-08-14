/*
Given an airplane’s acceleration a and take-off speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
length = (v*v) / 2a
Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in meters/second square (m/s2), and
displays the minimum runway length. 
*/

package Chapter2;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed in m/s: ");
        double v = input.nextDouble();
        System.out.print("Enter the acceleration in m/s^2: ");
        double a = input.nextDouble();

        double length = Math.pow(v, 2) / (2 * a);
        System.out.printf("The minimum runway length for this airplane is %.3f",length);
        input.close();
    }
}
