package Chapter8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {
    public static void main(String[] args) {
        int[] values = { 1, 4, 9, 16};
        int[] values2 = { 1, 4, 9, 16};
        Stream<int[]> s = Stream.of(values,values2);
        IntStream intStream = IntStream.of(1,4,9,16);

    }
}
