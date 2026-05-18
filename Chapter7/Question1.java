/*
Write a program that reads student scores, gets the best score, and then assigns grades based on the following scheme:
    Grade is A if score is >= best- 10
    Grade is B if score is >= best- 20;
    Grade is C if score is >= best- 30;
    Grade is D if score is >= best- 40;
    Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts the user to enter all of the scores, and concludes by displaying the grades.
*/

package Chapter7;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int noOfStudents = input.nextInt();

        System.out.print("Enter " + noOfStudents+ " scores: ");
        int[] scores = new int[noOfStudents];
        for (int i = 0; i < noOfStudents; i++){
            scores[i] = input.nextInt();
        }

        int best = 0;
        char grade = 'Z';

        for (int i = 0; i < scores.length; i++){
            if (scores[i] > best){
                best = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++){
            if (scores[i] >= (best - 10)){
                grade = 'A';
            }
            else if (scores[i] >= (best - 20)){
                grade = 'B';
            }
            else if (scores[i] >= (best - 30)){
                grade = 'C';
            }
            else if (scores[i] >= (best - 40)){
                grade = 'D';
            }
            else {
                grade = 'F';
            }
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }

        input.close();
    }
}
