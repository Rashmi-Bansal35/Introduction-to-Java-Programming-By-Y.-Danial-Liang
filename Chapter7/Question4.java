/*
Write a program that reads an unspecified number of scores and determines how many scores are above or equal to the average and how many scores are below the average. Enter a negative number to signify  the end of the input. Assume that the maximum number of scores is 100.
*/

package Chapter7;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int belowAvg = 0, aboveAvg = 0, total = 0, sum = 0;
        int[] scores = new int[100];
        System.out.print("Enter scores: ");
        while(true){
            int number = input.nextInt();
            if (number < 0 || total == 100){
                break;
            }
            else{
                scores[total] = number;
                sum += scores[total];
                total++;
            }
        }

        double avg = (double) sum / total;
        for (int i = 0; i < total; i++){
            if (scores[i] < avg){
                belowAvg++;
            }
            else{
                aboveAvg++;
            }
        }

        System.out.println("Number of below average students: " +belowAvg + ". \nNumber of above average students: " +aboveAvg);

        input.close();
    }
}
