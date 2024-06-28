package Chapter8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex7 {
    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";

        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            List<String> first100Words = lines
                    .flatMap(line -> Arrays.stream(line.split("\\W+"))) // Split by non-word characters
                    .filter(Ex7::isWord) // Filter to keep only valid words
                    .limit(100) // Limit to the first 100 words
                    .toList();

            System.out.println("First 100 words:");
            first100Words.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            Map<String, Long> wordFrequency = lines
                    .flatMap(line -> Arrays.stream(line.split("\\W+"))) // Split by non-word characters
                    .filter(Ex7::isWord) // Filter to keep only valid words
                    .map(String::toLowerCase) // Convert to lowercase to ignore case
                    .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

            List<Map.Entry<String, Long>> top10Words = wordFrequency.entrySet().stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue().reversed()) // Sort by frequency, descending
                    .limit(10) // Limit to the top 10
                    .toList();

            System.out.println("Top 10 most frequent words:");
            top10Words.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to check if a string is a valid word (consists only of letters)
    public static boolean isWord(String s) {
        return s.codePoints().allMatch(Character::isAlphabetic);
    }
}
