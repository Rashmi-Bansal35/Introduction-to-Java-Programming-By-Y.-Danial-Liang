/*
Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.
*/
package Chapter3;
import java.util.Scanner;

public class Question30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        double offset = input.nextDouble();

        long totalMilliseconds = System.currentTimeMillis();

        // Convert to total seconds
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        // Convert total seconds to total minutes
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        // Convert total minutes to total hours (GMT)
        long totalHours = totalMinutes / 60;
        long gmHour = totalHours % 24;
        long currentHour = (gmHour + (long)offset) % 24;

        // Determine AM or PM
        String amPm = " ";
        if(currentHour < 12){
            amPm = "AM";
        }
        else{
            amPm = "PM";
        }

        // Convert to 12-hour format
        long displayHour = currentHour % 12;
        if (displayHour == 0){
            displayHour = 12;
        }

        // Display the result
        System.out.println("The current time is " + displayHour + ":" + currentMinute + ":" + currentSecond + " " + amPm);

        // Close the Scanner
        input.close();
    }
}
