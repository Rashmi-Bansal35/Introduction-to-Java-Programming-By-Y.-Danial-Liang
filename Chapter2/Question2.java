/*
Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas:
area = radius * radius * pi
volume = area * length
*/
package Chapter2;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter length of cylinder: ");
        double length = input.nextDouble();

        final double pi = 3.14;
        double area = radius * radius * pi;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
        input.close();
    }
}
