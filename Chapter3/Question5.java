/*
Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). 
Also prompt the user to enter the number of days after today for a future day and display the future day of the week.
*/

package Chapter3;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter integer for today's day of the week
        System.out.print("Enter today's day: ");
        int todays_day = input.nextInt();

        // Prompt the user to enter number of days
        System.out.print("Enter the number of days elapsed since today: ");
        int future_day = input.nextInt();

        // Calculate the day
        int day = (todays_day + future_day) % 7;

        // Print today's day
        switch (todays_day) {
            case 0:
                System.out.print("Today is Sunday ");
                break;
            case 1:
                System.out.print("Today is Monday ");
                break;
            case 2:
                System.out.print("Today is Tuesday ");
                break;
            case 3:
                System.out.print("Today is Wednesday ");
                break;
            case 4:
                System.out.print("Today is Thursday ");
                break;
            case 5:
                System.out.print("Today is Friday ");
                break;
            case 6:
                System.out.print("Today is Saturday ");
                break;
        }

        // Print future day
        switch (day) {
            case 0:
                System.out.println("and the future day is Sunday.");
                break;
            case 1:
                System.out.println("and the future day is Monday.");
                break;
            case 2:
                System.out.println("and the future day is Tuesday.");
                break;
            case 3:
                System.out.println("and the future day is Wednesday.");
                break;
            case 4:
                System.out.println("and the future day is Thursday.");
                break;
            case 5:
                System.out.println("and the future day is Friday.");
                break;
            case 6:
                System.out.println("and the future day is Saturday.");
                break;
        }

        // Close the Scanner
        input.close();
    }
}
