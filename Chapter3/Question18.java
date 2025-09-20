/*
A shipping company uses the following function to calculate the cost (in dollars) of shipping based on the weight of the package (in pounds).

       { 3.5, if 0 < w <= 1
c(w)=  { 5.5, if 1 < w <= 3
       { 8.5, if 3 < w <= 10
       { 10.5, if 10 < w <= 20

Write a program that prompts the user to enter the weight of the package and display the shipping cost. If the weight is greater than 20, display a message “the package cannot be shipped.”
*/

package Chapter3;
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the weight of package: ");
        double weight = input.nextDouble();

        // Check the condition
        if(weight > 20){
            System.out.println("The package cannot be shipped.");
        }
        else{
            if(weight > 0 && weight <= 1){
                System.out.println("The shipping cost is: " +3.5);
            }
            else if(weight <= 3){
                System.out.println("The shipping cost is: " +5.5);
            }
            else if(weight <= 10){
                System.out.println("The shipping cost is: " +8.5);
            }
            else if(weight <= 20){
                System.out.println("The shipping cost is: " +10.5);
            }
        }
        // Close the Scanner
        input.close();
    }
}
