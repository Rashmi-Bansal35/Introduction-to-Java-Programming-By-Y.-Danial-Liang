/*
Write a program that generates 100 random integers between 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
*/
package Chapter7;

public class Question7 {
    public static void main(String[] args){
        int[] array = new int[10];
        for (int i = 0; i < 100; i++){
            int random = (int)(Math.random()*10);
            array[random]++;
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(i +" appears " + array[i] + (array[i] > 1? " times": " time."));
        }
    }
}
