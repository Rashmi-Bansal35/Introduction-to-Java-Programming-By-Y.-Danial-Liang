/*
Write a program that displays the following two tables side by side:
Kilograms   Pounds | Pounds     Kilograms
1           2.2    | 20         9.09
3           6.6    | 25         11.36
...
197         433.4  | 510        231.82
199         437.8  | 515        234.09
*/
package Chapter5;

public class Question5 {
    public static void main(String[] args){
        System.out.println(String.format("%-12s %-12s | %-12s %-12s", "Kilograms", "Pounds", "Pounds", "Kilograms"));
        for (int kg = 1, pounds = 20; kg <= 199; kg += 2, pounds += 5) {
            System.out.println(String.format("%-12d %-12.1f | %-12d %-12.2f", kg, (kg * 2.2), pounds, (pounds / 2.2)));
        }
    }
}