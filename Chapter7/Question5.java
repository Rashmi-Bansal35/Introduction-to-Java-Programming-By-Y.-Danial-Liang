/*
Write a program that reads in ten numbers and displays the number of distinct numbers and the distinct numbers separated by exactly one space (i.e., if a number appears multiple times, it is displayed only once). (Hint: Read a number and store it to an array if it is new. If the number is already in the array, ignore it.) After the input, the array contains the distinct numbers
*/
package Chapter7;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int index = 0;
        boolean distict = true;
        int[] array = new int[10];

        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < array.length; i++){
            int number = input.nextInt();
            for(int j = 0; j < index; j++){
                if (number == array[j]){
                    distict = false;
                    break;
                } 
            }
            if (distict == true){
                array[index] = number;
                index++;
            }
        }

        System.out.println("The number of distict numbers are: " +index);

        System.out.print("The distict numbers are: ");
        for(int i = 0; i < index; i++){
            System.out.print(array[i] + " ");
        }
        input.close();
    }
}
