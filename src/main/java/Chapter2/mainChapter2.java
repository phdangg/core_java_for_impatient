package Chapter2;

import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.io.File;

public class mainChapter2 {
    public static void main(String[] args) {
        IntSequence test = IntSequence.of(1,2,3,4,5);
        System.out.println(test.next());
        System.out.println(test.next());
        System.out.println(test.next());
        IntSequence test2 = IntSequence.constant(1);
        System.out.println(test2.next());
        System.out.println(test2.next());
        //luckySort(new ArrayList<String>(Arrays.asList("1","123","12","1234")),(s1,s2)-> s1.length() - s2.length());
        Greeter gt1 = new Greeter(3,"Phuc 1");
        Greeter gt2 = new Greeter(3,"Phuc 2");
        Thread gt1Thread = new Thread(gt1);
        Thread gt2Thread = new Thread(gt2);
        gt1Thread.start();
        gt2Thread.run();
        File[] files = {new File("/path/to/dir2"), new File("/path/to/file3.txt"), new File("/path/to/dir1"), new File("/path/to/file1.txt")};

        // Sorting the array using a lambda expression for Comparator
        Arrays.sort(files, (file1, file2) -> {
            // Directories come before files
            if (file1.isDirectory() && !file2.isDirectory()) {
                return -1;
            } else if (!file1.isDirectory() && file2.isDirectory()) {
                return 1;
            } else {
                // Within each group, elements are sorted by path name
                return file1.getAbsolutePath().compareTo(file2.getAbsolutePath());
            }
        });

        // Print the sorted array
        System.out.println("Sorted Files:");
        for (File file : files) {
            System.out.println(file.getAbsolutePath() + (file.isDirectory() ? " [Directory]" : ""));
        }
    }
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp){
        while (strings.stream().sorted(comp).toList().equals(strings)){
            Collections.shuffle(strings);
        }
        System.out.println("OK");
    }
}
