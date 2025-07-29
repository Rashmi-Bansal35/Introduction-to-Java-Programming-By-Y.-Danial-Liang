package Chapter1;
/*
Write a program that displays the area and perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
formula:
area = width * height
 */
public class Question9 {
    public static void main(String[] args){
        double width = 4.5;
        double height = 7.9;
        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("The area of rectangle is " +area+ ".\nThe perimeter of rectangle is " +perimeter+ ".");
    }
}
