/*
Write a program that reads an integer and displays all its smallest factors in increasing order. For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
*/

package Chapter5;
import java.util.Scanner;

public class Question16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int i = 2;
        while(number != 1){
            if (number % i == 0){
                System.out.print(i + " ");
                number /= i;
            }
            else{
                i++;
            }
        }

        input.close();
    }
}
