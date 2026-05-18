/*
Write a program that reads ten integers and displays them in the reverse of the order in which they were read.
*/

package Chapter7;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] integers = new int[10];
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < integers.length; i++){
            integers[i] = input.nextInt();
        }

        System.out.print("The reverse order is: ");
        for (int i = integers.length - 1; i >= 0; i--){
            System.out.print(integers[i] + " ");
        }

        input.close();
    }
}
