/*
Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:
perimeter= 2 * radius * pi
area = radius * radius * pi
 */

package Chapter1;

public class Question8 {
    public static void main(String[] args){
        double radius = 5.5;
        double perimeter = 2 * radius * 3.14;
        double area = radius * radius * 3.14;

        System.out.println("The perimeter of circle is " +perimeter+ "." +"\nThe area of circle is " +area+ ".");
    } 
}
