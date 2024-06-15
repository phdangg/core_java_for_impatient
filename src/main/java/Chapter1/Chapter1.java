package Chapter1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Chapter1 {
    public static void main(String[] args) {
        // 1. Write a program that reads an integer and prints it in binary, octal,
        //and hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
        Scanner sc = new Scanner(System.in);
        int input = 4;
        System.out.println(Integer.toString(input,2));
        System.out.println(Integer.toString(input,8));
        System.out.println(Integer.toString(input,16));
        // 2. Write a program that reads an integer angle (which may be positive
        //or negative) and normalizes it to a value between 0 and 359
        //degrees. Try it first with the % operator, then with floorMod.
        int result = 0;
        result = input % 359;
        if (input < 0) {
            result = input % 359 + 359;
        }
        System.out.println(result);
        System.out.println(Math.floorMod(input,359));
        // 3. Using only the conditional operator, write a program that reads
        //three integers and prints the largest. Repeat with Math.max.
        int input_1 = 1;
        int input_2 = 2;
        int input_3 = 3;
        result = input_1 > input_2 ? input_1 > input_3 ? input_1 : input_3 :
                input_1  > input_3 ? input_2 : input_2 > input_3 ? input_2 : input_3;
        System.out.println(result);
        // 4. Write a program that prints the smallest and largest positive double
        //values. Hint: Look up Math.nextUp in the Java API.
        System.out.println(Math.nextUp(0.0));
        // 5. What happens when you cast a double to an int that is larger than
        //the largest possible int value? Try it out.
        double d = 100000000000.05;
        int i =  (int)d;
        System.out.println(i);
        System.out.println(d);
        // 7. Write a program that reads in two integers between 0 and
        //4294967295, stores them in int variables, and computes and
        //displays their unsigned sum, difference, product, quotient, and
        //remainder. Do not convert them to long values.
        // 8. Write a program that reads a string and prints all of its nonempty
        //substrings.

//        Math.pow(1,2);
//        LocalDate date = new LocalDate.of(2024,5,5);
//        date.plusDays(1);
//        Random random = new Random();
//        random.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);

    }
}
