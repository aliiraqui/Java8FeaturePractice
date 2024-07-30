import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsPractiseProblem {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        sumOfEvenNumbers();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        filterAndCollectSting();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        convertToUpperCase();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        findMax();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        countEmptyString();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        sortAndCollect();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        groupByLength();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        sumOfSquares();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void sumOfEvenNumbers() {
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumber = integerList.stream().filter(num -> num % 2 == 0).toList();
        IntStream mappedToInt = evenNumber.stream().mapToInt(Integer::intValue);
        int sum = mappedToInt.sum();
        System.out.println(sum);
    }

    public static void filterAndCollectSting() {
        List<String> fruits = Arrays.asList("Mango", "Guava", "Papaya", "Pomegranate", "Amla");
        List<String> startsWithA = fruits.stream().filter(fruit -> fruit.toLowerCase().startsWith("a")).toList();
        System.out.println(startsWithA);
    }

    public static void convertToUpperCase() {
        List<String> fruits = Arrays.asList("Banana", "Lychee", "Chikoo", "Custard Apple", "JackFruit");
        List<String> upperCase = fruits.stream().map(String::toUpperCase).toList();
        System.out.println(upperCase);
    }

    public static void findMax() {
        List<Integer> numbers = Arrays.asList(7, 23, 46, 81, 92);
        Optional<Integer> largestNumber = numbers.stream().max(Integer::compare);
        System.out.println(largestNumber);
    }

    public static void countEmptyString() {
        List<String> fruits = Arrays.asList("Mango", "", "Guava", "Papaya", "", "Pomegranate", "", "Custard Apple");
        long count = fruits.stream().filter(String::isEmpty).count();
        System.out.println(count);

    }

    public static void sortAndCollect() {
        List<String> fruits = Arrays.asList("Chikoo", "Amla", "Jack Fruit", "Tamarind", "Langda Mango");
        List<String> sortedList = fruits.stream().sorted().toList();
        System.out.println(sortedList);
    }

    public static void groupByLength() {
        List<String> fruits = Arrays.asList("Star Fruit", "Kokum", "Bael Fruit", "Ber");
        Map<Integer, List<String>> groupByLength = fruits.stream().collect(Collectors.groupingBy(String::length));
        for (List<String> collect : groupByLength.values()) {
            System.out.println(collect);
        }


    }

    public static void sumOfSquares() {
        List<Integer> integerList = Arrays.asList(7, 42, 86, 23, 59);
        int sum = integerList.stream().map(num -> num * num).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
