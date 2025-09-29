/*
Find the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from www.gps-data-team.com/map/ and compute the estimated area enclosed by these four cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the distance between two cities. Divide the polygon into two triangles and use the formula in Programming Exercise 2.19 to compute the area of a triangle.)

Coordinates of Atlanta:- 33.7501° N, 84.3885° W
Coordinates of Orlando:- 28.5384° N, 81.3789° W
Coordinates of Savannah:- 32.0809° N, 81.0912° W
Coordinates of Charlotte:- 35.2216° N, 80.8401° W

               s = (distance1 + distance2 + distance3)/2;
               area = √(s(s- distance1)(s- distance2)(s- distance3))
*/

package Chapter4;

public class Question3 {
    public static void main(String[] args){
        // Assign coordinates
        double xAtlanta = 33.7501, yAtlanta = 84.3885;
        double xOrlando = 28.5384, yOrlando = 81.3789;
        double xSavannah = 32.0809, ySavannah = 81.0912;
        double xCharlotte = 35.2216, yCharlotte = 80.8401;

        // Average Earth Radius
        final double RADIUS = 6371.01;

        // Calculate distance between Atlanta and Orlando
        double distanceAO = RADIUS * Math.acos(Math.sin(Math.toRadians(xAtlanta)) *  Math.sin(Math.toRadians(xOrlando)) + Math.cos(Math.toRadians(xAtlanta)) * Math.cos(Math.toRadians(xOrlando)) * Math.cos(Math.toRadians(yAtlanta - yOrlando)));

        // Calculate distance between Orlando and Savannah
        double distanceOS = RADIUS * Math.acos(Math.sin(Math.toRadians(xOrlando)) *  Math.sin(Math.toRadians(xSavannah)) + Math.cos(Math.toRadians(xOrlando)) * Math.cos(Math.toRadians(xSavannah)) * Math.cos(Math.toRadians(yOrlando - ySavannah)));

        // Calculate distance between Savannah and Charlotte
        double distanceSC = RADIUS * Math.acos(Math.sin(Math.toRadians(xSavannah)) *  Math.sin(Math.toRadians(xCharlotte)) + Math.cos(Math.toRadians(xSavannah)) * Math.cos(Math.toRadians(xCharlotte)) * Math.cos(Math.toRadians(ySavannah - yCharlotte)));

        // Calculate distance between Charlotte and Atlanta
        double distanceCA = RADIUS * Math.acos(Math.sin(Math.toRadians(xCharlotte)) *  Math.sin(Math.toRadians(xAtlanta)) + Math.cos(Math.toRadians(xCharlotte)) * Math.cos(Math.toRadians(xAtlanta)) * Math.cos(Math.toRadians(yCharlotte - yAtlanta)));

        // Calculate distance between Atlanta and Savannah
        double distanceAS = RADIUS * Math.acos(Math.sin(Math.toRadians(xAtlanta)) *  Math.sin(Math.toRadians(xSavannah)) + Math.cos(Math.toRadians(xAtlanta)) * Math.cos(Math.toRadians(xSavannah)) * Math.cos(Math.toRadians(yAtlanta - ySavannah)));

        // Triangle 1 Atlanta-Orlando-Savannah
        double s1 = (distanceAO + distanceOS + distanceAS)/2;
        double areaAOS = Math.sqrt(s1 * (s1 - distanceAO) * (s1 - distanceOS) * (s1 - distanceAS));

        // Triangle 2 Atlanta-Charlotte-Savannah
        double s2 = (distanceCA + distanceSC + distanceAS)/2;
        double areaACS = Math.sqrt(s2 * (s2 - distanceCA) * (s2 - distanceSC) * (s2 - distanceAS));

        // Display the result
        System.out.println("Area of triangle Atlanta-Orlando-Savannah: " +areaAOS);
        System.out.println("Area of triangle Atlanta-Charlotte-Savannah: " +areaACS);
        System.out.println("Total area enclosed: " +(areaAOS + areaACS));
    }
}
