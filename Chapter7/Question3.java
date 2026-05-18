/*
Write a program that reads the integers between 1 and 100 and counts the occurrences of each. Assume the input ends with 0.
Note that if a number occurs more than one time, the plural word “times” is used in the output.
*/
package Chapter7;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integers between 1 to 100: ");
        int[] integers = new int[101];
        int number = 0;
        while (true){
            number = input.nextInt();
            if (number != 0){
                integers[number]++;
            }
            else{
                break;
            }
        }

        for (int i = 0; i < integers.length; i++){
            if (integers[i] != 0){
                if (integers[i] > 1){
                    System.out.println(i + " occurs " + integers[i] + " times");
                }
                else{
                    System.out.println(i + " occurs " + integers[i] + " time");
                }   
            }
        }

        input.close();
    }
}
