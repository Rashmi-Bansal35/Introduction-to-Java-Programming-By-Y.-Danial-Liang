/*
Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question. Revise the program to randomly generate an addition question with two integers less than 100. 
*/
package Chapter3;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // 𝘎𝘦𝘯𝘦𝘳𝘢𝘵𝘦 𝘵𝘸𝘰 𝘳𝘢𝘯𝘥𝘰𝘮 𝘥𝘪𝘨𝘪𝘵 𝘯𝘶𝘮𝘣𝘦𝘳𝘴
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        System.out.print("What is " + number1 + " + " + number2 + "? ");

        // Input the answer 
        int answer = input.nextInt();

        //⁡⁣⁢⁣ ‍‍Grade the answer and display the result
        if(number1 + number2 == answer){
            System.out.println("You are correct.");
        }
        else{
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + "+" + number2 + " should be " + (number1 + number2));
        }
        // Close the Scanner
        input.close();
    }
}
