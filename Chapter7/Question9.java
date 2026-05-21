/*
Write a method that finds the smallest element in an array of double values using the following header:
        public static double min(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this method to return the minimum value, and displays the minimum value.
*/
package Chapter7;
import java.util.Scanner;

public class Question9 {
    public static double min(double[] array){
        double smallest = array[0];
        for(int i = 1; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];
        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        System.out.println("The minimum value is: " +min(array));

        input.close();
    }
}
