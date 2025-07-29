package Chapter1;
/*
Write a program that displays the result of
(9.5 * 4.5- 2.5 * 3)/(45.5- 3.5).
 */
public class Question5 {
    public static void main(String[] args){
        double numerator = 9.5 * 4.5 - 2.5 * 3;
        double denominator = 45.5 - 3.5;
        double result = numerator / denominator;
        System.out.println("The result is "+result+ ".");
    }
}
