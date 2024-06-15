package Chapter5;

import java.io.FileNotFoundException;

public class mainChapter5 {
    public static int factorial(int n) {
        // Create an exception object to capture the current stack trace
        Exception e = new Exception();
        StackTraceElement[] stackTrace = e.getStackTrace();

        // Print the stack trace elements
        System.out.println("Stack frames for factorial(" + n + "):");
        for (StackTraceElement element : stackTrace) {
            System.out.println(element);
        }

        // Base case
        if (n <= 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        //FileHandler fh = new FileHandler();
        //System.out.println(fh.readValues("C:\\Users\\Admin\\git\\core_java_for_impatient\\CoreJavaForImpatient\\src\\main\\java\\Chapter5\\doubleInput.txt").toString());
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);

    }
}
