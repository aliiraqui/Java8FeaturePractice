import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesPracticeProblems {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        filterEvenNumber();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        checkStringLength();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        validateAge();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        printListOfElement();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        currentDate();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        squaredNumbers();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        stringToInteger();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        upperCaseConversion();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Predicate ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    static void filterEvenNumber() {
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> integerPredicate = (num) -> num % 2 == 0;
        List<Integer> filterEvenNumber = integerList.stream().filter(integerPredicate).toList();
        System.out.println(filterEvenNumber);
    }

    static void checkStringLength() {
        List<String> fruits = Arrays.asList("Mango", "Guava", "Lychee", "Pomegranate", "Banana");
        Predicate<String> fruitPredicate = (string) -> string.length() > 5;
        List<String> checkStringLengthList = fruits.stream().filter(fruitPredicate).toList();
        System.out.println(checkStringLengthList);
    }

    static void validateAge() {
        List<Integer> integerList = Arrays.asList(22, 35, 47, 58, 72);
        Predicate<Integer> integerPredicate = (num) -> num > 46;
        List<Integer> validateAgeList = integerList.stream().filter(integerPredicate).toList();
        System.out.println(validateAgeList);
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Consumer ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    static void printListOfElement() {
        List<String> fruits = Arrays.asList("Papaya", "Custard Apple", "Jack Fruit", "Chikoo", "Tamarind");
        Consumer<String> stringConsumer = System.out::println;
        fruits.forEach(stringConsumer);
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Supplier ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    static void currentDate() {
        Supplier<LocalDate> currentDateSupplier = LocalDate::now;
        System.out.println(currentDateSupplier.get());
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Function ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    static void squaredNumbers() {
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Function<Integer, Integer> integerIntegerFunction = (num) -> num * num;
        List<Integer> squaredNumbersList = integerList.stream().map(integerIntegerFunction).toList();
        System.out.println(squaredNumbersList);
    }

    static void stringToInteger() {
        List<String> stringList = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        Function<String, Integer> stringIntegerFunction = Integer::parseInt;
        List<Integer> stringToIntegerList = stringList.stream().map(stringIntegerFunction).toList();
        System.out.println(stringToIntegerList);
    }

    static void upperCaseConversion() {
        List<String> fruits = Arrays.asList("Amla", "Ripe Fig", "Langda Mango", "Ber", "Kokum");
        Function<String, String> stringStringFunction = String::toUpperCase;
        List<String> upperCaseConversionList = fruits.stream().map(stringStringFunction).toList();
        System.out.println(upperCaseConversionList);
    }
}