/*
Write a class that contains the following two methods:
    Convert from Celsius to Fahrenheit: public static double celsiusToFahrenheit(double celsius)
    Convert from Fahrenheit to Celsius: public static double fahrenheitToCelsius(double fahrenheit)
The formula for the conversion is:
    fahrenheit = (9.0 / 5) * celsius + 32
    celsius = (5.0 / 9) * (fahrenheit – 32)
Write a test program that invokes these methods to display the following tables:
Celsius     Fahrenheit   | Fahrenheit     Celsius
40.0          104.0      | 120.0          48.8
39.0          102.2      | 110.0          43.3
....
32.0          89.6       | 40.0           4.44
31.0          87.8       | 30.0           -1.11
*/
package Chapter6;

public class Question8 {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args){
        double celsius = 0, fahrenheit = 0;
        System.out.println(String.format("%-12s     %-12s   | %-12s     %-12s", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius"));
        for (double c = 40.0, f = 120.0; c > 30.0; c--, f -= 10){
            fahrenheit = celsiusToFahrenheit(c);
            celsius = fahrenheitToCelsius(f);
            System.out.println(String.format("%-12.1f     %-12.1f   | %-12.1f     %-12.2f", c, fahrenheit, f, celsius));
        }
    }
}
