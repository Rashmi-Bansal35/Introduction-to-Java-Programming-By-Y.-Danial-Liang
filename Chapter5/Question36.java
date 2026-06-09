/*
Use loops to simplify Programming Exercise 3.9. From Chapter 3  -> Question9.java
*/

package Chapter5;
import java.util.Scanner;

public class Question36 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int digits = input.nextInt();
        int copy = digits;

        int checksum = 0, i = 9;

        while(digits != 0){
            int number = digits % 10;
            digits /= 10;
            checksum = checksum + (number * i);
            i--;
        }

        checksum %= 11;
        if (checksum == 10){
            System.out.println("The ISBN-10 number is " + copy + "X");
        }
        else{
            System.out.printf("The ISBN- 10 number is %09d%d", copy, checksum);
        }
        input.close();
    }
}
