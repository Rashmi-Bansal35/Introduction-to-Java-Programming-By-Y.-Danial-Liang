/*
Write a method that returns the index of the smallest element in an array of integers. If the number of such elements is greater than 1, return the smallest index. Use the following header:
        public static int indexOfSmallestElement(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this method to return the index of the smallest element, and displays the index.
*/
package Chapter7;
import java.util.Scanner;

public class Question10 {
    public static int indexOfSmallestElement(double[] array){
        double smallest = array[0];
        for(int i = 1; i < array.length; i++){
            if (smallest > array[i]){
                smallest = array[i];
            }
        }
        for(int i = 0; i < array.length; i++){
            if (smallest == array[i]){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];
        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        System.out.println("The index of smallest number is: " +indexOfSmallestElement(array));
        input.close();
    }
}
