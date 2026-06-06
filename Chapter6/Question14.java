/*
pi can be computed using the following series:
        m(i) = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - ..... + (-1)^(i + 1)/(2i- 1 ))
Write a method that returns m(i) for a given i and write a test program that displays the following table:
i          m(i)
1          4.0000
101        3.1515
201        3.1466
301        3.1449
401        3.1441
501        3.1436
601        3.1433
701        3.1430
801        3.1428
901        3.1427
*/

package Chapter6;

public class Question14 {
    public static double computePi(int i) {
    double value = 0;
    for (int j = 1; j <= i; j++) {
        if (j % 2 == 0)
            value -= 1.0 / (2 * j - 1);
        else
            value += 1.0 / (2 * j - 1);
    }
    return 4 * value;
}

    public static void main(String[] args){
        System.out.println(String.format("%-8s  %-8s", "i", "m(i)"));
        double m = 0;
        for(int i = 1; i < 902; i += 100){
            m = computePi(i);
            System.out.println(String.format("%-8d  %-8.4f", i, m));
        }
    }
}
