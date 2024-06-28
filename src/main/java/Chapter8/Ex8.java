package Chapter8;

import java.util.stream.Stream;

public class Ex8 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .mapMulti((integer, downstream) -> {
                    downstream.accept(integer * 2);
                    downstream.accept(integer * 3);
                })
                .forEach(System.out::println);
    }
}
