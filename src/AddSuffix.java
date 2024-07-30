import java.util.Arrays;
import java.util.List;

public class AddSuffix {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Apple", "Chair", "River", "Cloud", "Lamp");
        List<String> appended = stringList.stream().map(string -> string + "!").toList();

        System.out.println(appended);
    }
}
