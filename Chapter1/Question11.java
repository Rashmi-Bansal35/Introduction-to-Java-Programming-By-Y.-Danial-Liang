package Chapter1;
/*
The U.S. Census Bureau projects population based on the following assumptions:
■ One birth every 7 seconds
■ One death every 13 seconds
■ One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and 
one year has 365 days. Hint: In Java, if two integers perform division, the result is an integer. The fractional part is truncated.
For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with the fractional part, one of the values 
involved in the division must be a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */

public class Question11 {
    public static void main(String[] args){
        double secondsInYear = 365 * 24 * 60 * 60;
        double birthInYear = secondsInYear / 7.0;
        double deathInYear = secondsInYear / 13.0;
        double immigrantInYear = secondsInYear / 45.0;
        double netChange = birthInYear + immigrantInYear - deathInYear;

        double CurrentYear = 312032486;
        double population1stYear = CurrentYear + netChange;
        double population2ndYear = population1stYear + netChange;
        double population3rdYear = population2ndYear + netChange;
        double population4thYear = population3rdYear + netChange;
        double population5thYear = population4thYear + netChange;
        System.out.printf("Year 1 population %.3f.\n", population1stYear);
        System.out.printf("Year 2 population %.3f\n", population2ndYear);
        System.out.printf("Year 3 population %.3f\n", population3rdYear);
        System.out.printf("Year 4 population %.3f\n", population4thYear);
        System.out.printf("Year 5 population %.3f\n", population5thYear);
    }
}
