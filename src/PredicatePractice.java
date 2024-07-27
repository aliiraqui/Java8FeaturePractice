import java.util.function.Predicate;

public class PredicatePractice {
    public static void main(String[] args) {

        // Lambda Expression
        Predicate<Integer> integerPredicate = (Integer i) -> i.equals(5);
        boolean isEquals = integerPredicate.test(5);
        System.out.println(isEquals);

        // Method Referencing (::)
        Predicate<String> stringPredicate = String::isEmpty;
        boolean isEmpty = stringPredicate.test("Ali");
        System.out.println(isEmpty);
    }
}
