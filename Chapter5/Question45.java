/*
In business applications, you are often asked to compute the mean and standard deviation of data. The mean is simply the average of the numbers. The standard deviation is a statistic that tells you how tightly all the various data are clustered around the mean in a set of data.
For example, what is the average age of the students in a class? How close are the ages? If all the students are the same age, the deviation is 0. Write a program that prompts the user to enter ten numbers, and displays the mean and standard deviations of these numbers.
*/

package Chapter5;
import java.util.Scanner;

public class Question45 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double sum = 0, mean = 0;
        double square = 0, std_deviation = 0;
        int i = 1;

        System.out.print("Enter ten numbers: ");
        while(i <= 10){
            double number = input.nextDouble();
            sum += number;
            square += Math.pow(number, 2);
            i++;
        }

        mean = sum / 10;
        double sqOfSum_by_n = Math.pow(sum, 2) / 10;
        double numerator = square - sqOfSum_by_n;
        std_deviation = Math.sqrt(numerator / 9);

        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + std_deviation);

        input.close();
    }
}
