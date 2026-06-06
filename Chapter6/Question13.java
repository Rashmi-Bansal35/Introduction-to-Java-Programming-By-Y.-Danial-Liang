/*
Write a method to compute the following series:

        m(i) = 1/2 + 2/3 + .... + i/(i+1)
Write a test program that displays the following table:
i       m(i)
1       0.5000
2       1.1667
...
19      16.4023
20      17.3546
*/

package Chapter6;

public class Question13 {
    public static double computeM(int i){
        double value = i + 1;
        return (i / value);
    }
    public static void main(String[] args){
        System.out.println(String.format("%-8s %-8s", "i", "m(i)"));
        double m = 0;
        for(int i = 1; i < 21; i++){
            m += computeM(i);
            System.out.println(String.format("%-8d %-8.4f", i, m));
        }
    }
}
