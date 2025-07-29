package Chapter1;
/*
Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per hour. 
(Note that 1 mile is 1.6 kilometers.)
*/
public class Question10 {
    public static void main(String[] args){
        double distance = 14.0 / 1.6;
        double time = (45.0 + 30.0 / 60) / 60;
        double averageSpeed = distance / time;
        System.out.printf("The average speed is %.2f", averageSpeed);
    }
}