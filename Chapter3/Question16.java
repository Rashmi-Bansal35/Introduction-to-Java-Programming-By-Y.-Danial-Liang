/*
Write a program that displays a random coordinate in a rectangle. The rectangle is centered at (0, 0) with width 100 and height 200.
*/

package Chapter3;

public class Question16 {
    public static void main(String[] args){
        // Width of rectangle from center
        int minWidth = -50, maxWidth = 50;

        // Height of rectangle from center
        int minLength = -100, maxLength = 100;

        // Generate random coordinate within width
        int widthCoordinate = (int)(Math.random()*(maxWidth-minWidth+1) + minWidth);

        // Generate random coordinate within length
        int lengthCoordinate = (int)(Math.random()*(maxLength-minLength+1) + minLength);

        System.out.println("The coordinates in rectangle are (" + widthCoordinate + "," + lengthCoordinate +")");
    }
}
