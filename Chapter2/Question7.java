/*
Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and days for the minutes. 
For simplicity, assume a year has 365 days. 
*/
package Chapter2;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minutes: ");
        long minutes = input.nextInt();
        int daysIn1year = 365;
        int minutes_in_day = 24 * 60;
        long days = minutes / minutes_in_day;
        long years = days / daysIn1year;
        long remaining_days = days % daysIn1year;
        
        System.out.println(minutes+ " minutes is approximately " +years+ " years and " +remaining_days+ " days.");
        input.close();
    }
}
