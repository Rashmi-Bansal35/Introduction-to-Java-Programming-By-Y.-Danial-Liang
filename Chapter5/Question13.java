/*
Use a while loop to find the largest integer n such that n3 is less than 12,000.
*/
package Chapter5;

public class Question13 {
    public static void main(String[] args){
        int i = 1;
        while (Math.pow(i, 3) < 12000){
            i++;
        }
        System.out.println("The largest integer is " + (i-1) + " whose n^3 is less than 12,000");
    }
}
