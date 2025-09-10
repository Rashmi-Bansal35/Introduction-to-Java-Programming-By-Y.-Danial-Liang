/*
An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, which is calculated from the other nine digits using the following formula:
(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention. Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros). Your program should read the input as an integer.
*/

package Chapter3;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter first 9 digits
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int digits = input.nextInt();
        int copy = digits;

        // Find values of digits upto 9
        int d9 = digits % 10;
        digits = digits / 10;
        int d8 = digits % 10;
        digits = digits / 10;
        int d7 = digits % 10;
        digits = digits / 10;
        int d6 = digits % 10;
        digits = digits / 10;
        int d5 = digits % 10;
        digits = digits / 10;
        int d4 = digits % 10;
        digits = digits / 10;
        int d3 = digits % 10;
        digits = digits / 10;
        int d2 = digits % 10;
        digits = digits / 10;
        int d1 = digits % 10;


        // Calculate value of d10
        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if(checksum == 10){
            System.out.printf("The ISBN-10 number is %09dX", copy);
        }
        else{
            System.out.printf("The ISBN-10 number is %09d%d", copy, checksum);
        }

        // Close the Scanner
        input.close();
    }
}
