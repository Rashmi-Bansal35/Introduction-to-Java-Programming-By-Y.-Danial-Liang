/*
Write a program that simulates flipping a coin one million times and displays the number of heads and tails.
*/
package Chapter5;

public class Question40 {
    public static void main(String[] args){
        int value = 1_000_000;
        int head = 0, tails = 0;
        for(int i = 0; i < value; i++){
            int toss = (int) (Math.random() * 2);
            if (toss == 0){
                head++;
            }
            else{
                tails++;
            }
        }
        System.out.println("The number of heads: " + head + "\nThe number of tails: " + tails);
    }
}
