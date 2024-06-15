package Chapter7;

import java.util.HashSet;
import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println(set1.removeAll(set2));
        System.out.println(set1);
        System.out.println(set2);

    }
}
