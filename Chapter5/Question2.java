/*
Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction questions. Revise the program to generate ten random addition questions for two integers between 1 and 15. Display the correct count and test time.
*/
package Chapter5;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_QUESTIONS = 10;
        int count = 0;
        int correctCount = 0;
        String output = "";
        long startTime = System.currentTimeMillis();

        while (count < NUMBER_OF_QUESTIONS){
            int number1 = (int)(Math.random() * 15) + 1;
            int number2 = (int)(Math.random() * 15) + 1;

            System.out.println("What is "+ number1 + " + " + number2 + " ?");
            int answer = input.nextInt();

            if (answer == (number1+number2)){
                System.out.println("You are correct!!");
                correctCount++;
            }
            else{
                System.out.println("Your answer is wrong.. \nThe answer should be " +(number1 + number2));
            }

            count++;
            output += "\n" + number1 + "+" + number2 + "=" + answer +((number1 + number2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount +"\nTest time is " + testTime / 1000 + " seconds\n" + output);

        input.close();
    }
}
