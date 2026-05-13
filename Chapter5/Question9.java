/*
Write a program that prompts the user to enter the number of students and each student’s name and score, and finally displays the student with the highest score and the student with the second-highest score.
*/

package Chapter5;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int no_of_students = input.nextInt();
        input.nextLine();

        double highestScore = -1;
        String highestName = "";

        double secondHighestScore = -1;
        String secondName = "";

        for (int i = 0; i < no_of_students; i++){
            System.out.print("Enter the name of student: ");
            String name = input.nextLine();

            System.out.print("Enter the score of student: ");
            double score = input.nextDouble();
            input.nextLine();
            if (score > highestScore){
                secondHighestScore = highestScore;
                secondName = highestName;

                highestName = name;
                highestScore = score;
            }
            else if (score > secondHighestScore){
                secondHighestScore = score;
                secondName = name;
            }
        }
        System.out.println("The student with highest score is " +highestName+ " has score "+ highestScore);
        System.out.println("The student with second highest score is " +secondName+ " has score "+ secondHighestScore);

    }
}
