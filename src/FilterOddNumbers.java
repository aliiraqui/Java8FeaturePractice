// Filter Odd Numbers:Write a Predicate<Integer> that returns true if a number is odd.Use this predicate
// to filter a list of integers and print only the odd numbers.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOddNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> oddNumber = integerList.stream().filter(num -> num % 2 != 0).toList();
        System.out.println(oddNumber);
    }
}
