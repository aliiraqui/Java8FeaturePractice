public class MainFunctionalInterfacePractice {
    public static void main(String[] args) {
        FunctionalInterfacePractice interfacePractice = (n1, n2) -> {
            int sum = n1 + n2;
            System.out.println("Sum: " + sum);
            return "Completed";
        };
        String add = interfacePractice.add(10, 10);
        System.out.println(add);
    }
}
