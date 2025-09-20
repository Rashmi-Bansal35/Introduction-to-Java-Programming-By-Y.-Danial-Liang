/*
Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise, display that the input is invalid. The input is valid if the sum of every pair of two edges is greater than the remaining edge.
*/

package Chapter3;
import java.util.Scanner;

public class Question19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double perimeter = 0;

        // Prompt the user to enter three vertices of triangle
        System.out.print("Enter three vertices of triangle: ");
        double vertex1 = input.nextDouble();
        double vertex2 = input.nextDouble();
        double vertex3 = input.nextDouble();

        // Calculate sum of two vertices
        double sum12 = vertex1 + vertex2;
        double sum23 = vertex2 + vertex3;
        double sum13 = vertex1 + vertex3;

        // Check if input is valid
        if((sum12 > vertex3) && (sum23 > vertex1) && (sum13 > vertex2)){
            perimeter = vertex1 + vertex2 + vertex3;
            System.out.println("The perimeter of triangle is: " +perimeter);
        }
        else{
            System.out.println("Input is invalid.");
        }

        // Close the Scanner
        input.close();
    }
}
