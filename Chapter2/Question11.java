/*
Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and displays the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program. The population should be cast into an integer.
*/
package Chapter2;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int secondsInYear = 365 * 24 * 60 * 60;
        int birthInYear = secondsInYear / 7;
        int deathInYear = secondsInYear / 13;
        int immigrantInYear = secondsInYear / 45;
        int netChange = birthInYear + immigrantInYear - deathInYear;

        int CurrentYear = 312032486;
        int toatlChange = netChange * years;
        int futurePopulation = CurrentYear + toatlChange;
        System.out.println("The population in " +years+ " is: " +futurePopulation);
        input.close();
    }
}