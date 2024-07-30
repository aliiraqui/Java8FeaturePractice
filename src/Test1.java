// Print Strings:
//Write a Consumer<String> that prints a string. Use this consumer to print each string in a list of strings.

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Ali");
        List<String> stringList = Arrays.asList("Ali", "Ahmed", "Ayyan", "Coco", "Yoda");
        stringList.forEach(stringConsumer);
        System.out.println(stringList);
    }
}
