package Chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> longWordList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (longWordList.size() < 5){
            String word = sc.next();
            longWordList.add(word);
            longWordList = longWordList.stream().filter(s->s.length() > 5).collect(Collectors.toCollection(ArrayList::new));
            System.out.println(longWordList);
        }
    }
}
