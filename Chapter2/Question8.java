/*
Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT. Revise the program so that it prompts the 
user to enter the time zone offset to GMT and displays the time in the specified time zone. 
*/
package Chapter2;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
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
        long currentHour = totalHours % 24 + (long)offset;
        if (currentHour >= 24) currentHour -= 24;
        if (currentHour < 0) currentHour += 24;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
        input.close();
    }
}
