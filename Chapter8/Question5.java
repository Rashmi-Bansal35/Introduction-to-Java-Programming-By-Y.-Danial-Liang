/*
Write a method to add two matrices. The header of the method is as follows:
        public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the same or compatible types of elements. Let c be the resulting matrix. Each element cij is aij + bij. For example, for two 3 * 3 matrices a and b, c is
(a11 a12 a13            (b11 b12 b13               (a11 + b11  a12 + b12  a13 + b13
a21 a22 a23      +       b21 b22 b23        =       a21 + b21  a22 + b22  a23 + b23    
a31 a32 a33)             b31 b32 b33)               a31 + b31  a32 + b32  a33 + b33)
Write a test program that prompts the user to enter two 3 * 3 matrices and displays their sum.
*/

package Chapter8;
import java.util.Scanner;

public class Question5 {
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] sumMatrix = new double[3][3];
        for(int i = 0; i < sumMatrix.length; i++){
            for(int j = 0; j < sumMatrix[i].length; j++){
                sumMatrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return sumMatrix;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];

        System.out.print("Enter matrix1: ");
        for (int i = 0 ; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                b[i][j] = input.nextDouble();
            }
        }

        double[][] c = addMatrix(a, b);

        System.out.println("The matrices are added as follows");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("%4.1f ", a[i][j]);
            }
            if (i == 1) {
                System.out.print("  +   ");
            } else {
                System.out.print("      ");
            }
            for(int j = 0; j < 3; j++) {
                System.out.printf("%4.1f ", b[i][j]);
            }
            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            for(int j = 0; j < 3; j++) {
                System.out.printf("%4.1f ", c[i][j]);
            }
            System.out.println();
        }

        input.close();
    }
}
