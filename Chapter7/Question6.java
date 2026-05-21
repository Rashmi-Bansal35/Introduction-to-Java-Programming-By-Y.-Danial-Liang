/*
Listing 5.15 PrimeNumber.java determines whether a number n is prime by checking whether 2, 3, 4, 5, 6, ..., n/2 is a divisor. If a divisor is found, n is not prime. A more efficient approach is to check whether any of the prime number less than or equal to √n can divide n evenly. If not, n is prime. Rewrite Listing 5.15 to display the first 50 prime numbers using this approach. You need to use an array to store the prime numbers and later use them to check whether they are possible divisors for n.
*/
package Chapter7;

public class Question6 {
    public static void main(String[] args){
        final int NUMBER_OF_PRIMES = 50; 
        final int NUMBER_OF_PRIMES_PER_LINE = 10; 
        int count = 0; 
        int number = 2; 
        int[] primeNumbers = new int[NUMBER_OF_PRIMES];

        System.out.println("The first 50 prime numbers are \n");
        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true; 

            for (int i = 0; i < count && primeNumbers[i] <= Math.sqrt(number); i++) {
                if (number % primeNumbers[i] == 0) { 
                    isPrime = false; 
                    break; 
                }
            }
            if (isPrime) {
                primeNumbers[count] = number; 
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
            number++;
        }
    }
}
