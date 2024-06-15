package Chapter7;

import java.util.*;

public class Ex1 {
    private static void sieveofErathostenes(int s, int n, boolean[] isPrime){
        for (int i = s*s; i <= n; i += s){
            isPrime[i] = true;
        }
    }
    private static void sieveofErathostenes(int s, int n, BitSet isPrime){
        for (int i = s*s; i <= n; i += s){
            isPrime.set(i);
        }
    }
    public static Set<Integer> findPrimeNumberWithHashSet(int n){
        boolean[] isPrime = new boolean[n+1];
        Set<Integer> setOfPrimeNumber = new HashSet<>();

        for (int i = 2; i <= Math.sqrt(n); i++){
            sieveofErathostenes(i,n, isPrime);
        }
        for (int i = 2; i <= n; i++)
            if (!isPrime[i])
                setOfPrimeNumber.add(i);

        return setOfPrimeNumber;
    }
    public static Set<Integer> findPrimeNumberWithBitSet(int n){
        BitSet isPrime = new BitSet(n+1);

        for (int i = 2; i <= Math.sqrt(n); i++){
            sieveofErathostenes(i, n, isPrime);
        }

        Set<Integer> setOfPrimeNumber = new HashSet<>();
        for (int i = 2; i < n; i++){
            if (!isPrime.get(i))
                setOfPrimeNumber.add(i);
        }

        return setOfPrimeNumber;
    }

    public static void main(String[] args) {
        System.out.println(findPrimeNumberWithBitSet(200));
    }
}
