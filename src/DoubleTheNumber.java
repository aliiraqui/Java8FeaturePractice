// Double a Number:Write a Function<Integer, Integer> that takes an integer and returns its double.
// Use this function to transform a list of integers into a list of their doubles.

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DoubleTheNumber {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 1, 7, 9, 3);
        Function<Integer, Integer> integerIntegerFunction = num -> num * 2;
        List<Integer> integerList1 = integerList.stream().map(integerIntegerFunction).toList();
        System.out.println(integerList1);
    }
}
