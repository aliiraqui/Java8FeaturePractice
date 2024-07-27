import java.util.function.Supplier;

public class SupplierPractice {
    public static void main(String[] args) {

        // Method Referencing
        Supplier<Double> doubleSupplier = Math::random;
        Double randomVal = doubleSupplier.get();
        System.out.println(randomVal);
        
    }
}
