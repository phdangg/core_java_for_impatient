package Chapter8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex5 {
    public static Stream<String> codePoints(String s) {
        return IntStream.iterate(0, i -> i < s.length(), i -> s.offsetByCodePoints(i, 1))
                .mapToObj(i -> s.substring(i, s.offsetByCodePoints(i, 1)));
    }
}
