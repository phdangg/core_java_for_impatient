package Chapter8;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("asa");
        words.add("asa");
        words.add("asaasdasd");
        words.add("asaasdasd");
        words.add("asdasdasd");
        words.add("asdasdasd");
        long before = System.currentTimeMillis();
        long longWord = words.stream().filter(w->w.length() > 5).count();
        long after = System.currentTimeMillis();
        System.out.println("Stream measure: " + (after-before));
        before = System.currentTimeMillis();
        long longWordParallel = words.parallelStream().filter(w->w.length()>5).count();
        after = System.currentTimeMillis();
        System.out.println("Parallel Stream measure: " + (after-before));
    }
}
