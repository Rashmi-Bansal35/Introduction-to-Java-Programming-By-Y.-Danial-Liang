/*
The area of a pentagon can be computed using the following formula:
        Area = (5 * s^2) / (4 * tan(pi / 5)
Write a method that returns the area of a pentagon using the following header:
        public static double area(double side)
Write a main method that prompts the user to enter the side of a pentagon and displays its area. 
*/

package Chapter6;
import java.util.Scanner;

public class Question35 {
    public static double area(double side){
        double numenator = 5 * Math.pow(side, 2);
        double angle = Math.PI / 5;
        double denominator = 4 * Math.tan(angle);

        double area = numenator / denominator;

        return area;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.println("The area of pentagon is " + area(side));

        input.close();
    }
}
