/*
Write a program that displays the following two tables side by side:
Miles   Kilometers | Kilometers     Miles
1       1.609      | 20             12.432 
2       3.218      | 25             15.53
...
9       14.481     | 60             37.2910 
10      16.090     | 65             40.39
*/
package Chapter5;

public class Question6 {
    public static void main(String[] args){
        System.out.println(String.format("%-10s %-12s  | %-12s  %-10s", "Miles", "Kilometers", "Kilometers", "Miles"));
        for (int miles = 1, km = 20; miles < 11; miles++, km += 5){
            System.out.println(String.format("%-10d  %-12.3f | %-12d  %-10.3f", miles, miles * 1.609, km, (km/1.609)));
        }
    }
}
