/*
Average acceleration is defined as the change of velocitydivided by the time taken to make the change, as shown in the following 
formula:
a = (v1- v0) / t
Write a program that prompts the user to enter the starting velocity v0 in meters/second, the ending velocity v1 in meters/second, and 
the time span t in seconds, and displays the average acceleration.
*/
package Chapter2;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        double initialVelocity = input.nextDouble();
        double finalVelocity = input.nextDouble();
        double time = input.nextDouble();

        double acceleration = (finalVelocity - initialVelocity) / time;
        System.out.println("The avg acceleration is " +acceleration);
        input.close();
    }
}
