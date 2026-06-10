/**
Programming Exercise 3.32 shows how to test whether a point is on the left side of a directed line, on the right, or on the same line. Write
the methods with the following headers:

/* Return true if point (x2, y2) is on the left side of the directed line from (x0, y0) to (x1, y1) */
//      public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2)

/** Return true if point (x2, y2) is on the same line from (x0, y0) to (x1, y1) */
//      public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2)

/** Return true if point (x2, y2) is on the line segment from (x0, y0) to (x1, y1) */
//        public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2)

/* Write a program that prompts the user to enter the three points for p0, p1, and p2
and displays whether p2 is on the left of the line from p0 to p1, right, the same
line, or on the line segment.
*/

package Chapter6;
import java.util.Scanner;

public class Question39 {
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double check = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return (check > 0);
    }

    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double check = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        return (check == 0);
    }

    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2){
        double check = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (check == 0) {
            boolean xInRange = (x2 >= Math.min(x0, x1) && x2 <= Math.max(x0, x1));
            boolean yInRange = (y2 >= Math.min(y0, y1) && y2 <= Math.max(y0, y1));
            return xInRange && yInRange;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        boolean leftOfTheLine = leftOfTheLine(x0, y0, x1, y1, x2, y2);
        boolean onTheSameLine = onTheSameLine(x0, y0, x1, y1, x2, y2);
        boolean onTheLineSegment = onTheLineSegment(x0, y0, x1, y1, x2, y2);

        if (leftOfTheLine){
            System.out.println("(" + x2 + ", " + y2 +") is on the left side of the line from (" + x0 +  ", " + y0 +") to (" + x1 + ", " + y1 +")");
        }
        else if (onTheLineSegment){
            System.out.println("(" + x2 + ", " + y2 +") is on the line segment from (" + x0 +  ", " + y0 +") to (" + x1 + ", " + y1 +")");
        }
        else if (onTheSameLine){
            System.out.println("(" + x2 + ", " + y2 +") is on the same line from (" + x0 +  ", " + y0 +") to (" + x1 + ", " + y1 +")");
        }
        else {
            System.out.println("(" + x2 + ", " + y2 +") is on the right side of the line from (" + x0 +  ", " + y0 +") to (" + x1 + ", " + y1 +")");
        }

        input.close();
    }
}
