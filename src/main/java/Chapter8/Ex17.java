package Chapter8;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Stream;

public class Ex17 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        List<BigInteger> primeNumbers = Stream.generate(() -> BigInteger.probablePrime(166, new java.util.Random()))
                .filter(bi -> bi.isProbablePrime(100)) // Adjust certainty as needed
                .limit(500)
                .toList();

        long endTime = System.currentTimeMillis();

        System.out.println("Found " + primeNumbers.size() + " prime numbers in " + (endTime - startTime) + " milliseconds.");
        // Uncomment to print the prime numbers found
        // primeNumbers.forEach(System.out::println);
    }
}
