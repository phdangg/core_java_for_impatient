package Chapter7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class Ex8 {
    public static void main(String[] args) {
        Map<String, Set<Integer>> wordMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\W+"); // Split by non-word characters
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordMap.computeIfAbsent(word, k -> new HashSet<>()).add(lineNumber);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the results
        for (Map.Entry<String, Set<Integer>> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs on lines: " + entry.getValue());
        }
    }
}
