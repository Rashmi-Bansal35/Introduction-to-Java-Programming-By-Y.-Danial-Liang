/*
Write a program that prompts the user to enter the month and year and displays the number of days in the month. For example, if the user entered month 2 and year 2012, the program should display that February 2012 had 29 days. If the user entered month 3 and year 2015, the program should display that March 2015 had 31 days.
*/

package Chapter3;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String monthName = " ";
        int days = 0;

        // Prompt the user to enter month and year
        System.out.print("Enter month: ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Assign month name and days in month according to input 
        switch(month){
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                if(((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) == true) days = 29;
                else days = 28;
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
            default:
                System.out.println("Invalid maonth!!");
        }

        System.out.println(monthName + " " + year + " had " + days + " days");


        // Close the Scanner
        input.close();
    }
}
