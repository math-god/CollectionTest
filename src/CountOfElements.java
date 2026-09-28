import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOfElements {

    public static void main(String[] args) {
        String[] strings = {"123", "123", "444"};

        System.out.println(new CountOfElements().countOfElements(strings));
    }

    public Map<String, Integer> countOfElements(String[] strings) {
        return Stream.of(strings).collect(Collectors.toMap(x -> x, _ -> 1, Integer::sum));
    }
}
