/*
Write a program that displays the following table (note that 1 kilogram is 2.2 pounds):
Kilograms   Pounds
1           2.2
3           6.6
...
197         433.4
199         437.8
*/

package Chapter5;

public class Question3 {
    public static void main(String[] args){
        double pounds = 2.2;
        System.out.println("Kilograms   Pounds");
        for (int i = 1; i < 200; i+= 2){
            System.out.println(i + "        " + String.format("%.1f", i * pounds));
        }
    }
}
