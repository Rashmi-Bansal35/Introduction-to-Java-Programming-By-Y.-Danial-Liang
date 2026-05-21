/*
Write two overloaded methods that return the average of an array with the following headers:
        public static int average(int[] array)
        public static double average(double[] array)
Write a test program that prompts the user to enter ten double values, invokes this method, and displays the average value.
*/
package Chapter7;
import java.util.Scanner;

public class Question8 {
    public static int average(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        int average = sum / array.length;
        return average;
    }

    public static double average(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        double average = sum / array.length;
        return average;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];
        System.out.print("Enter ten values: ");
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        System.out.println("The average is " + String.format("%.2f", average(array)));

        input.close();
    }
}
