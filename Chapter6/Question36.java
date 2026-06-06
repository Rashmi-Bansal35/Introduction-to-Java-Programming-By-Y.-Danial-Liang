/*
A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for computing the area of a regular polygon is
        Area = (n * s^2) / 4 * tan(pi/n)
Write a method that returns the area of a regular polygon using the following header:
        public static double area(int n, double side)
Write a main method that prompts the user to enter the number of sides and the side of a regular polygon and displays its area.
*/

package Chapter6;
import java.util.Scanner;

public class Question36 {
    public static double area(int n, double side){
        double numenator = n * Math.pow(side, 2);
        double angle = Math.PI / n;
        double denominator = 4 * Math.tan(angle);

        double area = numenator / denominator;
        return area;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of side: ");
        int number_of_sides = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.println("The area of polygon is " + area(number_of_sides, side));

        input.close();
    }
}
