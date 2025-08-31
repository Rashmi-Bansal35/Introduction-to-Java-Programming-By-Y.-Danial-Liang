/*
Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.
*/
package Chapter3;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter three integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Sort the numbers
        if(number1 < number2 && number1 < number3){
            if(number2 < number3){
                System.out.println(number1+ " " + number2 + " " + number3);
            }
            else{
                System.out.println(number1+ " " + number3 + " " + number2);
            }
        }
        if(number2 < number1 && number2 < number3){
            if(number1 < number3){
                System.out.println(number2+ " " + number1 + " " + number3);
            }
            else{
                System.out.println(number2+ " " + number3 + " " + number1);
            }
        }
        if(number3 < number2 && number3 < number1){
            if(number2 < number1){
                System.out.println(number3+ " " + number2 + " " + number1);
            }
            else{
                System.out.println(number3+ " " + number1 + " " + number2);
            }
        }

        // Close the Scanner
        input.close();
    }
}
