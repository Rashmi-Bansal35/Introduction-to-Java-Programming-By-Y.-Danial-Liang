/*
You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
ax + by= e , cx + dy= f so x = (ed- bf)/(ad- bc) and y = (af- ec)/(ad- bc)
Write a program that solves the following equation and displays the value for x and y:
3.4x + 50.2y = 44.5 and 2.1x + .55y = 5.9
a = 3.4 , b = 50.2 , e = 44.5 , c = 2.1 , d = 0.55 , f = 5.9
*/

package Chapter1;

public class Question13 {
    public static void main(String[] args){
        double x = (44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1);
        double y = (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1);

        System.out.printf("The value of x is %.3f.\nThe value of y is %.3f.", x, y);
    }
}
