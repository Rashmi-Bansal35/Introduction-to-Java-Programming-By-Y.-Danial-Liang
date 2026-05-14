/*
A pentagonal number is defined as n(3n–1)/2 for n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . . Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
Write a test program that uses this method to display the first 100 pentagonal numbers with 10 numbers on each line.
*/
package Chapter6;

public class Question1 {
    public static int getPentagonalNumber(int n){
        return n * (3 * n - 1) / 2;
    }
    public static void main(String[] args){
        int n = 100;
        int count = 0; 
        int i = 1;
        while (i <= n){
            System.out.print(String.format("%-7d",getPentagonalNumber(i)));
            count++;
            i++;

            if (count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
}