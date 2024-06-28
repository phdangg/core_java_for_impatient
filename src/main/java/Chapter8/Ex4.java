package Chapter8;

import java.util.stream.Stream;

public class Ex4 {
    public static Stream<Long> infiniteStream(long a, long c, long m, long seed){
        return Stream.iterate(seed,x->(a*x+c)%m);
    }

    public static void main(String[] args) {
        Stream<Long> infiniteStream = infiniteStream(2,0,9,1);
        infiniteStream.limit(20).forEach(System.out::println);
    }
}
