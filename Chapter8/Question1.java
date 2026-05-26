/*
Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:
        public static double sumColumn(double[][] m, int columnIndex)
Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
*/
package Chapter8;
import java.util.Scanner;

public class Question1 {
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;

        for(int i = 0; i < m.length; i++){
            sum += m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[][] m = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++){
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m, i));
        }

        input.close();
    }
}
