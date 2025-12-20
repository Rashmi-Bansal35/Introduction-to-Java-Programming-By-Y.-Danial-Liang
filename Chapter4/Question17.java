/*
Write a program that prompts the user to enter a year and the first three letters of a month name (with the first letter in uppercase) and displays the number of days in the month. 
*/

package Chapter4;
import java.util.Scanner;

public class Question17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter year and first three letters of month
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter a month (with the first letter in uppercase): ");
        String month = sc.nextLine();

        boolean isLeapYear = false;
        int days = 0;

        // Check if year is leap year or not
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            isLeapYear = true;
        }

        // Assign days on basis of month
        switch (month){
            case "Jan": 
                days = 31;
                break;
            case "Feb": 
                if (isLeapYear){
                    days = 29;
                }
                else {
                    days = 28;
                }
                break;
            case "Mar": 
                days = 31;
                break;
            case "Apr": 
                days = 30;
                break;
            case "May": 
                days = 31;
                break;
            case "Jun": 
                days = 30;
                break;
            case "Jul": 
                days = 31;
                break;
            case "Aug": 
                days = 31;
                break;
            case "Sep": 
                days = 30;
                break;
            case "Oct": 
                days = 31;
                break;
            case "Nov": 
                days = 30;
                break;
            case "Dec": 
                days = 31;
                break;
        }

        // Display the result
        System.out.println(month + " " + year + " has " + days + " days");

        // Close the Scanner
        sc.close();
    }
}
