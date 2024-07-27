import java.util.Arrays;
import java.util.List;

public class LambdaExpressionPractice {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Ali", "Aaryan", "Arhaan", "Soham", "Khayan");

        // For Each 1
        stringList.forEach(System.out::println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        // For Each 2
        integerList.forEach(product -> {
            product = product * 2;
            System.out.println(product);
        });
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        stringList.forEach(LambdaExpressionPractice::display);
    }

    static void display(String string) {
        System.out.println(string);
    }
}
