import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 1, 7, 9, 3);

        // Single Line Code
        integerList.forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        // Multi Line Code
        integerList.forEach(integer -> {
            System.out.println(integer);
        });
    }


}
