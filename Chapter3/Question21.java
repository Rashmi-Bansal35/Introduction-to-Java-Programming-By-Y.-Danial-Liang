/*
Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is
    h = ( q + (26(m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j) ) % 7
where
■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).
■ q is the day of the month.
■ m is the month (3: March, 4: April, …, 12: December). January and February are counted as months 13 and 14 of the previous year.
■ j is the century (i.e., year / 100 ).
■ k is the year of the century (i.e., year % 100).
Note that the division in the formula performs an integer division. Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week. 
*/

package Chapter3;
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


    }
}
