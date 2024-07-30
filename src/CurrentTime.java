// Current Time:Write a Supplier<LocalTime> that returns the current time.Use this supplier to print the
// current time.

import java.time.LocalTime;
import java.util.function.Supplier;

public class CurrentTime {
    public static void main(String[] args) {
        Supplier<LocalTime> localTimeSupplier = LocalTime::now;

        System.out.println(LocalTime.now());
    }
}
