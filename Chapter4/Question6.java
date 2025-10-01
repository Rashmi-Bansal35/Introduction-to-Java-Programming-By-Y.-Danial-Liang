/*
Write a program that generates three random points on a circle centered at (0, 0) with radius 40 and display three angles in a triangle formed by these three points, as shown in Figure 4.7a. (Hint: Generate a random angle a in radians between 0 and 2PI, as shown in Figure 4.7b and the point determined by this angle is (r*cos(a), r*sin(a)).)
*/

package Chapter4;

public class Question6 {
    public static void main(String[] args){
        int radius = 40;

        // Generate random angles 
        double angle1 = Math.random() * (360);
        double angle2 = Math.random() * (360);
        double angle3 = Math.random() * (360);

        // Find points 
        double x1 = radius * Math.cos(Math.toRadians(angle1));
        double y1 = radius * Math.sin(Math.toRadians(angle1));
        double x2 = radius * Math.cos(Math.toRadians(angle2));
        double y2 = radius * Math.sin(Math.toRadians(angle2));
        double x3 = radius * Math.cos(Math.toRadians(angle3));
        double y3 = radius * Math.sin(Math.toRadians(angle3));

        // Display the points
        System.out.printf("The point 1 is (%.2f, %.2f)\n", x1, y1);
        System.out.printf("The point 2 is (%.2f, %.2f)\n", x2, y2);
        System.out.printf("The point 3 is (%.2f, %.2f)\n", x3, y3);
    }
}
