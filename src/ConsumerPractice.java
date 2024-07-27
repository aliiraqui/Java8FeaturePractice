import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {

        // Method Referencing
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Ali Ahmed Iraqui");
    }
}
