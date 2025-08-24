/*
 The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained using the following formula:
 r1 = (-b + √(b^2 - 4ac)) / 2a   and   r2 = (-b - √(b^2 - 4ac)) / 2a

b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots. 
If it is zero, the equation has one root. If it is negative, the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. If the 
discriminant is positive, display two roots. If the discriminant is 0, display one root. Otherwise, display “The equation has no real roots”.
Note that you can use Math.pow(x, 0.5) to compute 2x. 
*/

package Chapter3;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double r1, r2;

        // Prompt the user to enter three values from equation
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Calculate discriminant using given formula
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        // Check the value of discriminant
        if(discriminant > 0){
            r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has two roots " +r1+ " and " + r2);
        }
        else if(discriminant == 0){
            r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has one root " +r1);
        }
        else{
            System.out.println("The equation has no real roots.");
        }

        // Close the Scanner
        input.close();
    }
}
