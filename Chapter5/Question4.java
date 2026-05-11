/*
Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
Miles   Kilometers
1       1.609
2       3.218
...
9       14.481
10      16.090
*/

package Chapter5;

public class Question4 {
    public static void main(String[] args){
        double km = 1.609;
        System.out.println("Miles   Kilometers");
        for (int i = 1; i < 11; i++){
            System.out.println(i + "      " + String.format("%.3f", (i * km)));
        }
    }
}