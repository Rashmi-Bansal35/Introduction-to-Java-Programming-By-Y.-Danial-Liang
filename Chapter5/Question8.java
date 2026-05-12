/*
Write a program that prompts the user to enter the number of students and each student’s name and score, and finally displays the name of the student with the highest score.
*/
package Chapter5;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int no_of_students = input.nextInt();

        double highestMarks = -1;
        String highestName = "";

        input.nextLine();
        for (int i = 0; i < no_of_students; i++){
            System.out.print("Enter the name of student: ");
            String name = input.nextLine();

            System.out.println("Enter the score of student: ");
            double score = input.nextDouble();

            input.nextLine();

            if (highestMarks < score){
                highestMarks = score;
                highestName = name;
            }
        }
        System.out.println("The student with highest score is " + highestName);
        System.out.println("Highest Score: " + highestMarks);
        
        input.close();
    }
}
