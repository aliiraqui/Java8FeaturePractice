// Default Farewell:Write a Supplier<String> that returns a default farewell message "Goodbye!".Use this
// supplier to generate a list of 5 default farewell messages.

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class DefaultFarewell {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Goodbye!";

        List<String> stringList = Stream.generate(stringSupplier).limit(5).toList();
        System.out.println(stringList);
    }
}
