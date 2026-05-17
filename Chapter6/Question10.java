/*
Listing 6.7, PrimeNumberMethod.java, provides the isPrime(int number) method for testing whether a number is prime. Use this method to find the number of prime numbers less than 10000.
*/

package Chapter6;

public class Question10 {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { 
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args){
        int count = 0;
        for (int i = 2; i < 10000; i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println("The number of prime numbers less than 10000 are: " + count);
    }
}
