package Chapter2;

import java.math.BigInteger;

public class SquareSequence implements Sequence<BigInteger> {
    private BigInteger currentValue = BigInteger.ZERO;
    public boolean hasNext() {
        return true;
    }
    public BigInteger next() {
        BigInteger result = currentValue.multiply(currentValue);
        currentValue.add(BigInteger.ONE);
        return result;
    }
}