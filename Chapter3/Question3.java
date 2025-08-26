/*
A linear equation can be solved using Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts the user to 
enter a, b, c, d, e, and f and displays the result. If ad- bc is 0, report that “The equation has no solution.”
        Cramer's rule:
ax + by= e , cx + dy= f so x = (ed- bf)/(ad- bc) and y = (af- ec)/(ad- bc)
*/

package Chapter3;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt user to enter values
        System.out.print("Enter value of a, b, c, d, e and f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // Calculate denominator
        double denominator = (a * d) - (b * c);

        // Check if denomintor is zero or not
        if(denominator == 0){
            System.out.println("The equation has no solution.");
        }
        else{
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x is " +x+ " and y is " +y);
        }

        // Close the Scanner
        input.close();
    }
}
