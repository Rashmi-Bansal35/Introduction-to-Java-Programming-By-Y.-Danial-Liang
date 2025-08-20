/*
Assume a runner runs 24 miles in 1 hour, 40 minutes,and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)
 */

package Chapter1;

public class Question12 {
    public static void main(String[] args){
        double distance = 24.0 * 1.6;
        double time = 1 + (40.0 + 35.0 / 60) / 60;
        double averageSpeed = distance / time;

        System.out.println("The average speed is " +averageSpeed);
    }
}
