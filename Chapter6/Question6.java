/*
Write a method to display a pattern as follows:
...
              1
            2 1
          3 2 1
n n-1 ... 3 2 1
The method header is public static void displayPattern(int n)
*/
package Chapter6;
import java.util.Scanner;

public class Question6 {
    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < (n - i); space++) {
                System.out.print("  ");
            }
            for (int num = i; num >= 1; num--) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        displayPattern(n);

        input.close();
    }
}
