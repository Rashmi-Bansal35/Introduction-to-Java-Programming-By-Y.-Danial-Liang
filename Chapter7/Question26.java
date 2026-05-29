/*      Problem Statement
The arrays list1 and list2 are strictly identical if their corresponding elements are equal. Write a method that returns true if list1 and list2 are strictly identical, using the following header:
        public static boolean equals(int[] list1, int[] list2)
Write a test program that prompts the user to enter two lists of integers and displays whether the two are strictly identical. Here are the sample runs. Note that the first number in the input indicates the number of the elements in the list. This number is not part of the list.
        Sample Run
        Enter list1: 5 2 5 6 1 6
        Enter list2: 5 2 5 6 1 6
        Two lists are strictly identical
*/

package Chapter7;
import java.util.Scanner;

public class Question26 {
    public static boolean equals(int[] list1, int[] list2){
        if(list1.length == list2.length){
            for(int i = 0; i < list1.length; i++){
                if(list1[i] != list2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int list1Size = input.nextInt();
        int[] list1 = new int[list1Size];
        for(int i = 0; i < list1.length; i++){
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int list2Size = input.nextInt();
        int[] list2 = new int[list2Size];
        for(int i = 0; i < list2.length; i++){
            list2[i] = input.nextInt();
        }

        boolean result = equals(list1, list2);
        System.out.println(result? "Two lists are strictly identical." : "Two lists are not strictly identical.");

        input.close();
    }
}
