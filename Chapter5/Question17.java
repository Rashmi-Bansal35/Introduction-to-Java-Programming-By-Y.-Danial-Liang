/*
Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid, as shown in the following sample run:
Enter the number of lines: 7
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
  6 5 4 3 2 1 2 3 4 5 6
7 6 5 4 3 2 1 2 3 4 5 6 7
*/

package Chapter5;
import java.util.Scanner;

public class Question17 {
    public static void main(String args[]){
        // Create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter input
        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++){
            for (int j = i; j >= i + 1; j--){
              System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
              System.out.print(j);
            }
            System.out.println();
        }

        input.close();
    }
}
