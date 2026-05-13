/*
Suppose that the tuition for a university is $10,000 this year and increases 5% every year. In one year, the tuition will be $10,500. Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.
*/
package Chapter5;

public class Question7 {
    public static void main(String[] args){
        double tuition = 10000;
        double totalCost = 0;

        for (int i = 1; i <= 10; i++){
            tuition = tuition * 1.05;
        }
        System.out.println("Tuition after 10 years: " + String.format("%.3f",tuition));

        for (int i = 1; i <= 4; i++) {
            tuition = tuition * 1.05; 
            totalCost += tuition;     
        }
        System.out.println("Total cost for 4 years after 10th year: " + String.format("%.3f", totalCost));    
    }
}