package Chapter7;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex7 {
    public static void main(String[] args) {
        Map<String, Integer> occurence = new TreeMap<>();
        try (var in = new Scanner(Path.of("input.txt"))) {
            while (in.hasNext()){
                String key = in.next();
                occurence.merge(key,1,Integer::sum);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(occurence);
    }
}
