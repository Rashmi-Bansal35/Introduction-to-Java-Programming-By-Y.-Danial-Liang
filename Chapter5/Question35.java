/*      Problem Statement
Write a program to compute the following summation.
        1/(1 + √2)    +     1/(2 + √3)     +    1/(3 + √4)   +   . .  .  +  1/(624 + √625)
        
*/

package Chapter5;

public class Question35 {
    public static void main(String[] args){
        double summation = 0;
        for(int i = 1; i < 625; i++){
            summation += 1.0 / (i + (Math.sqrt(i+1)));
        }

        System.out.print(String.format("%.3f",summation));
    }
}
