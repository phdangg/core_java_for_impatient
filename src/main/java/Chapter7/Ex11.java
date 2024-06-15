package Chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex11 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Circle","K","Xin","Chao","Ban","Nha"));
        Collections.shuffle(words.subList(1,words.size()-2));
        System.out.println(words);
    }
}
