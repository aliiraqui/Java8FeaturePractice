import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {

        // Lambda Expression
        Function<String, Integer> stringIntegerFunction = (String s) -> s.length();
        Integer length = stringIntegerFunction.apply("Ali");
        System.out.println(length);

        // Method Referencing (::)
        Function<String, Integer> stringIntegerFunction1 = String::length;
        Integer length1 = stringIntegerFunction1.apply("Ahmed");
        System.out.println(length1);
    }
}
