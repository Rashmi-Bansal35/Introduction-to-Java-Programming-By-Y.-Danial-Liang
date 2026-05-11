/*
Write a program that reads an unspecified number of integers, determines how many positive and negative values have been read, and computes the total and average of the input values (not counting zeros). Your program ends with the input 0. Display the average as a floating-point number.
*/
package Chapter5;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, input ends if it is 0: ");
        int count = 0, neg = 0, pos = 0;
        float sum = 0;
        while (true){
            int num = input.nextInt();
            if (num < 0){
                neg++;
            }
            else if(num > 0){
                pos++;
            }
            else if(num == 0){
                break;
            }
            sum += num;
            count++;
        }
        float avg = sum / count;
        System.out.println("The number of positives are: " + pos);
        System.out.println("The numbers of negatives are: " + neg);
        System.out.println("The total is: " + sum);
        System.out.println("The average is " + avg);

        input.close();
    }
}
