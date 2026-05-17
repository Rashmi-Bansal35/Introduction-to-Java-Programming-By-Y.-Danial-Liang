/*
Write a class that contains the following two methods:
    Convert from feet to meters: public static double footToMeter(double foot)
    Convert from meters to feet: public static double meterToFoot(double meter)
The formula for the conversion is:
        meter = 0.305 * foot
        foot = 3.279 * meter
Write a test program that invokes these methods to display the following tables:
Feet        Meters  |    Meters         Feet
1.0         0.305   |    20.0           65.574
2.0         0.610   |    25.0           81.967
...
9.0         2.745   |    60.0           196.721
10.0        3.050   |    65.0           213.115
*/
package Chapter6;

public class Question9 {
    public static double footToMeter(double foot){
        double meter = 0.305 * foot;
        return meter;
    }
    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        return foot;
    }
    public static void main(String[] args){
        System.out.println(String.format("%-12s     %-12s | %-12s     %-12s", "Feet", "Meters", "Meters", "Feet"));
        double feet = 0, meters = 0;
        for (double f = 1.0, m = 20.0; f <= 10.0; f++ , m += 5){
            feet = meterToFoot(m);
            meters = footToMeter(f);
            System.out.println(String.format("%-12.1f     %-12.3f | %-12.1f     %-12.3f", f, meters, m, feet));
        }
    }
}
