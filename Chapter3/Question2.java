/*
The program in Listing 3.1, AdditionQuiz.java, generates two integers and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to enter the sum of these three integers.
*/

package Chapter3;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() / 8 % 10);

        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");

        int answer = input.nextInt();
        if(number1+number2+number3 == answer){
            System.out.println(number1 + " + " + number2 + " = " + answer + " is correct." );
        }
        else{
            System.out.println(number1 + " + " + number2 + " = " + answer + " is incorrect." );
        }

        input.close();
    }
}
