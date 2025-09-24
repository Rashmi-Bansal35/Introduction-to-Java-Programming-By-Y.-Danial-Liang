/*
Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is
    h = ( q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j) ) % 7
where
■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).
■ q is the day of the month.
■ m is the month (3: March, 4: April, …, 12: December). January and February are counted as months 13 and 14 of the previous year.
■ j is the century (i.e., year / 100 ).
■ k is the year of the century (i.e., year % 100).
Note that the division in the formula performs an integer division. Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week. 
(Hint: January and February are counted as 13 and 14 in the formula, so you need to convert the user input 1 to 13 and 2 to 14 for the month and change the year to the previous year.)
*/

package Chapter3;
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the input
        System.out.print("Enter year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month 1-12: ");
        int m = input.nextInt();
        System.out.print("Enter day of the month 1-31: ");
        int q = input.nextInt();

        // Adjust month and year for January and February
        if (m == 1 || m == 2){
            m += 12;
            year--;
        }

        // Find the century
        int j = year / 100;

        // Find year of century
        int k = year % 100;

        // Calculate day of week
        int h = (q + (26 *(m + 1) / 10) + k + (k/4) + (j / 4) + (5 * j)) % 7;

        // Declare a variable for day of week to avoid repeatition
        String day = " ";

        // Assign day of week 
        switch (h) {
            case 0:
                day = "Saturday";
                break;
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
        }

        // Display the day of week
        System.out.println("Day of the week is " +day);

        // Close the Scanner
        input.close();
    }
}
