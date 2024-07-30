// Write a program in java to String Starts With:Write a Predicate<String> that returns true if a string
// starts with the letter 'b'.Use this predicate to filter a list of strings and print only those starting with 'b'

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StartsWith {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("banana", "apple", "blueberry", "grape", "blackberry", "orange");

        List<String> startsWithB = stringList.stream().filter(num -> num.toLowerCase().startsWith("b")).toList();

        System.out.println(startsWithB);

    }
}
