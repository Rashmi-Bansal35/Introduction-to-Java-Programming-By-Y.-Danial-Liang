/*
Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4). The intersecting point of the two lines can be found by solving the following linear equation:
    (y1- y2)x - (x1- x2)y = (y1- y2)x1 - (x1- x2)y1
    (y3- y4)x - (x3- x4)y = (y3- y4)x3 - (x3- x4)y3
This linear equation can be solved using Cramer’s rule (see Programming Exercise 3.3). If the equation has no solutions, the two lines are parallel. Write a program that prompts the user to enter four points and displays the intersecting point.

Cramer's rule:
    ax + by= e , cx + dy= f so x = (ed- bf)/(ad- bc) and y = (af- ec)/(ad- bc)
*/

package Chapter3;
import java.util.Scanner;

public class Question25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter four points
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        double x3 = input.nextDouble(), y3 = input.nextDouble();
        double x4 = input.nextDouble(), y4 = input.nextDouble();
        double x = 0, y = 0;

        // Calculate the value of a, b, c, d, e, f
        double a = y1 - y2, b = x1 - x2, e = (y1- y2)*x1 - (x1- x2)*y1;
        double c = y3 - y4, d = x3 - x4, f = (y3- y4)*x3 - (x3- x4)*y3;

        // Check lines are parallel or not
        if (a*d - b*c == 0){
            System.out.println("The two lines are parallel.");
        }
        else{
            x = (e*d- b*f)/(a*d- b*c);
            y = (a*f- e*c)/(a*d- b*c);
            System.out.println("The intersectiong point is at (" +x+ ", " +y+ ")");
        }

        // Close the Scanner
        input.close();
    }
}
